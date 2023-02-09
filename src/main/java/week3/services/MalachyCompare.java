package week3.services;

import week3.product.Cart;

import java.util.Comparator;

public class MalachyCompare implements Comparator<Cart> {
    @Override
    public int compare(Cart cart1, Cart cart2) {
        if(cart1.getCartList().size()==cart2.getCartList().size())
            return 0;
        return cart1.getCartList().size()>cart2.getCartList().size()?1:-1;
    }
}
