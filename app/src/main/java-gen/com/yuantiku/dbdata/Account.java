package com.yuantiku.dbdata;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ACCOUNT.
 */
public class Account implements java.io.Serializable {

    private Long id;
    /** Not-null value. */
    private String name;
    /** Not-null value. */
    private String ldap;
    private String email;
    private String phone;
    private String dept;
    private String googleAccount;
    private String birth;
    private String constellation;

    public Account() {
    }

    public Account(Long id) {
        this.id = id;
    }

    public Account(Long id, String name, String ldap, String email, String phone, String dept, String googleAccount, String birth, String constellation) {
        this.id = id;
        this.name = name;
        this.ldap = ldap;
        this.email = email;
        this.phone = phone;
        this.dept = dept;
        this.googleAccount = googleAccount;
        this.birth = birth;
        this.constellation = constellation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    /** Not-null value. */
    public String getLdap() {
        return ldap;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setLdap(String ldap) {
        this.ldap = ldap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGoogleAccount() {
        return googleAccount;
    }

    public void setGoogleAccount(String googleAccount) {
        this.googleAccount = googleAccount;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

}
