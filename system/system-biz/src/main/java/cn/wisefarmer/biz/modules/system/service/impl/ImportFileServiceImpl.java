package cn.wisefarmer.biz.modules.system.service.impl;

import cn.wisefarmer.base.core.common.util.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.jeecgframework.poi.excel.imports.base.ImportFileServiceI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * excel导入 实现类
 *
 * @author: wisefarmer
 */
@Slf4j
@Service
public class ImportFileServiceImpl implements ImportFileServiceI {

    @Value("${jeecg.path.upload}")
    private String upLoadPath;

    @Value(value="${jeecg.uploadType}")
    private String uploadType;

    @Override
    public String doUpload(byte[] data) {
        return CommonUtils.uploadOnlineImage(data, upLoadPath, "import", uploadType);
    }
}
