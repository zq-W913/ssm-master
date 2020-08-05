package com.mytest.bean;

public class PersonBean {
    private  int pid;
    private  String pname;

    public PersonBean() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public PersonBean(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }
}
