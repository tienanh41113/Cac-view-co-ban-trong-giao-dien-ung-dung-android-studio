package com.example.baitap;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editName, editEmail;
    Button btnCancel, btnInfo;
    CheckBox chkCoding, chkReading, chkTravelling;
    RadioButton rdMale, rdFemale;
    Spinner spinLang;
    Switch switchExpert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCancel =  (Button)findViewById(R.id.btnCancel);
        Button btnInfo =  (Button)findViewById(R.id.btnInfo);
        editName =  (EditText)findViewById(R.id.editName);
        editEmail =  (EditText)findViewById(R.id.editEmail);
        chkCoding =  (CheckBox) findViewById(R.id.chkCoding);
        chkReading =  (CheckBox) findViewById(R.id.chkReading);
        chkTravelling =  (CheckBox) findViewById(R.id.chkTravelling);
        rdMale =  (RadioButton) findViewById(R.id.rdMale);
        rdFemale =  (RadioButton) findViewById(R.id.rdFemale);
        spinLang =  (Spinner) findViewById(R.id.spinLang);
        switchExpert =  (Switch) findViewById(R.id.switchExpert);

    }


    public void onClick(View v) {
        String msg = "My name: " + editName.getText().toString() +
                System.getProperty("line.separator") +
                "Email: " + editEmail.getText().toString();
        msg += System.getProperty("line.separator") + "My hobbies: ";
        if(chkCoding.isChecked())
            msg +=  chkCoding.getText().toString() + ", ";
        if(chkReading.isChecked())
            msg += chkReading.getText().toString() + ", ";
        if(chkTravelling.isChecked())
            msg += chkTravelling.getText().toString()+ ", ";
        msg += System.getProperty("line.separator") + "My Sex: ";
        if(rdFemale.isChecked())
            msg += rdFemale.getText().toString();
        if(rdMale.isChecked())
            msg += rdMale.getText().toString();
        msg += System.getProperty("line.separator") + "My language: " + spinLang.getSelectedItem().toString();
        msg += System.getProperty("line.separator") + "Do you have experience with Java frameworks: ";
        if(switchExpert.isChecked())
            msg += "Yes";
        else
            msg += "No";
        info(v,msg);
        editName.setText("");
        editEmail.setText("");
        chkCoding.setChecked(false);
        chkReading.setChecked(false);
        chkTravelling.setChecked(false);
        rdFemale.setChecked(false);
        rdMale.setChecked(false);
    }

    public void Cancel(View v){
        System.exit(0);
    }

    public void info(View v, String msg){
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage(msg);
        dlgAlert.setTitle("Information");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
    }
}