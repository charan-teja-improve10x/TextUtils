package com.improve10x.textutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AppendActivity extends AppCompatActivity {
    EditText appendPrefixTxt;
    EditText appendSuffixTxt;
    TextView resultAppendTxt;
    Button verifyAppendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_append);
        initViews();
        handleVerifyBtn();
    }

    private void handleVerifyBtn() {
        verifyAppendBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }

    private void initViews() {
        appendPrefixTxt = findViewById(R.id.append_prefix_txt);
        appendSuffixTxt = findViewById(R.id.append_suffix_txt);
        resultAppendTxt = findViewById(R.id.result_append_txt);
        verifyAppendBtn = findViewById(R.id.verify_append_btn);
    }

    public void verifyAnswer(){
        String prefix = appendPrefixTxt.getText().toString();
        String suffix = appendSuffixTxt.getText().toString();
        String result = concatenateOfStrings(prefix,suffix);
        resultAppendTxt.setText(result);

    }
    public String concatenateOfStrings(String prefix, String suffix){
//        Take prefix, suffix as input Strings
//        Declare result of String and assign as “”
        String result = "";
//        Create a String builder object and pas prefix ➡  StringBuilder name = new StringBuilder(prefix)
        StringBuilder name = new StringBuilder(prefix);
//        Concatenate suffix with name ➡name.append(suffix)
        name.append(suffix);
//        Convert name to String and assign to result => name.toString()
        result = name.toString();
//        return result
        return result;
    }
}