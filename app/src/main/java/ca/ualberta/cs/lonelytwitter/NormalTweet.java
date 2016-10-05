package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This is the class for a normal tweet. It extends the abstract Tweet class and implements methods
 * that a Tweet should contain.
 * @author watts1
 * @see Tweet
 * @see Tweetable
 */
public class NormalTweet extends Tweet implements Tweetable {

    /**
     * This constructer makes a NormalTweet with given string parameter.
     * @param message this paramter is the given string for the tweet.
     */
    public NormalTweet(String message){
        super(message);
    }

    /**
     * Instantiates a new Normal tweet with a message and a date.
     * @param message the message to be set as the tweet content.
     * @param date    the date the tweet was set at
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Overrides the Tweet method to indicate that it is NOT important
     * @return boolean indicating it is not important
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
