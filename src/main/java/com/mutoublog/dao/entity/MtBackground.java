package com.mutoublog.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class MtBackground implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 图片地址
     */
    private String img;

    /**
     * 文章id
     */
    private Integer articleId;

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
     * 超链接
     */
    private String href;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * mt_background
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
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
     * 文章id
     * @return article_id 文章id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * 文章id
     * @param articleId 文章id
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
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

    /**
     * 超链接
     * @return href 超链接
     */
    public String getHref() {
        return href;
    }

    /**
     * 超链接
     * @param href 超链接
     */
    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", img=").append(img);
        sb.append(", articleId=").append(articleId);
        sb.append(", cateId=").append(cateId);
        sb.append(", navId=").append(navId);
        sb.append(", tagId=").append(tagId);
        sb.append(", status=").append(status);
        sb.append(", href=").append(href);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}