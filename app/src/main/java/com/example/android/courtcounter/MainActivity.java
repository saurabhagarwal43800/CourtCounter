package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int q1=0,q2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void incrementA3(View view)
    {
            q1=q1+3;
            display1(q1);
    }
    public void incrementA2(View view)
    {
            q1=q1+2;
            display1(q1);
    }
    public void incrementA1(View view)
    {
            q1=q1+1;
            display1(q1);
    }
    public void incrementB3(View view)
    {
            q2=q2+3;
            display2(q2);
    }
    public void incrementB2(View view)
    {
            q2=q2+2;
            display2(q2);
    }
    public void incrementB1(View view)
    {
            q2=q2+1;
            display2(q2);

    }
    public void reset(View view)
    {
            q1=0;
            q2=0;
            display1(q1);
            display2(q2);
    }
    private void display1(int number) {
        TextView TEAMA1 = (TextView) findViewById(R.id.TEAMA1);
        TEAMA1.setText("" + number);
    }
    private void display2(int number) {
        TextView TEAMB1 = (TextView) findViewById(R.id.TEAMB1);
        TEAMB1.setText("" + number);
    }
}
