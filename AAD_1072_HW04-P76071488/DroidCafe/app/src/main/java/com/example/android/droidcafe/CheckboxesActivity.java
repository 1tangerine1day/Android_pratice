package com.example.android.droidcafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;


/**
 * This activity handles five checkboxes and a Show Toast button for displaying selected checkboxes
 */
public class CheckboxesActivity extends AppCompatActivity {

    private CheckBox chocolate_syrup,sprinkles,crushed_nuts,cherries,orio_cookie_crumbles;
    private boolean is_chocolate_syrup = false;
    private boolean is_sprinkles = false;
    private boolean is_crushed_nuts = false;
    private boolean is_cherries = false;
    private boolean is_orio_cookie_crumbles = false;
    private Button show_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkboxes);

        chocolate_syrup = (CheckBox)findViewById(R.id.chocolate_syrup);
        sprinkles = (CheckBox)findViewById(R.id.sprinkles);
        crushed_nuts = (CheckBox)findViewById(R.id.crushed_nuts);
        cherries = (CheckBox)findViewById(R.id.cherries);
        orio_cookie_crumbles = (CheckBox)findViewById(R.id.orio_cookie_crumbles);
        show_toast = (Button) findViewById(R.id.show_toast);

        chocolate_syrup.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    // checked
                    is_chocolate_syrup = true;
                }
                else
                {
                    // not checked
                    is_chocolate_syrup = false;
                }
            }
        });

        sprinkles.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    // checked
                    is_sprinkles = true;
                }
                else
                {
                    // not checked
                    is_sprinkles = false;
                }
            }
        });

        crushed_nuts.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    // checked
                    is_crushed_nuts = true;
                }
                else
                {
                    // not checked
                    is_crushed_nuts = false;
                }
            }
        });

        cherries.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    // checked
                    is_cherries = true;
                }
                else
                {
                    // not checked
                    is_cherries = false;
                }
            }
        });

        orio_cookie_crumbles.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    // checked
                    is_orio_cookie_crumbles = true;
                }
                else
                {
                    // not checked
                    is_orio_cookie_crumbles = false;
                }
            }
        });

        show_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if(is_chocolate_syrup)
                    s  = s + "Chocolate syrup ";
                if(is_sprinkles)
                    s  = s + "Sprinkles ";
                if(is_crushed_nuts)
                    s  = s + "Crushed nuts ";
                if(is_cherries)
                    s  = s + "Cherries ";
                if(is_orio_cookie_crumbles)
                    s  = s + "Orio cookie crumbles ";

                Toast toast = Toast.makeText(CheckboxesActivity.this, s, Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}
