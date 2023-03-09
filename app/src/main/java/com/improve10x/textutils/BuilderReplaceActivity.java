package com.improve10x.textutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BuilderReplaceActivity extends AppCompatActivity {
    EditText originalBuilderTxt;
    EditText keyTxt;
    EditText startIndexTxt;
    EditText endIndexTxt;
    Button verifyBuilderReplaceBtn;
    TextView resultReplaceTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_replace);
        initViews();
        handleVerifyBtn();
    }

    private void initViews() {
        originalBuilderTxt = findViewById(R.id.original_builder_txt);
        keyTxt = findViewById(R.id.key_txt);
        startIndexTxt = findViewById(R.id.start_index_txt);
        endIndexTxt = findViewById(R.id.end_index_txt);
        verifyBuilderReplaceBtn = findViewById(R.id.verify_builder_replace_btn);
        resultReplaceTxt = findViewById(R.id.result_replace_txt);
    }

    public void verifyCorrectAnswer(){
        String originalTxt = originalBuilderTxt.getText().toString();
        String keyText = keyTxt.getText().toString();
        int startIndex = Integer.parseInt(startIndexTxt.getText().toString());
        int endIndex = Integer.parseInt(endIndexTxt.getText().toString());
        String result = replacingTextInGivenPosition(originalTxt, keyText, startIndex, endIndex);
        resultReplaceTxt.setText(result);
    }

    public String replacingTextInGivenPosition(String originalText, String key, int startIndex, int endIndex){
        String result = "";
        StringBuilder name = new StringBuilder(originalText);
        name.replace(startIndex, endIndex, key);
        result = name.toString();
        return result;
    }

    public void handleVerifyBtn(){
      verifyBuilderReplaceBtn.setOnClickListener(v -> {
          verifyCorrectAnswer();
      });
    }
}