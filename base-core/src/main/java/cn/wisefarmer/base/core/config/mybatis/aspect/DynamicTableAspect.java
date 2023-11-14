package cn.wisefarmer.base.core.config.mybatis.aspect;

import cn.wisefarmer.base.core.common.constant.CommonConstant;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import cn.wisefarmer.base.core.common.aspect.annotation.DynamicTable;
import cn.wisefarmer.base.core.common.util.SpringContextUtils;
import cn.wisefarmer.base.core.config.mybatis.ThreadLocalDataHelper;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * 动态table切换 切面处理
 *
 * @author :zyf
 * @date:2020-04-25
 */
@Aspect
@Component
public class DynamicTableAspect {


    /**
     * 定义切面拦截切入点
     */
    @Pointcut("@annotation(cn.wisefarmer.base.core.common.aspect.annotation.DynamicTable)")
    public void dynamicTable() {
    }


    @Around("dynamicTable()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        DynamicTable dynamicTable = method.getAnnotation(DynamicTable.class);
        HttpServletRequest request = SpringContextUtils.getHttpServletRequest();
        //获取前端传递的版本标记
        String version = request.getHeader(CommonConstant.VERSION);
        //存储版本号到本地线程变量
        ThreadLocalDataHelper.put(CommonConstant.VERSION, version);
        //存储表名到本地线程变量
        ThreadLocalDataHelper.put(CommonConstant.DYNAMIC_TABLE_NAME, dynamicTable.value());
        //执行方法
        Object result = point.proceed();
        //清空本地变量
        ThreadLocalDataHelper.clear();
        return result;
    }

}
