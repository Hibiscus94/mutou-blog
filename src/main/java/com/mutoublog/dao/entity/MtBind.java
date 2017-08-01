package com.mutoublog.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class MtBind implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 登录类型
     */
    private String type;

    /**
     * 用户第三方登录唯一标识
     */
    private String openid;

    /**
     * 打开微博的钥匙 会过期 用户每使用一个要更新定期更新
     */
    private String accessToken;

    /**
     * token参数
     */
    private String expiresIn;

    /**
     * token参数
     */
    private String refreshToken;

    /**
     * 显示昵称
     */
    private String nickname;

    /**
     * 指向该用 户头像(GIF/JPG/PNG格式)的一个URL地址
     */
    private String head;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 数据状态，1：有效，0：无效
     */
    private Byte status;

    /**
     * mt_bind
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
     * 登录类型
     * @return type 登录类型
     */
    public String getType() {
        return type;
    }

    /**
     * 登录类型
     * @param type 登录类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 用户第三方登录唯一标识
     * @return openid 用户第三方登录唯一标识
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 用户第三方登录唯一标识
     * @param openid 用户第三方登录唯一标识
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 打开微博的钥匙 会过期 用户每使用一个要更新定期更新
     * @return access_token 打开微博的钥匙 会过期 用户每使用一个要更新定期更新
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 打开微博的钥匙 会过期 用户每使用一个要更新定期更新
     * @param accessToken 打开微博的钥匙 会过期 用户每使用一个要更新定期更新
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    /**
     * token参数
     * @return expires_in token参数
     */
    public String getExpiresIn() {
        return expiresIn;
    }

    /**
     * token参数
     * @param expiresIn token参数
     */
    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn == null ? null : expiresIn.trim();
    }

    /**
     * token参数
     * @return refresh_token token参数
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * token参数
     * @param refreshToken token参数
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken == null ? null : refreshToken.trim();
    }

    /**
     * 显示昵称
     * @return nickname 显示昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 显示昵称
     * @param nickname 显示昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 指向该用 户头像(GIF/JPG/PNG格式)的一个URL地址
     * @return head 指向该用 户头像(GIF/JPG/PNG格式)的一个URL地址
     */
    public String getHead() {
        return head;
    }

    /**
     * 指向该用 户头像(GIF/JPG/PNG格式)的一个URL地址
     * @param head 指向该用 户头像(GIF/JPG/PNG格式)的一个URL地址
     */
    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
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
        sb.append(", type=").append(type);
        sb.append(", openid=").append(openid);
        sb.append(", accessToken=").append(accessToken);
        sb.append(", expiresIn=").append(expiresIn);
        sb.append(", refreshToken=").append(refreshToken);
        sb.append(", nickname=").append(nickname);
        sb.append(", head=").append(head);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}