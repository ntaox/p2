package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView Лайки;
    TextView Дизлайки;
    String str;
    int like, dislike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Лайки = (TextView)findViewById(R.id.textView);
        Дизлайки = (TextView)findViewById(R.id.textView2);

        like = 0;
        dislike = 0;
    }
    public void onDislike(View V) {

        dislike -= 1;
        str = Integer.toString(dislike);
        Дизлайки.setText(str);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Вам не понравилась картинка!:(", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onLike(View V) {

        like += 1;
        str = Integer.toString(like);
        Лайки.setText(str);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Вам понравилась картинка!:)", Toast.LENGTH_SHORT);
        toast.show();

    }
}