package cn.wisefarmer.biz.modules.system.service.impl;

import cn.wisefarmer.biz.modules.system.entity.SysPosition;
import cn.wisefarmer.biz.modules.system.mapper.SysPositionMapper;
import cn.wisefarmer.biz.modules.system.service.ISysPositionService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.wisefarmer.base.core.common.constant.SymbolConstant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 职务表
 * @Author: jeecg-boot
 * @Date: 2019-09-19
 * @Version: V1.0
 */
@Service
public class SysPositionServiceImpl extends ServiceImpl<SysPositionMapper, SysPosition> implements ISysPositionService {

    @Override
    public SysPosition getByCode(String code) {
        LambdaQueryWrapper<SysPosition> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysPosition::getCode, code);
        return super.getOne(queryWrapper);
    }

    @Override
    public List<SysPosition> getPositionList(String userId) {
        return this.baseMapper.getPositionList(userId);
    }

    @Override
    public String getPositionName(List<String> postList) {
        List<SysPosition> positionNameList = this.baseMapper.getPositionName(postList);
        if (null != positionNameList && positionNameList.size()>0) {
            return positionNameList.stream().map(SysPosition::getName).collect(Collectors.joining(SymbolConstant.COMMA));
        }
        return "";
    }
}
