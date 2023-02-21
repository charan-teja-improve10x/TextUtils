package com.improve10x.textutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class LowerCaseToUpperCase extends AppCompatActivity {
    Button submitBtn;
    EditText enterTxt;
    TextView upperCaseTxt;
    TextView lowerCaseTxt;
    TextView lengthTxt;
    TextView trimTxt;
    TextView isEmptyTxt;
    TextView containTxt;
    EditText charTxt;
    EditText startCharTxt;
    TextView startWithTxt;
    EditText endText;
    TextView endTextView;
    EditText indexText;
    TextView indexOfText;
    EditText enterReplaceTxt;
    TextView textReplace;
    TextView lastIndexTxt;
    EditText lastText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_case_to_upper_case);
        handleInitViews();
        handleSubmitBtn();
    }

    public void handleInitViews() {
        enterTxt = findViewById(R.id.enterd_txt);
        upperCaseTxt = findViewById(R.id.upper_case_txt);
        lowerCaseTxt = findViewById(R.id.lower_txt);
        lengthTxt = findViewById(R.id.length_txt);
        trimTxt = findViewById(R.id.trim_txt);
        isEmptyTxt = findViewById(R.id.is_empty_txt);
        containTxt = findViewById(R.id.contains_txt);
        charTxt = findViewById(R.id.char_txt);
        startCharTxt = findViewById(R.id.start_char_txt);
        startWithTxt = findViewById(R.id.start_with_txt);
        submitBtn = findViewById(R.id.submit_btn);
        endText = findViewById(R.id.end_text);
        endTextView = findViewById(R.id.display_end_txt);
        indexText = findViewById(R.id.index_txt);
        indexOfText = findViewById(R.id.index_of_text);
        enterReplaceTxt = findViewById(R.id.enter_replace_txt);
        textReplace = findViewById(R.id.text_replace);
        lastText = findViewById(R.id.last_text);
        lastIndexTxt = findViewById(R.id.last_index_text);
    }

    public void handleSubmitBtn() {
        submitBtn.setOnClickListener(view -> {
            convertToUpperCase();
            convertToLowerCase();
            lengthOfString();
            displayTrimText();
            displayIsEmptyText();
            displayContains();
            displayStartWithTxt();
            displayEndText();
            handleIndexMethod();
            displayTextReplacing();
            displayLastIndexOfText();
        });
    }

    public void displayLastIndexOfText(){
        String s1 = lastText.getText().toString();
        int lastIndex = enterText().lastIndexOf(s1);
        lastIndexTxt.setText(lastIndex + "");
    }

    public void displayTextReplacing(){
        String s1 = enterReplaceTxt.getText().toString();
        String replacingText = enterText().replace(enterText(),s1);
        textReplace.setText(replacingText);
    }

    public void handleIndexMethod(){
       String index = indexText.getText().toString();
       int value = enterText().indexOf(index);
       indexOfText.setText(value + "");
    }

    public void displayEndText(){
        String endTxt = endText.getText().toString();
        boolean endWith = enterText().endsWith(endTxt);
        endTextView.setText(endWith + "");
    }

    public void displayStartWithTxt(){
        String startText = startCharTxt.getText().toString();
       boolean startWith = enterText().startsWith(startText);
       startWithTxt.setText(startWith + "");
    }

    public void displayTrimText() {
        String trimedTxt = enterText().trim();
        trimTxt.setText(trimedTxt);
    }

    public void displayIsEmptyText() {
        String isEmpty = String.valueOf(enterText().isEmpty());
        isEmptyTxt.setText(isEmpty);
    }

    public void displayContains() {
        String charTx = charTxt.getText().toString();
        String contains = String.valueOf(enterText().contains(charTx));
        containTxt.setText(contains);
    }

    public void convertToLowerCase() {
        String lowerCase = enterText().toLowerCase(Locale.ROOT);
        lowerCaseTxt.setText(lowerCase);
    }

    public void lengthOfString() {
        String length = String.valueOf(enterText().length());
        lengthTxt.setText(length);
    }

    public void convertToUpperCase() {
        String upperCase = enterText().toUpperCase();
        upperCaseTxt.setText(upperCase);
    }

    public String enterText() {
        String enterdText = enterTxt.getText().toString();
        return enterdText;
    }
}
//trim(), isEmpty(), contains()