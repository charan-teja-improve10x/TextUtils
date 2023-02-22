package com.improve10x.textutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IndexOfActivity extends AppCompatActivity {
    EditText originalString;
    EditText charPosition;
    Button verifyIndexBtn;
    TextView indexPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_of);
        initViews();
        handleVerifyBtn();
    }

    private void initViews() {
        originalString = findViewById(R.id.original_string);
        charPosition = findViewById(R.id.char_position);
        verifyIndexBtn = findViewById(R.id.verify_index_btn);
        indexPosition = findViewById(R.id.index_position);
    }

    public void verifyAnswer(){
        String originalText = originalString.getText().toString();
        String position = charPosition.getText().toString();
        String answer = correctAnswer(originalText,position);
        indexPosition.setText(answer);
    }

    public String correctAnswer(String originalString, String charPosition){
        String result = "";
        result = String.valueOf(originalString.indexOf(charPosition));
       return result + "";
    }

    public void handleVerifyBtn(){
        verifyIndexBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }
}
