package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cho8 on 2016-09-13.
 */
public class Tweet {
    private String message;
    private Date date;

    public Tweet(String message) {

        this.message = message;
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            //Do Something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {

        this.date = date;
    }

    public String getMessage() {

        return message;
    }

    public Date getDate() {

        return date;
    }
}