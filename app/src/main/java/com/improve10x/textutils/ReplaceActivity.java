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

    public String displaysReplacingText(String originalString, String oldString, String newString){
//        Take originalString, oldString and newString  - input Strings
//        Declare result of String and assigned to “”
        String result = "";
//        result = originalString.replace(oldString, newString)
        result = originalString.replace(oldString,newString);
//        return result
        return result;
    }

    public void displaymodifiedText(){
//        Take originalString, oldString and newString  - input Strings
        String originalText = originalTxt.getText().toString();
        String oldString = oldTxt.getText().toString();
        String newString = newTxt.getText().toString();
//        Declare result of String and assigned to “”
        String result = "";
//        result = originalString.replace(oldString, newString)
        result = displaysReplacingText(originalText, oldString, newString);
//        return result
        changedTxt.setText(result);
    }

    public void handleVerifyBtn(){
        verifyReplaceBtn.setOnClickListener(v -> {
            displaymodifiedText();
        });
    }
}