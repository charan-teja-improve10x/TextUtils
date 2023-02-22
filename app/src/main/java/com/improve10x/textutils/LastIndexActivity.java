package com.improve10x.textutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LastIndexActivity extends AppCompatActivity {
    EditText lastIndexTxt;
    EditText lastPosition;
    Button verifyLastIndexBtn;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_index);
        initViews();
        handleVerifyBtn();
    }

    private void initViews() {
       lastIndexTxt = findViewById(R.id.last_index_txt);
       lastPosition = findViewById(R.id.last_position);
       verifyLastIndexBtn = findViewById(R.id.verify_last_index_btn);
       resultTxt = findViewById(R.id.result_txt);
    }

    public String correctAnswer(String originalText, String text){
        String result = "";
        result = String.valueOf(originalText.lastIndexOf(text));
        return result;
    }

    public void verifyAnswer(){
        String originolString = lastIndexTxt.getText().toString();
        String text = lastPosition.getText().toString();
        String result = correctAnswer(originolString, text);
        resultTxt.setText(result);
    }

    public void handleVerifyBtn(){
        verifyLastIndexBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }
}