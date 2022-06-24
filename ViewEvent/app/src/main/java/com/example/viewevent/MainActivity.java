package com.example.viewevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Myview myview = new Myview(this);
        setContentView(myview);
        setContentView(R.layout.activity_main);
    }

    class Myview extends View {
        Myview(Context context){
            super(context);
            setBackgroundColor(Color.GREEN);
        }

        public boolean onTouchEvent(MotionEvent event){
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                Toast.makeText(MainActivity.this, "View 클래스를 상속받아 만든 이벤트 처리",
                         Toast.LENGTH_SHORT).show();
            }
            return false;
        }
    }
}