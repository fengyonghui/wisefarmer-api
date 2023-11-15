package cn.wisefarmer.base.core.common.util.security.entity;

import lombok.Data;

/**
 * @Description: SecurityReq
 * @author: wisefarmer
 */
@Data
public class SecurityReq {
    private String data;
    private String pubKey;
    private String signData;
    private String aesKey;
}
