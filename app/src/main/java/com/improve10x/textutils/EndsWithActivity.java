package com.improve10x.textutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EndsWithActivity extends AppCompatActivity {
    EditText endEnterTxt;
    EditText suffixTxt;
    Button verifyEndBtn;
    TextView modifidetextTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ends_with);
        initViews();
        handleVerifyBtn();
    }

    private void initViews() {
        endEnterTxt = findViewById(R.id.end_enter_txt);
        suffixTxt = findViewById(R.id.suffix_txt);
        verifyEndBtn = findViewById(R.id.verify_end_btn);
        modifidetextTxt = findViewById(R.id.modifiedtext_txt);
    }

    public boolean checkEndCharSequence(String originalTxt, String suffixTxt) {
        boolean result = false;
        result = originalTxt.endsWith(suffixTxt);
        return result;
    }

    public void displayedModifiedText() {
        String originalText = endEnterTxt.getText().toString();
        String suffixText = suffixTxt.getText().toString();
        boolean modifiedText = checkEndCharSequence(originalText, suffixText);
        modifidetextTxt.setText(modifiedText + "");
    }

    public void handleVerifyBtn() {
        verifyEndBtn.setOnClickListener(v -> {
            displayedModifiedText();
        });
    }
}