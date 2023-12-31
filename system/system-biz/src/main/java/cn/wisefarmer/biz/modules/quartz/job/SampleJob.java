package cn.wisefarmer.biz.modules.quartz.job;

import cn.wisefarmer.base.core.common.util.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 示例不带参定时任务
 *
 * @Author Scott
 */
@Slf4j
public class SampleJob implements Job {

	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		log.info(" Job Execution key：" + jobExecutionContext.getJobDetail().getKey());
		log.info(String.format(" wisefarmer 普通定时任务 SampleJob !  时间:" + DateUtils.getTimestamp()));
	}
}
