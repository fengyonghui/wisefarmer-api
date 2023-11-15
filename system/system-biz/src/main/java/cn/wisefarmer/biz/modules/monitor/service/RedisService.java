package cn.wisefarmer.biz.modules.monitor.service;

import cn.wisefarmer.biz.modules.monitor.domain.RedisInfo;
import cn.wisefarmer.biz.modules.monitor.exception.RedisConnectException;
import com.alibaba.fastjson.JSONArray;

import java.util.List;
import java.util.Map;

/**
 * @Description: redis信息service接口
 * @author: wisefarmer
 */
public interface RedisService {

	/**
	 * 获取 redis 的详细信息
	 *
	 * @return List
     * @throws RedisConnectException
	 */
	List<RedisInfo> getRedisInfo() throws RedisConnectException;

	/**
	 * 获取 redis key 数量
	 *
	 * @return Map
     * @throws RedisConnectException
	 */
	Map<String, Object> getKeysSize() throws RedisConnectException;

	/**
	 * 获取 redis 内存信息
	 *
	 * @return Map
     * @throws RedisConnectException
	 */
	Map<String, Object> getMemoryInfo() throws RedisConnectException;
	/**
	 * 获取 报表需要个redis信息
	 * @param type
	 * @return Map
     * @throws RedisConnectException
	 */
	Map<String, JSONArray> getMapForReport(String type) throws RedisConnectException ;
}
