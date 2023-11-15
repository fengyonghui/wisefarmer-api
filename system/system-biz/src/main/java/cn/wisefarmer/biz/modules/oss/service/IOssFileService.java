package cn.wisefarmer.biz.modules.oss.service;

import cn.wisefarmer.biz.modules.oss.entity.OssFile;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Description: OOS云存储service接口
 * @author: wisefarmer
 */
public interface IOssFileService extends IService<OssFile> {

    /**
     * oss文件上传
     * @param multipartFile
     * @throws IOException
     */
	void upload(MultipartFile multipartFile) throws Exception;

    /**
     * oss文件删除
     * @param ossFile OSSFile对象
     * @return
     */
	boolean delete(OssFile ossFile);

}
