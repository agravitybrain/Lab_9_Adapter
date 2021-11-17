package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {
    БазаДаних patrioticDB;
    DataBase betrayedDB;

    @BeforeEach
    void setUp() {
        betrayedDB = new DataBase();
        patrioticDB = new БазаДаних();
    }

    @Test
    void getUserData() {
        assertEquals(betrayedDB.getUserData(), patrioticDB.отриматиДаніКористувача());
    }

    @Test
    void getStatisticalData() {
        assertEquals(betrayedDB.getStatisticalData(), patrioticDB.отриматиСтатистичніДані());
    }
}