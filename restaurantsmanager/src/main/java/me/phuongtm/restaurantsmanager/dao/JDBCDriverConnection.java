package me.phuongtm.restaurantsmanager.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBCDriverConnection {

    private static final Logger LOG = LoggerFactory.getLogger(JDBCDriverConnection.class);

    public static void connect() {
        Connection conn = null;
        String url = "jdbc:sqlite:/tmp/chinook.db";
        try {
            conn = DriverManager.getConnection(url);
            LOG.info("Connection has been established");
        } catch (SQLException e) {
            LOG.error("", e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    LOG.error("", e);
                }
            }
        }
    }

}
