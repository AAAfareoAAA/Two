package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    int s;

    {
        s = 0;
    }
    int a;

    {
        a = 0;
    }
    TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        textView_1 = (TextView) findViewById(R.id.textView_1); // 初始化 TextView 对象

        Button btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s++;
                updateTextView(); // 更新 TextView 的内容
            }
        });

        Button btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s--;
                updateTextView();
            }
        });

        Button btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = a;
                updateTextView();
            }
        });

        // 初始化 TextView 的内容
        updateTextView();
    }

    // 自定义方法用于更新 TextView 的内容
    private void updateTextView() {
        textView_1.setText("The current number is " + s);
    }
}
