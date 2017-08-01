package com.mutoublog.dao.entity;

import java.io.Serializable;

public class MtTag implements Serializable {
    /**
     * 标签id
     */
    private Byte id;

    /**
     * 标签名
     */
    private String tagName;

    /**
     * mt_tag
     */
    private static final long serialVersionUID = 1L;

    /**
     * 标签id
     * @return id 标签id
     */
    public Byte getId() {
        return id;
    }

    /**
     * 标签id
     * @param id 标签id
     */
    public void setId(Byte id) {
        this.id = id;
    }

    /**
     * 标签名
     * @return tag_name 标签名
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 标签名
     * @param tagName 标签名
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tagName=").append(tagName);
        sb.append("]");
        return sb.toString();
    }
}