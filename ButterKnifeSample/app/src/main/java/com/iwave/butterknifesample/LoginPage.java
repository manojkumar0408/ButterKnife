package com.iwave.butterknifesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by user on 3/8/2018.
 */

public class LoginPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        Toast.makeText(this, "Login SuccessFul", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {

        //it is used to return to main app
        super.onBackPressed();

    }
}
