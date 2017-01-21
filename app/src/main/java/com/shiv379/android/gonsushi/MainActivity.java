package com.shiv379.android.gonsushi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import java.util.Random;
import java.util.ArrayList;

import java.util.Timer;

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

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t = (TextView) findViewById(R.id.quote);
        final Animation out = new AlphaAnimation(1.0f, 0.0f);
        out.setDuration(2000);
        out.setStartOffset(5000);

        final Animation in = new AlphaAnimation(0.0f, 1.0f);
        in.setDuration(2000);

        out.setAnimationListener(new Animation.AnimationListener(){

            @Override
            public void onAnimationEnd(Animation arg0) {
                // start animation2 when animation1 ends (continue)
                t.setText(quoteList.get(randomGenerator.nextInt(quoteList.size())));
                t.startAnimation(in);
            }

            @Override
            public void onAnimationRepeat(Animation arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationStart(Animation arg0) {
                // TODO Auto-generated method stub

            }

        });

        in.setAnimationListener(new Animation.AnimationListener(){

            @Override
            public void onAnimationEnd(Animation arg0) {
                // start animation1 when animation2 ends (repeat)
                t.startAnimation(out);
            }

            @Override
            public void onAnimationRepeat(Animation arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationStart(Animation arg0) {
                // TODO Auto-generated method stub

            }

        });


        t.startAnimation(out);

    }
    public void goSecondView(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
