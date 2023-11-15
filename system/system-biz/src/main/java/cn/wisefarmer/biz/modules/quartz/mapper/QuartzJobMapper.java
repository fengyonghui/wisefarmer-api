package cn.wisefarmer.biz.modules.quartz.mapper;

import cn.wisefarmer.biz.modules.quartz.entity.QuartzJob;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 定时任务在线管理
 * @Author: wisefarmer
 * @Date: 2019-01-02
 * @Version: V1.0
 */
public interface QuartzJobMapper extends BaseMapper<QuartzJob> {

    /**
     * 根据jobClassName查询
     * @param jobClassName 任务类名
     * @return
     */
	public List<QuartzJob> findByJobClassName(@Param("jobClassName") String jobClassName);

}
