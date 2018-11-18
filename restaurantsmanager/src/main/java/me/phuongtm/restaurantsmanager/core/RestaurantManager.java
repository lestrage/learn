package me.phuongtm.restaurantsmanager.core;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import me.phuongtm.restaurantsmanager.entities.Dish;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestaurantManager implements Manager {

    private static final Logger LOG = LoggerFactory.getLogger(RestaurantManager.class);

    private Scanner scn = new Scanner(System.in);

    public void handle() {
        while (true) {
            int selection = showMenu();
            switch (selection) {
                case 1:
                    Dish dish = getDishInfo();
                    createDish(dish);
                    break;
                case 2:
                    readDish();
                    break;
                case 3:
                    updateDish(null);
                    break;
                case 4:
                    deleteDish(-1);
                    break;
                case 5:
                    checkDishOrderedByCustomer(-1);
                    break;
                case 6:
                    showDishByDate(new Date(), new Date());
                    break;
                default:
                    LOG.info("Please choose from 1 to 6");
                    break;
            }
        }
    }

    private Dish getDishInfo() {
        LOG.info("Enter name: ");
        String name = scn.next();
        LOG.info("Enter meta data:");
        String metaData = scn.next();
        return new Dish.Builder()
                .withName(name)
                .withMetaData(metaData)
                .build();
    }

    public int showMenu() {
        LOG.info("=========================");
        LOG.info("1. Create the dish");
        LOG.info("2. Read the dish");
        LOG.info("3. Update the dish");
        LOG.info("4. Delete the dish");
        LOG.info("5. Check the dish");
        LOG.info("6. Show the dish");
        return scn.nextInt();
    }

    public void createDish(Dish dish) {
        LOG.info("CREATED " + dish.toString());
    }

    public Dish readDish() {
        return null;
    }

    public Dish updateDish(Dish dish) {
        return null;
    }

    public void deleteDish(int id) {

    }

    public void checkDishOrderedByCustomer(int customerId) {

    }

    public List<Dish> showDishByDate(Date fromDate, Date toDate) {
        return null;
    }
}
