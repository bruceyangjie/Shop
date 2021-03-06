package com.deepblue.shop.Business.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 欢大哥 on 2016/5/23.
 */
public class GoodsInfo implements Parcelable {
    private String goodsUrl;    //商品(积分、优惠券等)图片
    private String goodsTitle;   //商品(积分、优惠券等)名称
    private double goodsPrice;   //商品价格
    private int goodsNum;    //商品数量
    private String goodsBusinessName;   //商家名字
    private Boolean isHave;   //商家名称头判断
    private int type;     //订单的时候类型判断
    private int isEndType;   //是否是本商家最后一个商品
    private String goodsDescroption;  //商品描述


    /**
     * 积分
     */
    private String pointTime;   //积分时间
    private int pointNum;   //积分数量

    /**
     * 优惠券
     */
    private String couponTime;   //优惠券使用期限
    private int couponPrice;    //优惠券使用金额
    private String couponLimit;  //优惠券使用权限

    public String getGoodsDescroption() {
        return goodsDescroption;
    }

    public void setGoodsDescroption(String goodsDescroption) {
        this.goodsDescroption = goodsDescroption;
    }

    public String getCouponTime() {
        return couponTime;
    }

    public void setCouponTime(String couponTime) {
        this.couponTime = couponTime;
    }

    public int getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(int couponPrice) {
        this.couponPrice = couponPrice;
    }

    public String getCouponLimit() {
        return couponLimit;
    }

    public void setCouponLimit(String couponLimit) {
        this.couponLimit = couponLimit;
    }

    public String getPointTime() {
        return pointTime;
    }

    public void setPointTime(String pointTime) {
        this.pointTime = pointTime;
    }

    public int getPointNum() {
        return pointNum;
    }

    public void setPointNum(int pointNum) {
        this.pointNum = pointNum;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Boolean getHave() {
        if (isHave == null){
            return false;
        }
        return isHave;
    }

    public void setHave(Boolean have) {
        isHave = have;
    }

    public String getGoodsUrl() {
        return goodsUrl;
    }

    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsBusinessName() {
        return goodsBusinessName;
    }

    public void setGoodsBusinessName(String goodsBusinessName) {
        this.goodsBusinessName = goodsBusinessName;
    }

    public int getIsEndType() {
        return isEndType;
    }

    public void setIsEndType(int isEndType) {
        this.isEndType = isEndType;
    }

    public GoodsInfo(){

    }
    protected GoodsInfo(Parcel in) {
        goodsUrl = in.readString();
        goodsTitle = in.readString();
        goodsPrice = in.readDouble();
        goodsNum = in.readInt();
        goodsBusinessName = in.readString();
        isHave = in.readByte() != 0;
        type = in.readInt();
        isEndType = in.readInt();
        goodsDescroption = in.readString();
    }

    public static final Creator<GoodsInfo> CREATOR = new Creator<GoodsInfo>() {
        @Override
        public GoodsInfo createFromParcel(Parcel in) {
            return new GoodsInfo(in);
        }

        @Override
        public GoodsInfo[] newArray(int size) {
            return new GoodsInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(goodsUrl);
        parcel.writeString(goodsTitle);
        parcel.writeDouble(goodsPrice);
        parcel.writeInt(goodsNum);
        parcel.writeString(goodsBusinessName);
        parcel.writeByte((byte) (isHave ? 1 : 0));
        parcel.writeInt(type);
        parcel.writeInt(isEndType);
        parcel.writeString(goodsDescroption);
    }
}
