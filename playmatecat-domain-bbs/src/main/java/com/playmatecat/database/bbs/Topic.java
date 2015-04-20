package com.playmatecat.database.bbs;

import java.util.Date;

public class Topic {
    private Long id;

    private Long idSection;

    private String title;

    private Date createdAt;

    private Date updatedAt;

    private Integer isDeleted;

    private Integer isLocked;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdSection() {
        return idSection;
    }

    public void setIdSection(Long idSection) {
        this.idSection = idSection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Integer isLocked) {
        this.isLocked = isLocked;
    }
}