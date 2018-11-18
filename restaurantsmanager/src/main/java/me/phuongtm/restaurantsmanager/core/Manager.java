package me.phuongtm.restaurantsmanager.core;

import java.util.Date;
import java.util.List;

import me.phuongtm.restaurantsmanager.entities.Dish;

public interface Manager {

    void handle();
    int showMenu();
    void createDish(Dish dish);
    Dish readDish();
    Dish updateDish(Dish dish);
    void deleteDish(int id);
    void checkDishOrderedByCustomer(int customerId);
    List<Dish> showDishByDate(Date fromDate, Date toDate);

}
