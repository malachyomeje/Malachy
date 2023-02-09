package week3.services;

import week3.interfaces.CashierServiceInterface;
import week3.product.Cart;

import java.util.PriorityQueue;
import java.util.Queue;

public class CashierService implements CashierServiceInterface {
    private static PriorityQueue<Cart> checkOutPriorityQueue = new PriorityQueue<>(new MalachyCompare());
    public static PriorityQueue<Cart> getCheckOutPriorityQueue() {return checkOutPriorityQueue;}
    public static void setCheckOutPriorityQueue(PriorityQueue<Cart> checkOutPriorityQueue) {
        CashierService.checkOutPriorityQueue = checkOutPriorityQueue;}

    public String checkOut(){
        if((checkOutPriorityQueue.size())>0){
            checkOutPriorityQueue.peek();
            return "Items Sold successfully "+checkOutPriorityQueue.peek().toString();
        }
        return "No one is on queue";
    }

}