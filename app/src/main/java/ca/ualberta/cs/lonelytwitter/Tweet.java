package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by cho8 on 2016-09-13.
 */
public abstract class Tweet {
    private String message;
    private Date date;
    private ArrayList<Mood> moodList;

    public Tweet(String message) {

        this.message = message;
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

    public ArrayList<Mood> getMoodList() {
        return this.moodList;
    }

    public void setMoodList(ArrayList<Mood> moodList) {
        this.moodList = moodList;
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
