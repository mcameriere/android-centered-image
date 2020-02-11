package com.example.centeredimage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        String text = "Press M1 to continue";

        int startIndex = text.indexOf("M1");
        int endIndex = startIndex + "M1".length();

        SpannableString spannableString = new SpannableString(text);

        Drawable drawable = getDrawable(R.drawable.ic_ucr_m1);

        ReplacementSpan imageSpan = new CenteredImageSpan(drawable);

        spannableString.setSpan(imageSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannableString);

    }
}
