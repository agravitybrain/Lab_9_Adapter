package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationTest {
    Авторизація patrioticAuth;
    Authentication betrayedAuth;
    DataBase db;

    @BeforeEach
    void setUp() {
        patrioticAuth = new Авторизація();
        betrayedAuth = new Authentication();
        db = new DataBase();
    }

    @Test
    void authorise() {
        assertEquals(betrayedAuth.authorise(db), patrioticAuth.авторизуватися(db));
    }
}