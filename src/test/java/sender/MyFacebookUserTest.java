package sender;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class MyFacebookUserTest {
    FacebookUser facebookUser;
    MyFacebookUser adapterUser;

    @BeforeEach
    void setUp() {
        facebookUser = new FacebookUser("lalaland@gmail.com", "USA", new Date());
        adapterUser = new MyFacebookUser(facebookUser);
    }

    @Test
    void getCountry() {
        assertEquals(adapterUser.getCountry(), facebookUser.getUserCountry());
    }

    @Test
    void getLastActive() {
        assertEquals(adapterUser.getLastActive(), facebookUser.getUserActiveTime());
    }

    @Test
    void getEmail() {
        assertEquals(adapterUser.getEmail(), facebookUser.getEmail());
    }
}