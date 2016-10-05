package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * An interface for the methods a Tweet should implement. Each tweet should be able to get its
 * message and date.
 * @author watts1 on 9/13/16.
 * @see Tweet
 */
public interface Tweetable {
    /**
     * Gets the tweet's message.
     * @return the message of a tweet.
     */
    public String getMessage();

    /**
     * Gets the tweet's date that it was created or set
     * @return the date of the tweet.
     */
    public Date getDate();
}
