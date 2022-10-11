package week3.product;

import week3.person.Customer;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Comparable<Cart>{
    //private Customer customer;
    private List<Product> cartList = new ArrayList<Product>();

    public List<Product> getCartList() {return cartList;}
    public void setCartList(List<Product> cartList) {this.cartList = cartList;}

    @Override
    public String toString() {
        return "\n" +
                "cartList\n" + cartList +
                '}';
    }
    public int compareTo(Cart customerCart){
        if(this.cartList.size()>customerCart.cartList.size()){
            return -1;
        } return 1;
    }


}
