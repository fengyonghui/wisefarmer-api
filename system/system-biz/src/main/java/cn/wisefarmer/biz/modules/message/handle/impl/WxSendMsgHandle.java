package cn.wisefarmer.biz.modules.message.handle.impl;

import cn.wisefarmer.biz.modules.message.handle.ISendMsgHandle;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description: 发微信消息模板
 * @author: wisefarmer
 */
@Slf4j
public class WxSendMsgHandle implements ISendMsgHandle {

	@Override
	public void sendMsg(String esReceiver, String esTitle, String esContent) {
		// TODO Auto-generated method stub
		log.info("发微信消息模板");
	}

}
