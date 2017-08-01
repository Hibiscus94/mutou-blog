package com.mutoublog.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class MtMessage implements Serializable {
    /**
     * 留言id
     */
    private Integer id;

    /**
     * 父级id
     */
    private Integer parentId;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 用户头像
     */
    private String head;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 用户站点链接
     */
    private String webUrl;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * IP地址
     */
    private Integer ip;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否显示
     */
    private Byte isShow;

    /**
     * 
     */
    private Byte status;

    /**
     * 浏览器 1：谷歌，2：火狐，3：ie，4：safari，5：百度，6：搜狗，7：QQ
     */
    private Byte brower;

    /**
     * 操作系统，1：win7，2：win10，3：win8，4：xp，5：mac，6：Android，7：ios，8：linux
     */
    private Byte os;

    /**
     * 国家
     */
    private String country;

    /**
     * 留言内容
     */
    private String content;

    /**
     * mt_message
     */
    private static final long serialVersionUID = 1L;

    /**
     * 留言id
     * @return id 留言id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 留言id
     * @param id 留言id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 父级id
     * @return parent_id 父级id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 父级id
     * @param parentId 父级id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
     * 用户头像
     * @return head 用户头像
     */
    public String getHead() {
        return head;
    }

    /**
     * 用户头像
     * @param head 用户头像
     */
    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    /**
     * 用户昵称
     * @return nickname 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 用户昵称
     * @param nickname 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 邮箱地址
     * @return email 邮箱地址
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱地址
     * @param email 邮箱地址
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 用户站点链接
     * @return web_url 用户站点链接
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * 用户站点链接
     * @param webUrl 用户站点链接
     */
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl == null ? null : webUrl.trim();
    }

    /**
     * 省份
     * @return province 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省份
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 城市
     * @return city 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * IP地址
     * @return ip IP地址
     */
    public Integer getIp() {
        return ip;
    }

    /**
     * IP地址
     * @param ip IP地址
     */
    public void setIp(Integer ip) {
        this.ip = ip;
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
     * 是否显示
     * @return is_show 是否显示
     */
    public Byte getIsShow() {
        return isShow;
    }

    /**
     * 是否显示
     * @param isShow 是否显示
     */
    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    /**
     * 
     * @return status 
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 
     * @param status 
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 浏览器 1：谷歌，2：火狐，3：ie，4：safari，5：百度，6：搜狗，7：QQ
     * @return brower 浏览器 1：谷歌，2：火狐，3：ie，4：safari，5：百度，6：搜狗，7：QQ
     */
    public Byte getBrower() {
        return brower;
    }

    /**
     * 浏览器 1：谷歌，2：火狐，3：ie，4：safari，5：百度，6：搜狗，7：QQ
     * @param brower 浏览器 1：谷歌，2：火狐，3：ie，4：safari，5：百度，6：搜狗，7：QQ
     */
    public void setBrower(Byte brower) {
        this.brower = brower;
    }

    /**
     * 操作系统，1：win7，2：win10，3：win8，4：xp，5：mac，6：Android，7：ios，8：linux
     * @return os 操作系统，1：win7，2：win10，3：win8，4：xp，5：mac，6：Android，7：ios，8：linux
     */
    public Byte getOs() {
        return os;
    }

    /**
     * 操作系统，1：win7，2：win10，3：win8，4：xp，5：mac，6：Android，7：ios，8：linux
     * @param os 操作系统，1：win7，2：win10，3：win8，4：xp，5：mac，6：Android，7：ios，8：linux
     */
    public void setOs(Byte os) {
        this.os = os;
    }

    /**
     * 国家
     * @return country 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 国家
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 留言内容
     * @return content 留言内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 留言内容
     * @param content 留言内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", uid=").append(uid);
        sb.append(", head=").append(head);
        sb.append(", nickname=").append(nickname);
        sb.append(", email=").append(email);
        sb.append(", webUrl=").append(webUrl);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", ip=").append(ip);
        sb.append(", createTime=").append(createTime);
        sb.append(", isShow=").append(isShow);
        sb.append(", status=").append(status);
        sb.append(", brower=").append(brower);
        sb.append(", os=").append(os);
        sb.append(", country=").append(country);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}