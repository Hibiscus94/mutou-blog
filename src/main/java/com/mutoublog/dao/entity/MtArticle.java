package com.mutoublog.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class MtArticle implements Serializable {
    /**
     * 文章id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 所属分类 article_category主键
     */
    private Byte cateId;

    /**
     * 作者
     */
    private String author;

    /**
     * 文章密码
     */
    private String pass;

    /**
     * 摘要
     */
    private String brief;

    /**
     * 标签
     */
    private String tags;

    /**
     * 外链
     */
    private String link;

    /**
     * 排序 从小到大
     */
    private Integer sort;

    /**
     * 封面
     */
    private String cover;

    /**
     * 浏览量
     */
    private Integer view;

    /**
     * 是否置顶
     */
    private Byte isTop;

    /**
     * 数据状态1：待审核，2：草稿，3：发布，4：私有
     */
    private Byte status;

    /**
     * 评论数
     */
    private Short commentCount;

    /**
     * 是否开启评论，1：是，0：否
     */
    private Byte commentStatus;

    /**
     * 添加年份
     */
    private Short createYear;

    /**
     * 添加日期
     */
    private Date createDate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * mt_article
     */
    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     * @return id 文章id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 文章id
     * @param id 文章id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户id
     * @return uid 用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 用户id
     * @param uid 用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 文章标题
     * @return title 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 文章标题
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 所属分类 article_category主键
     * @return cate_id 所属分类 article_category主键
     */
    public Byte getCateId() {
        return cateId;
    }

    /**
     * 所属分类 article_category主键
     * @param cateId 所属分类 article_category主键
     */
    public void setCateId(Byte cateId) {
        this.cateId = cateId;
    }

    /**
     * 作者
     * @return author 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 作者
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * 文章密码
     * @return pass 文章密码
     */
    public String getPass() {
        return pass;
    }

    /**
     * 文章密码
     * @param pass 文章密码
     */
    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }

    /**
     * 摘要
     * @return brief 摘要
     */
    public String getBrief() {
        return brief;
    }

    /**
     * 摘要
     * @param brief 摘要
     */
    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    /**
     * 标签
     * @return tags 标签
     */
    public String getTags() {
        return tags;
    }

    /**
     * 标签
     * @param tags 标签
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
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
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序 从小到大
     * @param sort 排序 从小到大
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 封面
     * @return cover 封面
     */
    public String getCover() {
        return cover;
    }

    /**
     * 封面
     * @param cover 封面
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * 浏览量
     * @return view 浏览量
     */
    public Integer getView() {
        return view;
    }

    /**
     * 浏览量
     * @param view 浏览量
     */
    public void setView(Integer view) {
        this.view = view;
    }

    /**
     * 是否置顶
     * @return is_top 是否置顶
     */
    public Byte getIsTop() {
        return isTop;
    }

    /**
     * 是否置顶
     * @param isTop 是否置顶
     */
    public void setIsTop(Byte isTop) {
        this.isTop = isTop;
    }

    /**
     * 数据状态1：待审核，2：草稿，3：发布，4：私有
     * @return status 数据状态1：待审核，2：草稿，3：发布，4：私有
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 数据状态1：待审核，2：草稿，3：发布，4：私有
     * @param status 数据状态1：待审核，2：草稿，3：发布，4：私有
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 评论数
     * @return comment_count 评论数
     */
    public Short getCommentCount() {
        return commentCount;
    }

    /**
     * 评论数
     * @param commentCount 评论数
     */
    public void setCommentCount(Short commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 是否开启评论，1：是，0：否
     * @return comment_status 是否开启评论，1：是，0：否
     */
    public Byte getCommentStatus() {
        return commentStatus;
    }

    /**
     * 是否开启评论，1：是，0：否
     * @param commentStatus 是否开启评论，1：是，0：否
     */
    public void setCommentStatus(Byte commentStatus) {
        this.commentStatus = commentStatus;
    }

    /**
     * 添加年份
     * @return create_year 添加年份
     */
    public Short getCreateYear() {
        return createYear;
    }

    /**
     * 添加年份
     * @param createYear 添加年份
     */
    public void setCreateYear(Short createYear) {
        this.createYear = createYear;
    }

    /**
     * 添加日期
     * @return create_date 添加日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 添加日期
     * @param createDate 添加日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", title=").append(title);
        sb.append(", cateId=").append(cateId);
        sb.append(", author=").append(author);
        sb.append(", pass=").append(pass);
        sb.append(", brief=").append(brief);
        sb.append(", tags=").append(tags);
        sb.append(", link=").append(link);
        sb.append(", sort=").append(sort);
        sb.append(", cover=").append(cover);
        sb.append(", view=").append(view);
        sb.append(", isTop=").append(isTop);
        sb.append(", status=").append(status);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", commentStatus=").append(commentStatus);
        sb.append(", createYear=").append(createYear);
        sb.append(", createDate=").append(createDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}