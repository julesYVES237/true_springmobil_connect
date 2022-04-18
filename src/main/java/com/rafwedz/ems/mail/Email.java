package com.rafwedz.ems.mail;



public class Email {

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String subject;
    private String user;
    private String object;
    private String phone;


    public void setText(String text) {
        this.text = text;
    }

    private String text;




    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getOject() {
        return object;
    }

    public void setPrice(String price) {
        this.object = price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public String getText() {
        return text;
    }


}
