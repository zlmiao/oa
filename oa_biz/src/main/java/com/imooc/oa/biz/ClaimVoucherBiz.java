package com.imooc.oa.biz;

import com.imooc.oa.entity.ClaimVoucher;
import com.imooc.oa.entity.ClaimVoucherItem;
import com.imooc.oa.entity.DealRecord;

import java.util.List;

public interface ClaimVoucherBiz {

    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);   //保存报销单基本信息和条目集合

    ClaimVoucher get(int id);                //获取报销单对象
    List<ClaimVoucherItem> getItems(int cvid);     //保险单条目
    List<DealRecord> getRecords(int cvid);     //审核记录


    List<ClaimVoucher> getForSelf(String sn);      //获取个人保险单，掺入的是员工编号
    List<ClaimVoucher> getForDeal(String sn);       //获取待处理报销单

    void update(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);   //声明修改报销单方法，，，，和保存报销单结构一样
    void submit(int id);
    void deal(DealRecord dealRecord);    //审核打款
}
