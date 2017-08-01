package com.mutoublog.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class MtBackground implements Serializable {
    /**
     * 主键
     */
    private Byte id;

    /**
     * 图片地址
     */
    private String img;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 分类id
     */
    private Byte cateId;

    /**
     * 导航id
     */
    private Byte navId;

    /**
     * 标签id
     */
    private Byte tagId;

    /**
     * 是否有效，1：是，0：否
     */
    private Byte status;

    /**
     * mt_background
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
     * 图片地址
     * @return img 图片地址
     */
    public String getImg() {
        return img;
    }

    /**
     * 图片地址
     * @param img 图片地址
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
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
     * 导航id
     * @return nav_id 导航id
     */
    public Byte getNavId() {
        return navId;
    }

    /**
     * 导航id
     * @param navId 导航id
     */
    public void setNavId(Byte navId) {
        this.navId = navId;
    }

    /**
     * 标签id
     * @return tag_id 标签id
     */
    public Byte getTagId() {
        return tagId;
    }

    /**
     * 标签id
     * @param tagId 标签id
     */
    public void setTagId(Byte tagId) {
        this.tagId = tagId;
    }

    /**
     * 是否有效，1：是，0：否
     * @return status 是否有效，1：是，0：否
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 是否有效，1：是，0：否
     * @param status 是否有效，1：是，0：否
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
        sb.append(", img=").append(img);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", cateId=").append(cateId);
        sb.append(", navId=").append(navId);
        sb.append(", tagId=").append(tagId);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}