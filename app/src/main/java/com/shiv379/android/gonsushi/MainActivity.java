package com.shiv379.android.gonsushi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;
import java.util.ArrayList;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
private Random randomGenerator;
private ArrayList<String> quoteList = new ArrayList<String>();
private Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        randomGenerator = new Random();
        quoteList.add("“Best fresh sushi I\'ve had in UK”");
        quoteList.add("“Amazing food”");
        quoteList.add("“Japanese food heaven”");
        quoteList.add("“Well worth a visit”");
        quoteList.add("“Beautiful food”");
        quoteList.add("“Amazing!”");
        quoteList.add("“Mysterious Japanese restaurant”");
        quoteList.add("“Like a weird parallel universe”");
        quoteList.add("“The best and only sushi place in Uxbridge”");
        quoteList.add("“Ledge”");
        quoteList.add("“Great sushi at Gon Sushi!”");
        quoteList.add("“Go. Just...just go.”");
        quoteList.add("“A truly genius idea”");
        quoteList.add("“Sushi and a pint”");
        quoteList.add("“Delicious food in an unexpected place!”");
        quoteList.add("“Beautiful food and wonderful staff!”");
        quoteList.add("“A hidden diamond in the rough”");
        quoteList.add("“Excellent taste! I love it!”");
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        TextView t = (TextView) findViewById(R.id.quote);
                        t.setText(quoteList.get(randomGenerator.nextInt(quoteList.size())));
                    }});
            }
        }, 5000, 5000);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goSecondView(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
