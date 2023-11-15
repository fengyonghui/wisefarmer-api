package cn.wisefarmer.biz.modules.system.mapper;

import cn.wisefarmer.biz.modules.system.entity.SysDataLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 系统数据日志Mapper接口
 * @author: wisefarmer
 */
public interface SysDataLogMapper extends BaseMapper<SysDataLog>{
	/**
	 * 通过表名及数据Id获取最大版本
	 * @param tableName
	 * @param dataId
	 * @return
	 */
	public String queryMaxDataVer(@Param("tableName") String tableName,@Param("dataId") String dataId);

}
