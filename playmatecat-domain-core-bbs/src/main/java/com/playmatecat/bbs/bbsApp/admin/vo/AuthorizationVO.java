package com.playmatecat.bbs.bbsApp.admin.vo;

import java.util.List;

import com.playmatecat.domains.sysBBS.dto.RoleDTO;

public class AuthorizationVO {
    private List<RoleDTO> RoleList;

    public List<RoleDTO> getRoleList() {
        return RoleList;
    }

    public void setRoleList(List<RoleDTO> roleList) {
        RoleList = roleList;
    }
    
}
