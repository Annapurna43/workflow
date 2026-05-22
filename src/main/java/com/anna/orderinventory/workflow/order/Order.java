package com.anna.orderinventory.workflow.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Order {
    private int orderId;
    private String orderType;
    private String orderStatus;

}
