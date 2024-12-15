package org.example.service.orderModule;

import java.util.Queue;

public class OrderQueue {
    private OrderQueue orderQueue;
    private Queue<Order> queue;

    public OrderQueue getInstance(){
        return this.orderQueue;
    }

    public void addOrder(Order order){
        this.queue.add(order);
    }

    public Order processOrder(){
        return this.queue.poll();
    }

}
