package com.iwave.butterknifesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    Intent mGoToLogin;

    //invoking emailTextView by its id using bindView annotation
    @BindView(R.id.emailTextView)
    TextView mEmailTextView;
    //Assigning Variable to TextView


    // invoking passwordTextView by its id using bindView annotation
    @BindView(R.id.passwordTextView)
    TextView mPasswordTextView;
    //Assigning variable to password textView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding the view using butterknife
        ButterKnife.bind(this);
        //Setting-up text to the TextViews
        mEmailTextView.setText("Enter Your Email");
        mPasswordTextView.setText("Enter YOur Password");

    }

    @OnClick(R.id.loginButton)
    public void LoginButton() {

        //getting the context and invoking the class content into variable
        mGoToLogin = new Intent(getApplicationContext(), LoginPage.class);
        //starting the activity and implement this activity in manifest file for accessing
        startActivity(mGoToLogin);

    }

}
