package com.mutoublog.dao.entity;

import java.io.Serializable;

public class MtNav implements Serializable {
    /**
     * 导航id
     */
    private Byte id;

    /**
     * 分类id
     */
    private Byte cateId;

    /**
     * 父级id
     */
    private Byte parentId;

    /**
     * 导航标题
     */
    private String name;

    /**
     * 导航别名
     */
    private String alias;

    /**
     * 导航链接
     */
    private String url;

    /**
     * 排序
     */
    private Byte sort;

    /**
     * 打开方式，0：当前，2：新标签
     */
    private Byte target;

    /**
     * 是否有效，1:是，0：否
     */
    private Byte status;

    /**
     * mt_nav
     */
    private static final long serialVersionUID = 1L;

    /**
     * 导航id
     * @return id 导航id
     */
    public Byte getId() {
        return id;
    }

    /**
     * 导航id
     * @param id 导航id
     */
    public void setId(Byte id) {
        this.id = id;
    }

    /**
     * 分类id
     * @return cate_id 分类id
     */
    public Byte getCateId() {
        return cateId;
    }

    /**
     * 分类id
     * @param cateId 分类id
     */
    public void setCateId(Byte cateId) {
        this.cateId = cateId;
    }

    /**
     * 父级id
     * @return parent_id 父级id
     */
    public Byte getParentId() {
        return parentId;
    }

    /**
     * 父级id
     * @param parentId 父级id
     */
    public void setParentId(Byte parentId) {
        this.parentId = parentId;
    }

    /**
     * 导航标题
     * @return name 导航标题
     */
    public String getName() {
        return name;
    }

    /**
     * 导航标题
     * @param name 导航标题
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 导航别名
     * @return alias 导航别名
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 导航别名
     * @param alias 导航别名
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * 导航链接
     * @return url 导航链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 导航链接
     * @param url 导航链接
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Byte getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Byte sort) {
        this.sort = sort;
    }

    /**
     * 打开方式，0：当前，2：新标签
     * @return target 打开方式，0：当前，2：新标签
     */
    public Byte getTarget() {
        return target;
    }

    /**
     * 打开方式，0：当前，2：新标签
     * @param target 打开方式，0：当前，2：新标签
     */
    public void setTarget(Byte target) {
        this.target = target;
    }

    /**
     * 是否有效，1:是，0：否
     * @return status 是否有效，1:是，0：否
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 是否有效，1:是，0：否
     * @param status 是否有效，1:是，0：否
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
        sb.append(", cateId=").append(cateId);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", alias=").append(alias);
        sb.append(", url=").append(url);
        sb.append(", sort=").append(sort);
        sb.append(", target=").append(target);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}