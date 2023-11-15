package cn.wisefarmer.base.core.base.mapper;

import cn.wisefarmer.base.core.common.api.dto.LogDTO;
import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: BaseCommonMapper
 * @author: wisefarmer
 */
public interface BaseCommonMapper {

    /**
     * 保存日志
     * @param dto
     */
    @InterceptorIgnore(illegalSql = "true", tenantLine = "true")
    void saveLog(@Param("dto")LogDTO dto);

}
