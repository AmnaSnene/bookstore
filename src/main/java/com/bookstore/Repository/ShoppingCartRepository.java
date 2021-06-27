package com.bookstore.Repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.Entity.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
