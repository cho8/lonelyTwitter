package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.List;

/**
 * Created by cho on 2016-09-27.
 */
public class TweetList {
    List<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) {
        if (hasTweet(tweet)) {
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
        sortTweets();
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    public void removeTweet(Tweet a) {
        tweets.remove(a);
        sortTweets();
    }

    private void sortTweets() {
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });
    }

    public int count() {
        return tweets.size();
    }
}
