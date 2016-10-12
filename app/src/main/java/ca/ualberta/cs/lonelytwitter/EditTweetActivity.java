package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    String tweetString;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            tweetString = (String) extras.get("tweet");
        }

        textView = (TextView) findViewById(R.id.textView);
        textView.setText(tweetString);
    }
}
