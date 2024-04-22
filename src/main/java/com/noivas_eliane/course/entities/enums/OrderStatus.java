package com.noivas_eliane.course.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(0),
    PAID(1),
    SHIPPED(2),
    DELIVERED(3),
    CANCELED(4);

    private int code;

    private OrderStatus(int code) {this.code = code;}
    public int getCode() {return code;}
    public static OrderStatus valueOf(int code) {
         for (OrderStatus status : OrderStatus.values()) {
             if (status.getCode() == code) {
                 return status;
             }
         }
         throw new IllegalArgumentException("No enum constant " + OrderStatus.class + " with code " + code);
    }


}
