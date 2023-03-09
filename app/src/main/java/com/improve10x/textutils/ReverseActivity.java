package com.improve10x.textutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReverseActivity extends AppCompatActivity {
    EditText originalReverseTxt;
    Button verifyReverseBtn;
    TextView resultReverseTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);
        initViews();
        handleVerifyBtn();
    }

    private void initViews() {
        originalReverseTxt = findViewById(R.id.original_reverse_txt);
        verifyReverseBtn = findViewById(R.id.verify_reverse_btn);
        resultReverseTxt = findViewById(R.id.result_reverse_txt);
    }

    public void verifyCorrectAnswer(){
       String originalText = originalReverseTxt.getText().toString();
       String result = correctAnswer(originalText);
       resultReverseTxt.setText(result);
    }

    public String correctAnswer(String originalTxt){
        String result = "";
        StringBuilder name = new StringBuilder(originalTxt);
        name.reverse();
        result = name.toString();
        return  result;
    }

    public void handleVerifyBtn(){
        verifyReverseBtn.setOnClickListener(v -> {
            verifyCorrectAnswer();
        });
    }
}