package com.improve10x.textutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReplaceActivity extends AppCompatActivity {
    EditText originalTxt;
    EditText oldTxt;
    EditText newTxt;
    Button verifyReplaceBtn;
    TextView changedTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_replace);
        initViews();
        handleVerifyBtn();
    }

    private void initViews() {
        originalTxt = findViewById(R.id.original_txt);
        oldTxt = findViewById(R.id.old_txt);
        newTxt = findViewById(R.id.new_txt);
        verifyReplaceBtn = findViewById(R.id.verify_replace_btn);
        changedTxt = findViewById(R.id.changed_txt);
    }

    public String displaysReplacingText(String originalText, String oldText, String newText){
        String changedText = "";
        changedText = originalText.replace(oldText,newText);
        return changedText;
    }

    public void displaymodifiedText(){
        String originalText = originalTxt.getText().toString();
        String oldText = oldTxt.getText().toString();
        String newText = newTxt.getText().toString();
        String changedText = displaysReplacingText(originalText, oldText, newText);
        changedTxt.setText(changedText);
    }

    public void handleVerifyBtn(){
        verifyReplaceBtn.setOnClickListener(v -> {
            displaymodifiedText();
        });
    }
}