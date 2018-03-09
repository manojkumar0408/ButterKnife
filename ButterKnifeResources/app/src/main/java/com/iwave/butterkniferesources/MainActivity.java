package com.iwave.butterkniferesources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity {
    //invoking the textview,colors and strings usiing id's
    @BindView(R.id.titleTextView)
    TextView mTitleTextView;
    @BindView(R.id.subTitleTextView)
    TextView mSubTitleTextView;
    @BindString(R.string.title)
    String title;
    //invoking color the colors.xml
    @BindColor(R.color.colorAccent)
    int accentColor;

    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //binding the view from this activity
        //if the statement is not written the app will be force closed ....
        ButterKnife.bind(this);

    }

    //switch case for the both buttons using the bind view
    @OnClick({R.id.subTitleButton, R.id.titleButton})

    public void OnClick(View v) {
        this.v = v;
        //getting the id's into the view
        switch (v.getId()) {
            //1st case for title button
            case R.id.titleButton:
                //setting text for mTitleTextView
                mTitleTextView.setText("welcome to Butter Knife and clicked on 1st Button      " + title);
                //break for the case
                break;
            //2nd case for subTitleButton
            case R.id.subTitleButton:
                //Setting text for subTitleTextView of subtitle
                mSubTitleTextView.setText("bindview and clicked on 2nd  button ");
                //setting color for the second text view
                mSubTitleTextView.setTextColor(accentColor);
                //break for the 2nd case
                break;
        }
    }

    //longclick for the title button gives another text
    //invoking button using its id
    @OnLongClick(R.id.titleButton)
    //method for longclick of titleButton
    public boolean OnButtonClicked() {
        //setting text for the subTitleTExtView and adding the color
        mSubTitleTextView.setText("longclicked 1st button and id of color" + accentColor);
        //return statement for the boolean method
        return false;
    }



    /*we can invoke these methods using plugins
    like "Butterknife Zelezny"
    it helps to invoke buttons and textviews by using their ids
    on single click
    and also we can arrange te buttons in switch
    or we can split them into individuals
     */


}
