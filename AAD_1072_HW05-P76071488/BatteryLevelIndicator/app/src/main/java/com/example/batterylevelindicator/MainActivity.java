package com.example.batterylevelindicator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mimageView;
    private int battery_id = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mimageView = findViewById(R.id.imageView_battery);
    }

    public void plusOnclick(View view){
        battery_id++;
        if(battery_id > 7){
            battery_id = 7;
        }
        show();
    }
    public void minusOnclick(View view){
        battery_id--;
        if(battery_id < 1){
            battery_id = 1;
        }
        show();
    }


    private void show(){
        switch (battery_id){
            case 1:
                mimageView.setImageLevel(0);
                break;
            case 2:
                mimageView.setImageLevel(1);
                break;
            case 3:
                mimageView.setImageLevel(2);
                break;
            case 4:
                mimageView.setImageLevel(3);
                break;
            case 5:
                mimageView.setImageLevel(4);
                break;
            case 6:
                mimageView.setImageLevel(5);
                break;
            case 7:
                mimageView.setImageLevel(6);
                break;
            default:
                mimageView.setImageLevel(0);
                break;
        }

    }
}
