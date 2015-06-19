package com.playmatecat.domains.sysBBS.entity;

public class UriResource {
    private Long id;

    private String uriWildcard;

    private String description;

    private Boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUriWildcard() {
        return uriWildcard;
    }

    public void setUriWildcard(String uriWildcard) {
        this.uriWildcard = uriWildcard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}