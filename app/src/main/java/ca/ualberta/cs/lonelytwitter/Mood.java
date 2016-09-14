package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cho8 on 2016-09-13.
 */
public abstract class Mood {
    private Date date;

    public Mood() {
        this.date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    public abstract String returnMoodString();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
