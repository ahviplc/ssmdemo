package com.question.pojo;

import java.util.Date;

public class Notice {
    private Long ntcid;

    private Long tchid;

    private String ntctopic;

    private String ntccontent;

    private Date ntctime;

    public Long getNtcid() {
        return ntcid;
    }

    public void setNtcid(Long ntcid) {
        this.ntcid = ntcid;
    }

    public Long getTchid() {
        return tchid;
    }

    public void setTchid(Long tchid) {
        this.tchid = tchid;
    }

    public String getNtctopic() {
        return ntctopic;
    }

    public void setNtctopic(String ntctopic) {
        this.ntctopic = ntctopic == null ? null : ntctopic.trim();
    }

    public String getNtccontent() {
        return ntccontent;
    }

    public void setNtccontent(String ntccontent) {
        this.ntccontent = ntccontent == null ? null : ntccontent.trim();
    }

    public Date getNtctime() {
        return ntctime;
    }

    public void setNtctime(Date ntctime) {
        this.ntctime = ntctime;
    }
}