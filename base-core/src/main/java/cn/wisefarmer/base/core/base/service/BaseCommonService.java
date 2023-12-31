package cn.wisefarmer.base.core.base.service;

import cn.wisefarmer.base.core.common.api.dto.LogDTO;
import cn.wisefarmer.base.core.common.system.vo.LoginUser;

/**
 * common接口
 *
 * @author: wisefarmer
 */
public interface BaseCommonService {

    /**
     * 保存日志
     * @param logDTO
     */
    void addLog(LogDTO logDTO);

    /**
     * 保存日志
     * @param logContent
     * @param logType
     * @param operateType
     * @param user
     */
    void addLog(String logContent, Integer logType, Integer operateType, LoginUser user);

    /**
     * 保存日志
     * @param logContent
     * @param logType
     * @param operateType
     */
    void addLog(String logContent, Integer logType, Integer operateType);

}
