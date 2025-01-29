package org.merchant.entity;

import jakarta.persistence.*;

@Entity
@Table(name="merchant")
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;

    private String name;
    private String email;
    private String phone_Number;
    private String address;
    private String gst_No;
    private String pan_No;
    private String status;

    public Merchant(){

    }

    public Merchant(String name, String email, String phoneNumber, String address, String gstNo, String panNo){
    this.name = name;
    this.email = email;
    this.phone_Number = phoneNumber;
    this.address = address;
    this.gst_No = gstNo;
    this.pan_No = panNo;

    }


    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phoneNumber) {
        this.phone_Number = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGst_No() {
        return gst_No;
    }

    public void setGst_No(String gstNo) {
        this.gst_No = gstNo;
    }

    public String getPan_No() {
        return pan_No;
    }

    public void setPan_No(String panNo) {
        this.pan_No = panNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return "Mid:"+getMid()+", name:"+getName()+", Email"+getEmail()+", Phone:"+getPhone_Number()+", Address"+getAddress()+", GST No:"+getGst_No()+", PAN no:"+getPan_No()+", Status: "+getStatus();
    }
}
