package com.forfan.bigbang.customtext;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.forfan.bigbang.R;

public class CustomTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_text);
        CharSequence selectedText = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) ? getIntent().getCharSequenceExtra(Intent.EXTRA_PROCESS_TEXT) : null;
        ((TextView) findViewById(R.id.textShowContent)).setText(selectedText==null?"null":selectedText);
    }
}
