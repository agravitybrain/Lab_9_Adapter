package sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    TwitterUser twitterUser;
    MyTwitterUser adapterUser;

    @BeforeEach
    void setUp() {
        twitterUser = new TwitterUser("lalaland@gmail.com", "USA", new Date());
        adapterUser = new MyTwitterUser(twitterUser);
    }

    @Test
    void getCountry() {
        assertEquals(adapterUser.getCountry(), twitterUser.getCountry());
    }

    @Test
    void getLastActive() {
        assertEquals(adapterUser.getLastActive(), twitterUser.getLastActiveTime());
    }

    @Test
    void getEmail() {
        assertEquals(adapterUser.getEmail(), twitterUser.getUserMail());
    }
}