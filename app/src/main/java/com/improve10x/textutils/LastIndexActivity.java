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

    public int correctAnswer(String originalText, String suffix){
//        Take originalString - String, suffix - String
          int result = -1;
//        Declare result of int and assigned as -1
//        result = originalString.lastIndexOf(suffix)
        result = originalText.lastIndexOf(suffix);
//        return result
        return result;
    }

    public void verifyAnswer(){
//        Take originalString - String, suffix - String
        String originalString = lastIndexTxt.getText().toString();
        String suffix = lastPosition.getText().toString();
//        Declare result of int and assigned as -1
        int result = -1;
 //       result = originalString.lastIndexOf(suffix)
        result = correctAnswer(originalString, suffix);
//        return result
        resultTxt.setText(result + " ");
    }

    public void handleVerifyBtn(){
        verifyLastIndexBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }
}