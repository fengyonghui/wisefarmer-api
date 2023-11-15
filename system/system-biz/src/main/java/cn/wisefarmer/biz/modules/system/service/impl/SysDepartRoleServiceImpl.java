package cn.wisefarmer.biz.modules.system.service.impl;

import cn.wisefarmer.biz.modules.system.entity.SysDepartRole;
import cn.wisefarmer.biz.modules.system.mapper.SysDepartRoleMapper;
import cn.wisefarmer.biz.modules.system.service.ISysDepartRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 部门角色
 * @Author: wisefarmer
 * @Date: 2020-02-12
 * @Version: V1.0
 */
@Service
public class SysDepartRoleServiceImpl extends ServiceImpl<SysDepartRoleMapper, SysDepartRole> implements ISysDepartRoleService {

    @Override
    public List<SysDepartRole> queryDeptRoleByDeptAndUser(String orgCode, String userId) {
        return this.baseMapper.queryDeptRoleByDeptAndUser(orgCode,userId);
    }
}
