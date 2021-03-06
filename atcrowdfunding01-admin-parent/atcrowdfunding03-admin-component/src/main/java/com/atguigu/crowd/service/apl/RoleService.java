package com.atguigu.crowd.service.apl;

import com.atguigu.crowd.entity.Role;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface RoleService {
    PageInfo<Role> getPageInfo(Integer pageNum,Integer pageSize,String keyWord);

    void saveRole(Role role);

    void updateRole(Role role);
    void removeRole(List<Integer> roleIdList);
}
