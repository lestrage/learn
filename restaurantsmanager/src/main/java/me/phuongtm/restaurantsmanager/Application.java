package me.phuongtm.restaurantsmanager;

import me.phuongtm.restaurantsmanager.core.Manager;
import me.phuongtm.restaurantsmanager.core.RestaurantManager;
import me.phuongtm.restaurantsmanager.dao.JDBCDriverConnection;

public class Application {

    public static void main(String[] args) {
        JDBCDriverConnection.connect();
        Manager manager = new RestaurantManager();
        manager.handle();
    }

}
