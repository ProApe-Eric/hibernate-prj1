package cn.edu.zjut.po;

import java.util.Date;

public class Customer {

    private int customerId;
    private String account;
    private String password;
    private String name;
    private Date birthday;
    private Boolean sex;

    private ContactInfo contactInfo;


    public Customer() {
    }

    public Customer(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", contactInfo=" + contactInfo +
                '}';
    }

    public Customer(int customerId, String account, String password, String name, Date birthday, Boolean sex, ContactInfo contactInfo) {
        this.customerId = customerId;
        this.account = account;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.contactInfo = contactInfo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
