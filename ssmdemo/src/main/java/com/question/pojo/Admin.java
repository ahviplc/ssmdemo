package com.question.pojo;

public class Admin {
    private Long admid;

    private String admname;

    private String admusername;

    private String admpwd;

    public Long getAdmid() {
        return admid;
    }

    public void setAdmid(Long admid) {
        this.admid = admid;
    }

    public String getAdmname() {
        return admname;
    }

    public void setAdmname(String admname) {
        this.admname = admname == null ? null : admname.trim();
    }

    public String getAdmusername() {
        return admusername;
    }

    public void setAdmusername(String admusername) {
        this.admusername = admusername == null ? null : admusername.trim();
    }

    public String getAdmpwd() {
        return admpwd;
    }

    public void setAdmpwd(String admpwd) {
        this.admpwd = admpwd == null ? null : admpwd.trim();
    }
}