package com.bookstore.Service;

import com.bookstore.Entity.Order;
import com.bookstore.Entity.ShoppingCart;
import com.bookstore.Entity.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart, User user);
	
	Order findOne(Long id);
}
