package com.playmatecat.database.bbs;

import java.util.Date;

public class NoticeMsg {
    private Long id;

    private Long fromIdUser;

    private Long toIdUser;

    private String fromUsername;

    private Date createdAt;

    private Integer isDeleted;

    private Integer isReaded;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFromIdUser() {
        return fromIdUser;
    }

    public void setFromIdUser(Long fromIdUser) {
        this.fromIdUser = fromIdUser;
    }

    public Long getToIdUser() {
        return toIdUser;
    }

    public void setToIdUser(Long toIdUser) {
        this.toIdUser = toIdUser;
    }

    public String getFromUsername() {
        return fromUsername;
    }

    public void setFromUsername(String fromUsername) {
        this.fromUsername = fromUsername == null ? null : fromUsername.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsReaded() {
        return isReaded;
    }

    public void setIsReaded(Integer isReaded) {
        this.isReaded = isReaded;
    }
}