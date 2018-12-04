package com.example.ye.leon;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
//    static {
//        System.loadLibrary("native-lib");
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_drawer_layout);

        Toolbar toolbar = findViewById(R.id.home_tool_bar);
        setSupportActionBar(toolbar);
        setUpToolBar();
        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
//        tv.setText(stringFromJNI());
    }

    private void setUpToolBar(){
        ActionBar toolbar = getSupportActionBar();
        toolbar.setDisplayShowHomeEnabled(false);
        toolbar.setDisplayShowTitleEnabled(false);
    }

    private void insertPerons(){

    }
//    /**
//     * A native method that is implemented by the 'native-lib' native library,
//     * which is packaged with this application.
//     */
//    public native String stringFromJNI();
}
