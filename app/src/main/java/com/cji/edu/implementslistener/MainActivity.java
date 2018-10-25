package com.cji.edu.implementslistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2, btn3;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.tv1);

        // 버튼 권한 주고, 리스너에 등록
        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        String text = ((Button)v).getText().toString();

        switch(id){
            case R.id.btn1:
                tv1.setText(text);
                tv1.setBackgroundColor(0Xffff0000);
                break;
            case R.id.btn2:
                tv1.setText(text);
                tv1.setBackgroundColor(0Xff00ff00);
                break;
            case R.id.btn3:
                tv1.setText(text);
                tv1.setBackgroundColor(0Xff0000ff);
                break;
            default:
                tv1.setText("Retry!");
        }
    }
}
