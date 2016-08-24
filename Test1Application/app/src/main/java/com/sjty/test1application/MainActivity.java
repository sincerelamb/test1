package com.sjty.test1application;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends Activity {


    @Bind(R.id.ti)
    TextView ti;
    @Bind(R.id.left1)
    TextView left1;
    @Bind(R.id.left2)
    TextView left2;
    @Bind(R.id.left3)
    TextView left3;
    @Bind(R.id.left4)
    TextView left4;
    @Bind(R.id.left5)
    TextView left5;
    @Bind(R.id.left6)
    TextView left6;
    @Bind(R.id.left7)
    TextView left7;
    @Bind(R.id.left)
    RelativeLayout left;
    @Bind(R.id.right0)
    RelativeLayout right0;
    @Bind(R.id.right00)
    TextView right00;
    @Bind(R.id.right01)
    TextView right01;
    @Bind(R.id.right02)
    TextView right02;
    @Bind(R.id.right03)
    TextView right03;
    @Bind(R.id.right04)
    TextView right04;
    @Bind(R.id.right05)
    TextView right05;
    @Bind(R.id.right06)
    TextView right06;
    @Bind(R.id.right07)
    TextView right07;
    @Bind(R.id.right10)
    TextView right10;
    @Bind(R.id.right11)
    TextView right11;
    @Bind(R.id.right12)
    TextView right12;
    @Bind(R.id.right13)
    TextView right13;
    @Bind(R.id.right14)
    TextView right14;
    @Bind(R.id.right15)
    TextView right15;
    @Bind(R.id.right16)
    TextView right16;
    @Bind(R.id.right17)
    TextView right17;
    @Bind(R.id.right1)
    RelativeLayout right1;

    int l1 = 1434;
    int l2 = 1464;
    int l3 = 106;
    int l4 = 90;
    int l5 = 91;
    int l6 = 52;
    int l7 = 109;

    int r00 = 17431;
    int r01 = 1263;
    int r02 = 1357;
    int r03 = 106;
    int r04 = 38;
    int r05 = 31;
    int r06 = 20;
    int r07 = 4;

    int r10 = 171;
    int r11 = 1503;
    int r12 = 107;
    int r13 = 57;
    int r14 = 52;
    int r15 = 60;
    int r16 = 32;
    int r17 = 105;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
        loaddata();
    }

    public void initView() {

    }

    public void loaddata() {

        left1.setText(String.valueOf(l1));
        left2.setText(String.valueOf(l2));
        left3.setText(String.valueOf(l3));
        left4.setText(String.valueOf(l4));
        left5.setText(String.valueOf(l5));
        left6.setText(String.valueOf(l6));
        left7.setText(String.valueOf(l7));

        right00.setText(String.valueOf(r00));
        right01.setText(String.valueOf(r01));
        right02.setText(String.valueOf(r02));
        right03.setText(String.valueOf(r03));
        right04.setText(String.valueOf(r04));
        right05.setText(String.valueOf(r05));
        right06.setText(String.valueOf(r06));
        right07.setText(String.valueOf(r07));

        right10.setText(String.valueOf(r10));
        right11.setText(String.valueOf(r11));
        right12.setText(String.valueOf(r12));
        right13.setText(String.valueOf(r13));
        right14.setText(String.valueOf(r14));
        right15.setText(String.valueOf(r15));
        right16.setText(String.valueOf(r16));
        right17.setText(String.valueOf(r17));


        right04.setWidth(width(r03,r13,r04,r14));
        right05.setWidth(width(r03,r13,r05,r15));
        right06.setWidth(width(r03,r13,r06,r16));
        right07.setWidth(width(r03,r13,r07,r17));
        
        right14.setWidth(width(r03,r13,r04,r14));
        right15.setWidth(width(r03,r13,r05,r15));
        right16.setWidth(width(r03,r13,r06,r16));
        right17.setWidth(width(r03,r13,r07,r17));
    }
    public int width(int a,int b,int c,int d){
        float i = 0;int j = 0;
        i = (c+d)*1.0f*110/(a+b);
        Log.v("123",String.valueOf(i)+","+String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+","+String.valueOf(d));
        j = (int)i+30;
        Log.v("123",String.valueOf(j));
        return j;
    }


}