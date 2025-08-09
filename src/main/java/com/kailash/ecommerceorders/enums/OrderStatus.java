package com.kailash.ecommerceorders.enums;

public enum OrderStatus {

    SUCCESS("Order is success"),
    PENDING("Order is on the way");

    private final String descrption;

    OrderStatus(String descrption)
    {
        this.descrption=descrption;
    }

    public String getDescrption()
    {
        return this.descrption;
    }

}
