package cn.wisefarmer.base.core.common.util.security.entity;

import lombok.Data;

/**
 * @Description: SecuritySignResp
 * @author: wisefarmer
 */
@Data
public class SecuritySignResp {
    private String data;
    private String signData;
    private String aesKey;
}
