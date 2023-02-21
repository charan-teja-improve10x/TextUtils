package com.improve10x.textutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IsStartsWithActivity extends AppCompatActivity {
    EditText enterTxt;
    EditText prefixTxt;
    Button verifyBtn;
    TextView modifiedTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_starts_with);
        initViews();
        handleVerifyBtn();
    }

    private void initViews() {
        enterTxt = findViewById(R.id.enter_txt);
        prefixTxt = findViewById(R.id.prefix_txt);
        verifyBtn = findViewById(R.id.verify_btn);
        modifiedTxt = findViewById(R.id.modified_txt);
    }

    public boolean prefixText(String originalText, String prefixText){
        boolean modifiedText = false;
         modifiedText = originalText.startsWith(prefixText);
        return modifiedText;
    }

    public void displayCharSequence(){
       String originolText = enterTxt.getText().toString();
       String prefixText = prefixTxt.getText().toString();
       boolean modifiedText = prefixText(originolText,prefixText);
       modifiedTxt.setText(modifiedText + "");
    }
    public void handleVerifyBtn(){
        verifyBtn.setOnClickListener(v -> {
            displayCharSequence();
        });
    }
}