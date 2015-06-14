package com.playmatecat.bbs.bbsApp.admin.vo;

import com.playmatecat.commons.structure.Pagination;
import com.playmatecat.domains.sysBBS.dto.RoleDTO;

public class AuthorizationVO {

    private RoleDTO roleDTO;
    
    private Pagination<RoleDTO> rolePage;

    public RoleDTO getRoleDTO() {
        return roleDTO;
    }

    public void setRoleDTO(RoleDTO roleDTO) {
        this.roleDTO = roleDTO;
    }

    public Pagination<RoleDTO> getRolePage() {
        return rolePage;
    }

    public void setRolePage(Pagination<RoleDTO> rolePage) {
        this.rolePage = rolePage;
    }

    
}
