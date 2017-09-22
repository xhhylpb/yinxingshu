package com.xhhy.bean;

public class DeptBean {
    private Integer deptId;

    private Integer deptNum;

    private String deptShortName;

    private String deptName;

    private Integer parentDept;

    private String deptAddress;

    private String deptRemark;

    private Integer deptState;

    private Integer deptDel;

    private String deptIntro;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(Integer deptNum) {
        this.deptNum = deptNum;
    }

    public String getDeptShortName() {
        return deptShortName;
    }

    public void setDeptShortName(String deptShortName) {
        this.deptShortName = deptShortName == null ? null : deptShortName.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getParentDept() {
        return parentDept;
    }

    public void setParentDept(Integer parentDept) {
        this.parentDept = parentDept;
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress == null ? null : deptAddress.trim();
    }

    public String getDeptRemark() {
        return deptRemark;
    }

    public void setDeptRemark(String deptRemark) {
        this.deptRemark = deptRemark == null ? null : deptRemark.trim();
    }

    public Integer getDeptState() {
        return deptState;
    }

    public void setDeptState(Integer deptState) {
        this.deptState = deptState;
    }

    public Integer getDeptDel() {
        return deptDel;
    }

    public void setDeptDel(Integer deptDel) {
        this.deptDel = deptDel;
    }

    public String getDeptIntro() {
        return deptIntro;
    }

    public void setDeptIntro(String deptIntro) {
        this.deptIntro = deptIntro == null ? null : deptIntro.trim();
    }
}