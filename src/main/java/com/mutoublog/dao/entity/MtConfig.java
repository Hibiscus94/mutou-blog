package com.mutoublog.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class MtConfig implements Serializable {
    /**
     * 主键
     */
    private Byte id;

    /**
     * 网站标题
     */
    private String title;

    /**
     * 网站描述
     */
    private String description;

    /**
     * 网站关键词
     */
    private String keywords;

    /**
     * 网站logo
     */
    private String logo;

    /**
     * ICP备案
     */
    private String icp;

    /**
     * 前台分页展示数量
     */
    private Byte indexPage;

    /**
     * 后台分页展示数量
     */
    private Byte adminPage;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 关于网站
     */
    private String about;

    /**
     * mt_config
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return id 主键
     */
    public Byte getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Byte id) {
        this.id = id;
    }

    /**
     * 网站标题
     * @return title 网站标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 网站标题
     * @param title 网站标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 网站描述
     * @return description 网站描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 网站描述
     * @param description 网站描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 网站关键词
     * @return keywords 网站关键词
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 网站关键词
     * @param keywords 网站关键词
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * 网站logo
     * @return logo 网站logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 网站logo
     * @param logo 网站logo
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * ICP备案
     * @return icp ICP备案
     */
    public String getIcp() {
        return icp;
    }

    /**
     * ICP备案
     * @param icp ICP备案
     */
    public void setIcp(String icp) {
        this.icp = icp == null ? null : icp.trim();
    }

    /**
     * 前台分页展示数量
     * @return index_page 前台分页展示数量
     */
    public Byte getIndexPage() {
        return indexPage;
    }

    /**
     * 前台分页展示数量
     * @param indexPage 前台分页展示数量
     */
    public void setIndexPage(Byte indexPage) {
        this.indexPage = indexPage;
    }

    /**
     * 后台分页展示数量
     * @return admin_page 后台分页展示数量
     */
    public Byte getAdminPage() {
        return adminPage;
    }

    /**
     * 后台分页展示数量
     * @param adminPage 后台分页展示数量
     */
    public void setAdminPage(Byte adminPage) {
        this.adminPage = adminPage;
    }

    /**
     * 状态
     * @return status 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
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
     * 关于网站
     * @return about 关于网站
     */
    public String getAbout() {
        return about;
    }

    /**
     * 关于网站
     * @param about 关于网站
     */
    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", keywords=").append(keywords);
        sb.append(", logo=").append(logo);
        sb.append(", icp=").append(icp);
        sb.append(", indexPage=").append(indexPage);
        sb.append(", adminPage=").append(adminPage);
        sb.append(", status=").append(status);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", about=").append(about);
        sb.append("]");
        return sb.toString();
    }
}