package com.aceappltd.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    TextView mTextViewTitle;
    TextView mTextViewText;
    TextView mTextViewFoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        mTextViewTitle = findViewById(R.id.scroll_title);
        mTextViewText = findViewById(R.id.scroll_text);
        mTextViewFoot = findViewById(R.id.scroll_foot);

        Bundle bundle = getIntent().getExtras();
        int position = 0;
        if(bundle != null){
            position = bundle.getInt("position");
        }

        setTitle("Item " + position);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        addText();
    }

    private void addText(){

        mTextViewTitle.setText(R.string.sample_title);
        mTextViewText.setText(R.string.sample_text);
        mTextViewFoot.setText(R.string.sample_foot);

    }
}
