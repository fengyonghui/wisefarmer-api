package cn.wisefarmer.base.core.base.service.impl;

import cn.wisefarmer.base.core.base.mapper.BaseCommonMapper;
import cn.wisefarmer.base.core.base.service.BaseCommonService;
import cn.wisefarmer.base.core.common.api.dto.LogDTO;
import cn.wisefarmer.base.core.common.system.vo.LoginUser;
import cn.wisefarmer.base.core.common.util.IpUtils;
import cn.wisefarmer.base.core.common.util.SpringContextUtils;
import cn.wisefarmer.base.core.common.util.oConvertUtils;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @Description: common实现类
 * @author: wisefarmer
 */
@Service
@Slf4j
public class BaseCommonServiceImpl implements BaseCommonService {

    @Resource
    private BaseCommonMapper baseCommonMapper;

    @Override
    public void addLog(LogDTO logDTO) {
        if(oConvertUtils.isEmpty(logDTO.getId())){
            logDTO.setId(String.valueOf(IdWorker.getId()));
        }
        //保存日志（异常捕获处理，防止数据太大存储失败，导致业务失败）JT-238
        try {
            logDTO.setCreateTime(new Date());
            baseCommonMapper.saveLog(logDTO);
        } catch (Exception e) {
            log.warn(" LogContent length : "+logDTO.getLogContent().length());
            log.warn(e.getMessage());
        }
    }

    @Override
    public void addLog(String logContent, Integer logType, Integer operatetype, LoginUser user) {
        LogDTO sysLog = new LogDTO();
        sysLog.setId(String.valueOf(IdWorker.getId()));
        //注解上的描述,操作日志内容
        sysLog.setLogContent(logContent);
        sysLog.setLogType(logType);
        sysLog.setOperateType(operatetype);
        try {
            //获取request
            HttpServletRequest request = SpringContextUtils.getHttpServletRequest();
            //设置IP地址
            sysLog.setIp(IpUtils.getIpAddr(request));
        } catch (Exception e) {
            sysLog.setIp("127.0.0.1");
        }
        //获取登录用户信息
        if(user==null){
            try {
                user = (LoginUser) SecurityUtils.getSubject().getPrincipal();
            } catch (Exception e) {
                //e.printStackTrace();
            }
        }
        if(user!=null){
            sysLog.setUserid(user.getUsername());
            sysLog.setUsername(user.getRealname());
        }
        sysLog.setCreateTime(new Date());
        //保存日志（异常捕获处理，防止数据太大存储失败，导致业务失败）JT-238
        try {
            baseCommonMapper.saveLog(sysLog);
        } catch (Exception e) {
            log.warn(" LogContent length : "+sysLog.getLogContent().length());
            log.warn(e.getMessage());
        }
    }

    @Override
    public void addLog(String logContent, Integer logType, Integer operateType) {
        addLog(logContent, logType, operateType, null);
    }



}