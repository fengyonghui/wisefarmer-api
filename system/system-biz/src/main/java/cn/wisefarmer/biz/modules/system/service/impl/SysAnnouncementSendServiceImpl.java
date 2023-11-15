package cn.wisefarmer.biz.modules.system.service.impl;

import cn.wisefarmer.biz.modules.system.entity.SysAnnouncementSend;
import cn.wisefarmer.biz.modules.system.mapper.SysAnnouncementSendMapper;
import cn.wisefarmer.biz.modules.system.model.AnnouncementSendModel;
import cn.wisefarmer.biz.modules.system.service.ISysAnnouncementSendService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: 用户通告阅读标记表
 * @Author: wisefarmer
 * @Date: 2019-02-21
 * @Version: V1.0
 */
@Service
public class SysAnnouncementSendServiceImpl extends ServiceImpl<SysAnnouncementSendMapper, SysAnnouncementSend> implements ISysAnnouncementSendService {

	@Resource
	private SysAnnouncementSendMapper sysAnnouncementSendMapper;

	@Override
	public Page<AnnouncementSendModel> getMyAnnouncementSendPage(Page<AnnouncementSendModel> page,
                                                                 AnnouncementSendModel announcementSendModel) {
		 return page.setRecords(sysAnnouncementSendMapper.getMyAnnouncementSendList(page, announcementSendModel));
	}

	@Override
	public AnnouncementSendModel getOne(String sendId) {
		return sysAnnouncementSendMapper.getOne(sendId);
	}

}
