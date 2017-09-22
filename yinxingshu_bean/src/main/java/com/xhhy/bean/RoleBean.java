package com.xhhy.bean;

public class RoleBean {
    private Integer roleId;

    private Integer deptId;

    private String roleNum;

    private String roleName;

    private Integer roleCategory;

    private String roleDesc;

    private String roleRemark;

    private Integer roleState;

    private Integer roleDel;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getRoleNum() {
        return roleNum;
    }

    public void setRoleNum(String roleNum) {
        this.roleNum = roleNum == null ? null : roleNum.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRoleCategory() {
        return roleCategory;
    }

    public void setRoleCategory(Integer roleCategory) {
        this.roleCategory = roleCategory;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public String getRoleRemark() {
        return roleRemark;
    }

    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark == null ? null : roleRemark.trim();
    }

    public Integer getRoleState() {
        return roleState;
    }

    public void setRoleState(Integer roleState) {
        this.roleState = roleState;
    }

    public Integer getRoleDel() {
        return roleDel;
    }

    public void setRoleDel(Integer roleDel) {
        this.roleDel = roleDel;
    }
}