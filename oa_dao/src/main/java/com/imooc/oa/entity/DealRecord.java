package com.imooc.oa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
//处理记录
public class DealRecord {
    private Integer id;

    private Integer claimVoucherId;   //报销单编号

    private String dealSn;   //处理人编号          ，处理人在表现层呈现的时候，肯定不能显示编号 ， 所以会声明Employee类型的dealer进行数据传递1

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")    /*时间样式*/
    private Date dealTime;         // 处理时间

    private String dealWay;

    private String dealResult;

    private String comment;      //对这次处理的意见

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClaimVoucherId() {
        return claimVoucherId;
    }

    public void setClaimVoucherId(Integer claimVoucherId) {
        this.claimVoucherId = claimVoucherId;
    }

    public String getDealSn() {
        return dealSn;
    }

    public void setDealSn(String dealSn) {
        this.dealSn = dealSn;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealWay() {
        return dealWay;
    }

    public void setDealWay(String dealWay) {
        this.dealWay = dealWay;
    }

    public String getDealResult() {
        return dealResult;
    }

    public void setDealResult(String dealResult) {
        this.dealResult = dealResult;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    private Employee dealer;      //1所以会声明Employee类型的dealer进行数据传递

    public Employee getDealer() {
        return dealer;
    }

    public void setDealer(Employee dealer) {
        this.dealer = dealer;
    }
}