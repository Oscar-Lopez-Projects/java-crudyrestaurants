package com.lambdaschool.crudyrestaurants.repositories;

import com.lambdaschool.crudyrestaurants.models.Restaurant;
import org.springframework.data.repository.CrudRepository;

//in order to connect all the models classes to the app, we need to create a repository like this
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
}
