package cn.wisefarmer.biz.modules.system.service;

import cn.wisefarmer.base.core.common.api.vo.Result;
import cn.wisefarmer.biz.modules.system.entity.SysDataSource;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description: 多数据源管理
 * @Author: wisefarmer
 * @Date: 2019-12-25
 * @Version: V1.0
 */
public interface ISysDataSourceService extends IService<SysDataSource> {

    /**
     * 添加数据源
     * @param sysDataSource
     * @return
     */
    Result saveDataSource(SysDataSource sysDataSource);

    /**
     * 修改数据源
     * @param sysDataSource
     * @return
     */
    Result editDataSource(SysDataSource sysDataSource);


    /**
     * 删除数据源
     * @param id
     * @return
     */
    Result deleteDataSource(String id);
}
