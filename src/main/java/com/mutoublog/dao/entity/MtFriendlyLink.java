package com.mutoublog.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class MtFriendlyLink implements Serializable {
    /**
     * 友情链接id
     */
    private Byte id;

    /**
     * 标题
     */
    private String title;

    /**
     * 链接
     */
    private String link;

    /**
     * 友情链接logo
     */
    private String logo;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 数据状态，1：有效，0：无效
     */
    private Byte status;

    /**
     * mt_friendly_link
     */
    private static final long serialVersionUID = 1L;

    /**
     * 友情链接id
     * @return id 友情链接id
     */
    public Byte getId() {
        return id;
    }

    /**
     * 友情链接id
     * @param id 友情链接id
     */
    public void setId(Byte id) {
        this.id = id;
    }

    /**
     * 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 链接
     * @return link 链接
     */
    public String getLink() {
        return link;
    }

    /**
     * 链接
     * @param link 链接
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * 友情链接logo
     * @return logo 友情链接logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 友情链接logo
     * @param logo 友情链接logo
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 数据状态，1：有效，0：无效
     * @return status 数据状态，1：有效，0：无效
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 数据状态，1：有效，0：无效
     * @param status 数据状态，1：有效，0：无效
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", link=").append(link);
        sb.append(", logo=").append(logo);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}