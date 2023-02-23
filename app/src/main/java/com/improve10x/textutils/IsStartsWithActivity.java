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

    public boolean prefixText(String originalText, String prefix){
//        Take originalText , prefix as String inputs
//        Declare result of boolean data type and assign to false
        boolean result = false;
//        if( a.startsWith(b)) then
//                result = true
        result = originalText.startsWith(prefix);
//        return result
        return result;
    }

    public void verifyAnswer(){
       String originalText = enterTxt.getText().toString();
       String prefix = prefixTxt.getText().toString();
       boolean result = false;
        result = prefixText(originalText,prefix);
       modifiedTxt.setText(result + "");
    }
    public void handleVerifyBtn(){
        verifyBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }
}