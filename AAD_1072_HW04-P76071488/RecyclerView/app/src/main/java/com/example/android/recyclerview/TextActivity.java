package com.example.android.recyclerview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    TextView textView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 設定 Layout 為 main.xml
        setContentView(R.layout.activity_text);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String sessionId= getIntent().getStringExtra("EXTRA_SESSION_ID");
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(sessionId);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
