package com.example.android.getwebsourcecode;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private Button get;
    private TextView output;
    private String head = "http://";
    final String[] headArray = {"http://", "https://"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText)findViewById(R.id.input);
        get = (Button)findViewById(R.id.get_btn);
        output = (TextView)findViewById(R.id.output);

        Spinner http = (Spinner)findViewById(R.id.http);
        ArrayAdapter<CharSequence> httpList = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.http,
                android.R.layout.simple_spinner_dropdown_item);
        http.setAdapter(httpList);

        http.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                head = headArray[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                head = headArray[0];
            }
        });


    }

    public void search(View view) {
        // Get the search string from the input field.
        String queryString = input.getText().toString();

        // Hide the keyboard when the button is pushed.
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        if (inputManager != null) {
            inputManager.hideSoftInputFromWindow(view.getWindowToken(),
                    InputMethodManager.HIDE_NOT_ALWAYS);
        }

        // Check the status of the network connection.
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = null;
        if (connMgr != null) {
            networkInfo = connMgr.getActiveNetworkInfo();
        }

        // If the network is available, connected, and the search field
        // is not empty, start a FetchBook AsyncTask.
        if (networkInfo != null && networkInfo.isConnected()
                && queryString.length() != 0) {
            new FetchData(output).execute(head + queryString);
            output.setText("loading");
        }
        // Otherwise update the TextView to tell the user there is no
        // connection, or no search term.
        else {
            if (queryString.length() == 0) {
                output.setText("No search term");
            } else {
                output.setText("Check your internet connection and try again.");
            }
        }
    }
}
