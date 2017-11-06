package com.question.pojo;

import java.util.Date;

public class Course {
    private Long crseid;

    private Long tchid;

    private String crsurl;

    private String crstopic;

    private String crsdescribe;

    private Date crstime;

    private String type;

    public Long getCrseid() {
        return crseid;
    }

    public void setCrseid(Long crseid) {
        this.crseid = crseid;
    }

    public Long getTchid() {
        return tchid;
    }

    public void setTchid(Long tchid) {
        this.tchid = tchid;
    }

    public String getCrsurl() {
        return crsurl;
    }

    public void setCrsurl(String crsurl) {
        this.crsurl = crsurl == null ? null : crsurl.trim();
    }

    public String getCrstopic() {
        return crstopic;
    }

    public void setCrstopic(String crstopic) {
        this.crstopic = crstopic == null ? null : crstopic.trim();
    }

    public String getCrsdescribe() {
        return crsdescribe;
    }

    public void setCrsdescribe(String crsdescribe) {
        this.crsdescribe = crsdescribe == null ? null : crsdescribe.trim();
    }

    public Date getCrstime() {
        return crstime;
    }

    public void setCrstime(Date crstime) {
        this.crstime = crstime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}