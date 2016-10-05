package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This is an abstract class for tweets. All tweet type classes should extend from this class
 * @see NormalTweet
 * @see ImportantTweet
 * @author watts1 on 9/13/16.
 */
public abstract class Tweet  {
    private String message;
    private Date date;

    /**
     * This constructor instantiates a new abstract Tweet type using a string. The date is set to a
     * default value (today's date) as a Date type.
     * @param message The message to be set as the tweet. This is a String type.
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * This constructor instantiates a new abstract Tweet type using a string and a Date type.
     * @param message The message of the tweet. This is a String type.
     * @param date    The date the tweet was created.
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }


    /**
     * This is an abstract class for ImportantTweet.
     * @see ImportantTweet
     * @return Boolean variable flagging whether or not a tweet is important.
     */
    public abstract Boolean isImportant();

    /**
     * This method sets the message of the class with a message of appropriate length.
     * @param message The message of the tweet. This is a String type.
     * @throws TweetTooLongException If a message is over 140 characters, this method will throw
     *         this exception.
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            //Do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * This method sets the date of the class with a Date object.
     * @param date The date assigned to a tweet
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets the tweet's message. Implemented from the Tweetable interface.
     * @return The message of the tweet.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets the date the tweet was created or set.
     * @return The date the tweet was created or set
     */
    public Date getDate() {
        return date;
    }

    /**
     * An override of the toString method to give a String representation of the date and message
     * of the Tweet.
     * @return the date and message of the Tweet as a String.
     */
    @Override
    public String toString(){
        return  date.toString() + " | " + message;
    }

}
