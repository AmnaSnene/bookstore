package com.bookstore.Service;

import java.util.List;

import com.bookstore.Entity.Book;
import com.bookstore.Entity.CartItem;
import com.bookstore.Entity.Order;
import com.bookstore.Entity.ShoppingCart;
import com.bookstore.Entity.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addBookToCartItem(Book book, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
