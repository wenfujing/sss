package com.wfj.bmobstudy.Bean;

import cn.bmob.v3.BmobObject;

/**
 * @description 办公电话
 * @date: 2020/4/26
 * @author: a */
public class DepartmentPhone extends BmobObject {
    private String department;
    private String position;
    private String phone;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return department + "\n" + position + "\n" + phone;
    }
}
