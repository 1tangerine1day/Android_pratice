package com.example.counterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        editText = (EditText) findViewById(R.id.editText);

        if (savedInstanceState != null) {
            // Restore value of members from saved state
            editText.setText(savedInstanceState.getString("editText_state"));
            mShowCount.setText(Integer.toString(savedInstanceState.getInt("counterText_state")));
            mCount = savedInstanceState.getInt("counterText_state");
        }

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putString("editText_state", editText.getText().toString());
        savedInstanceState.putInt("counterText_state", mCount);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

}
