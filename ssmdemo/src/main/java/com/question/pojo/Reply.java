package com.question.pojo;

import java.util.Date;

public class Reply {
    private Long replyid;

    private String stuid;

    private String content;

    private Date replytime;

    private String crseid;

    public Long getReplyid() {
        return replyid;
    }

    public void setReplyid(Long replyid) {
        this.replyid = replyid;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    public String getCrseid() {
        return crseid;
    }

    public void setCrseid(String crseid) {
        this.crseid = crseid == null ? null : crseid.trim();
    }
}