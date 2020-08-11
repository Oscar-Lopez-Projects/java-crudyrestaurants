package com.lambdaschool.crudyrestaurants.repositories;

import com.lambdaschool.crudyrestaurants.models.Payment;
import org.springframework.data.repository.CrudRepository;

//in order to connect all the models classes to the app, we need to create a repository like this
public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
