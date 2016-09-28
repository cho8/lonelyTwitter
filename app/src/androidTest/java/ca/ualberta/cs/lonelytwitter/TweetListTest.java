package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.concurrent.TimeUnit;

/**
 * Created by cho8 on 2016-09-27.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Hello!");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
        int firstCount = list.count();

        try {
            list.add(tweet);
        } catch (IllegalArgumentException e) {
            assertEquals(firstCount, list.count());
        }
    }

    public void testHasTweet() {
        TweetList list = new TweetList();


        Tweet tweet = new NormalTweet("Hello!");

        assertFalse(list.hasTweet(tweet));
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList list = new TweetList();

        try {
            Tweet a = new NormalTweet("Hello!");
            Thread.sleep(1000); //Time is in milliseconds
            Tweet b = new NormalTweet("Hi!");
            Thread.sleep(2000); //Time is in milliseconds
            Tweet c = new NormalTweet("Hey!");
            Thread.sleep(3000); //Time is in milliseconds

            list.add(a);
            list.add(b);
            list.add(c);


            assertEquals(list.getTweet(0), a);
            assertEquals(list.getTweet(1), b);

            assertTrue(list.getTweet(0).getDate().compareTo(list.getTweet(1).getDate()) < 0);
            assertFalse(list.getTweet(2).getDate().compareTo(list.getTweet(1).getDate()) < 0);
        } catch (Exception e) {

        }



    }

    public void testRemoveTweet() {
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        list.add(a);
        assertTrue(list.hasTweet(a));

        list.removeTweet(a);
        assertFalse(list.hasTweet(a));

    }

    public void testCount() {
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("Hi!");
        Tweet c = new NormalTweet("Hey!");

        list.add(a);
        list.add(c);
        list.add(b);

        assertEquals(3, list.count());
    }


}
