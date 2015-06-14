package com.playmatecat.domains.sysBBS.dto;

import com.playmatecat.domains.sysBBS.entity.Role;

public class RoleDTO extends Role{
    private int pageSize;
    
    private int pageNo;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
    
    
}
