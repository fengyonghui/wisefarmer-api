package cn.wisefarmer.biz.modules.oss.entity;

import cn.wisefarmer.base.core.common.system.base.entity.JeecgEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * @Description: oss云存储实体类
 * @author: wisefarmer
 */
@Data
@TableName("oss_file")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OssFile extends JeecgEntity {

	private static final long serialVersionUID = 1L;

	@Excel(name = "文件名称")
	private String fileName;

	@Excel(name = "文件地址")
	private String url;

}
