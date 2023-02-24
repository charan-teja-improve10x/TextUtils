package com.improve10x.textutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InsertActivity extends AppCompatActivity {
    EditText prefixInsertTxt;
    EditText suffixInsertTxt;
    EditText givenPositionTxt;
    Button verifyInsertBtn;
    TextView resultInsertTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        initViews();
        handleVerifyBtn();
    }

    private void initViews() {
        prefixInsertTxt = findViewById(R.id.prifix_insert_txt);
        suffixInsertTxt = findViewById(R.id.suffix_insert_txt);
        givenPositionTxt = findViewById(R.id.given_position_txt);
        verifyInsertBtn = findViewById(R.id.verify_insert_btn);
        resultInsertTxt = findViewById(R.id.result_insert_txt);
    }

    public void verifyAnswer() {

        String prefix = prefixInsertTxt.getText().toString();
        int givenPosition = Integer.parseInt(givenPositionTxt.getText().toString());
        String suffix = suffixInsertTxt.getText().toString();
        String result = insertingOfStrings(prefix, givenPosition, suffix);
        resultInsertTxt.setText(result);
    }

    public String insertingOfStrings(String prefix, int givenPosition, String suffix) {
        String result = "";
        StringBuilder name = new StringBuilder(prefix);
        name.insert(givenPosition, suffix);
        result = name.toString();
        return result;
    }

    public void handleVerifyBtn() {
        verifyInsertBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }
}