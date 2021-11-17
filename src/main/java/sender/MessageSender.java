package sender;

import facebook.FacebookUser;
import twitter.TwitterUser;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        if (user.getCountry() == null ? country == null : user.getCountry().equals(country)) {
            System.out.println("This user received message: " + text);
            return true;
        }
        return false;
    }
}
