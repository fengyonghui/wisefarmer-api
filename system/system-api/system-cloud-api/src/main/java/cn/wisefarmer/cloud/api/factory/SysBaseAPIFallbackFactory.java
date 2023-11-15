package cn.wisefarmer.cloud.api.factory;

import cn.wisefarmer.cloud.api.ISysBaseAPI;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
/**
 * @Description: SysBaseAPIFallbackFactory
 * @author: wisefarmer
 */
@Component
public class SysBaseAPIFallbackFactory implements FallbackFactory<ISysBaseAPI> {

    @Override
    public ISysBaseAPI create(Throwable throwable) {
        SysBaseAPIFallback fallback = new SysBaseAPIFallback();
        fallback.setCause(throwable);
        return fallback;
    }
}
