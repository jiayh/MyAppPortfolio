package com.example.android.myappportfolio;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void genToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = ((Button) view).getText();
        text = "This will launch my " + text + " app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        int[] loc = {0, 0};
        view.getLocationInWindow(loc);
        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, loc[1] + 10);
        toast.show();
    }
}
