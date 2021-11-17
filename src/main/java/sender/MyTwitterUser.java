package sender;

import twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser implements User{
    private TwitterUser user;

    public MyTwitterUser(TwitterUser user){
        this.user = user;
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public Date getLastActive() {
        return user.getLastActiveTime();
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }
}
