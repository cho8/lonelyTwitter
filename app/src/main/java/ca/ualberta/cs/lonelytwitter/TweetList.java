package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.List;

/**
 * This is the class contains a list of Tweets. This tweet contains a List type parametrized with
 * Tweet objects.
 * @see Tweet
 * @author cho8 on 2016-09-27.
 */
public class TweetList {
    /**
     * This is the list of available tweets.
     */
    List<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * This method adds a tweet to its current list. If the tweet exists in the list,
     * it is a duplicate. After a tweet is added, the list will be sorted.
     * @param tweet The tweet to be added to the list
     * @exception IllegalArgumentException
     */
    public void add(Tweet tweet) {
        if (hasTweet(tweet)) {
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
        sortTweets();
    }

    /**
     * This method checks if the target tweet is contained in the list.
     * @param tweet the tweet to be added to the list
     * @return the boolean indicating whether the tweet exists in the list.
     */
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    /**
     * Get the tweet at the i'th position in the list.
     * @param i the index of the list the target tweet is at
     * @return the Tweet at the ith position
     */
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    /**
     * Removes the tweet from the list. The list is sorted after removal.
     * @param a the tweet to be removed from the list
     */
    public void removeTweet(Tweet a) {
        tweets.remove(a);
        sortTweets();
    }

    /**
     * Sorts the tweets based on chronological order (i.e. by the tweet's date).
     */
    private void sortTweets() {
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });
    }

    /**
     * Count the number of tweets contained in this list by retuning the size of the list.
     * @return the number of tweets in the list.
     */
    public int count() {
        return tweets.size();
    }
}
