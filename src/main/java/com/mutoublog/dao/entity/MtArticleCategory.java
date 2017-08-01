package com.mutoublog.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class MtArticleCategory implements Serializable {
    /**
     * 分类ID
     */
    private Byte id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 上级分类ID
     */
    private Byte parentId;

    /**
     * 外链
     */
    private String link;

    /**
     * 排序 从小到大
     */
    private Byte sort;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 数据状态
     */
    private Byte status;

    /**
     * mt_article_category
     */
    private static final long serialVersionUID = 1L;

    /**
     * 分类ID
     * @return id 分类ID
     */
    public Byte getId() {
        return id;
    }

    /**
     * 分类ID
     * @param id 分类ID
     */
    public void setId(Byte id) {
        this.id = id;
    }

    /**
     * 分类名称
     * @return name 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 分类名称
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 上级分类ID
     * @return parent_id 上级分类ID
     */
    public Byte getParentId() {
        return parentId;
    }

    /**
     * 上级分类ID
     * @param parentId 上级分类ID
     */
    public void setParentId(Byte parentId) {
        this.parentId = parentId;
    }

    /**
     * 外链
     * @return link 外链
     */
    public String getLink() {
        return link;
    }

    /**
     * 外链
     * @param link 外链
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * 排序 从小到大
     * @return sort 排序 从小到大
     */
    public Byte getSort() {
        return sort;
    }

    /**
     * 排序 从小到大
     * @param sort 排序 从小到大
     */
    public void setSort(Byte sort) {
        this.sort = sort;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * 数据状态
     * @return status 数据状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 数据状态
     * @param status 数据状态
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
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", link=").append(link);
        sb.append(", sort=").append(sort);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}