package cn.wisefarmer.base.core.common.util.security.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @Description: SecurityResp
 * @author: wisefarmer
 */
@Data
public class SecurityResp {
    private Boolean success;
    private JSONObject data;
}
