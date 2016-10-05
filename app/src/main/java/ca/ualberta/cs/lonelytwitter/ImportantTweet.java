package ca.ualberta.cs.lonelytwitter;

/**
 * This a class that extends Tweet. It differs from a NormalTweet by overriding isImportant to
 * return True.
 * @author watts1 on 9/13/16.
 * @see Tweet
 */
public class ImportantTweet extends Tweet {

    /**
     * This constructor creates the ImportantTweet and sets the message of the important tweet.
     * @param message the message to be set as the tweet.
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Overrides the method in the abstract Tweet class to return True, indicating that it is
     * an important class.
     * @return boolean indicating that it IS important.
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
