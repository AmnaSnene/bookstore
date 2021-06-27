package com.bookstore.Repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.Entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
