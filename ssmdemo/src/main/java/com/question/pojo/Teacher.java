package com.question.pojo;

public class Teacher {
    private Long tchid;

    private String tchnumber;

    private String tchname;

    private String tchloginname;

    private String tchpwd;

    private String tchphone;

    private String tchmail;

    private String tchresearch;

    public Long getTchid() {
        return tchid;
    }

    public void setTchid(Long tchid) {
        this.tchid = tchid;
    }

    public String getTchnumber() {
        return tchnumber;
    }

    public void setTchnumber(String tchnumber) {
        this.tchnumber = tchnumber == null ? null : tchnumber.trim();
    }

    public String getTchname() {
        return tchname;
    }

    public void setTchname(String tchname) {
        this.tchname = tchname == null ? null : tchname.trim();
    }

    public String getTchloginname() {
        return tchloginname;
    }

    public void setTchloginname(String tchloginname) {
        this.tchloginname = tchloginname == null ? null : tchloginname.trim();
    }

    public String getTchpwd() {
        return tchpwd;
    }

    public void setTchpwd(String tchpwd) {
        this.tchpwd = tchpwd == null ? null : tchpwd.trim();
    }

    public String getTchphone() {
        return tchphone;
    }

    public void setTchphone(String tchphone) {
        this.tchphone = tchphone == null ? null : tchphone.trim();
    }

    public String getTchmail() {
        return tchmail;
    }

    public void setTchmail(String tchmail) {
        this.tchmail = tchmail == null ? null : tchmail.trim();
    }

    public String getTchresearch() {
        return tchresearch;
    }

    public void setTchresearch(String tchresearch) {
        this.tchresearch = tchresearch == null ? null : tchresearch.trim();
    }
}