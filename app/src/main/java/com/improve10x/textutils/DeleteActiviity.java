package com.improve10x.textutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DeleteActiviity extends AppCompatActivity {
    EditText originalDeleteTxt;
    EditText startDeleteTxt;
    EditText endDeleteTxt;
    Button verifyDeleteBtn;
    TextView resultDeleteTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_activiity);
        initViews();
        handleVerifyBtn();
    }

    public void handleVerifyBtn(){
        verifyDeleteBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }

    private void initViews() {
      originalDeleteTxt = findViewById(R.id.original_delete_txt);
      startDeleteTxt = findViewById(R.id.start_delete_txt);
      endDeleteTxt = findViewById(R.id.end_delete_txt);
      verifyDeleteBtn = findViewById(R.id.verify_delete_btn);
      resultDeleteTxt = findViewById(R.id.result_delete_txt);
    }

    public void verifyAnswer(){
        String originalText = originalDeleteTxt.getText().toString();
        int startIndex = Integer.parseInt(startDeleteTxt.getText().toString());
        int endIndex = Integer.parseInt(endDeleteTxt.getText().toString());
        String result = displayCorrectAnswer(originalText, startIndex, endIndex);
        resultDeleteTxt.setText(result);

    }

    public String displayCorrectAnswer(String originalText, int startIndex, int endIndex){
//        Take originalText as String input & startIndex, endIndex as int inputs
//        Declare result of String and assign as “”
        String result = "";
//        Create a new StringBuilder object name and pass originalText ➡ StringBuilder name = new StringBuilder(originalText)
        StringBuilder name = new StringBuilder(originalText);
//        Delete the String from startIndex to endIndex ➡ name.delete(startIndex, endIndex)
        name.delete(startIndex, endIndex);
//        Convert name to String  and assign to result  => result = name.toString()
        result = name.toString();
//        return result
        return result ;

    }
}