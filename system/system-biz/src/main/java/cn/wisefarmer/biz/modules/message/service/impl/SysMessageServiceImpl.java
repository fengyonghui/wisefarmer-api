package cn.wisefarmer.biz.modules.message.service.impl;

import cn.wisefarmer.base.core.common.system.base.service.impl.JeecgServiceImpl;
import cn.wisefarmer.biz.modules.message.entity.SysMessage;
import cn.wisefarmer.biz.modules.message.mapper.SysMessageMapper;
import cn.wisefarmer.biz.modules.message.service.ISysMessageService;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息
 * @Author: wisefarmer
 * @Date: 2019-04-09
 * @Version: V1.0
 */
@Service
public class SysMessageServiceImpl extends JeecgServiceImpl<SysMessageMapper, SysMessage> implements ISysMessageService {

}
