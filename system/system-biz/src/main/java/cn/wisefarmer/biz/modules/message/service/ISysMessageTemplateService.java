package cn.wisefarmer.biz.modules.message.service;

import java.util.List;

import cn.wisefarmer.biz.modules.message.entity.SysMessageTemplate;
import cn.wisefarmer.base.core.common.system.base.service.JeecgService;

/**
 * @Description: 消息模板
 * @Author: jeecg-boot
 * @Date:  2019-04-09
 * @Version: V1.0
 */
public interface ISysMessageTemplateService extends JeecgService<SysMessageTemplate> {

    /**
     * 通过模板CODE查询消息模板
     * @param code 模板CODE
     * @return
     */
    List<SysMessageTemplate> selectByCode(String code);
}
