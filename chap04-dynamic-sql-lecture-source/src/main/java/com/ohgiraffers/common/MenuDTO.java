package com.ohgiraffers.common;

public class MenuDTO implements java.io.Serializable{


    private int code;
    private String name;
    private int price;
    private int categoryCode;
    private String orderableStatus;

    public MenuDTO() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderbleStatus() {
        return orderableStatus;
    }

    public void setOrderbleStatus(String orderbleStatus) {
        this.orderableStatus = orderbleStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categoryCode=" + categoryCode +
                ", orderbleStatus='" + orderableStatus + '\'' +
                '}';
    }
}
