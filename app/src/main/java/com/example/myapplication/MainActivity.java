package com.example.myapplication;


//package com.genwoxue.oncheckedchanged;
import android.os.Bundle;
//import android.app.Activity;
import android.view.View;
//import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup.OnCheckedChangeListener;              //引入OnCheckedChangeListener事件相关包
//import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

    private RadioGroup RadioGroup2 = null;
    private RadioButton rbMale = null;
    private RadioButton rbFemale = null;
    //private TextView textView = null;
    //private Button button = null;
    private EditText high = null;
    public String sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbMale = super.findViewById(R.id.radioButton2); //男
        rbFemale = super.findViewById(R.id.radioButton); //女
        //textView = (TextView) findViewById(R.id.textView);  //结果显示
        //button = (Button) findViewById(R.id.button);
        high = findViewById(R.id.editText4);
    }

    /*在GenderGroup注册OnCheckedChangeListener事件
    private class RadioOnCheckedChangeListener implements OnCheckedChangeListener{*/
        public void onCheckedChanged(RadioGroup group, int checkedId) {

            if (rbFemale.getId() == group.getCheckedRadioButtonId()) { //女
                sex=rbFemale.getText().toString();
            }
            else{//男
                sex=rbMale.getText().toString();
            }

        }


    public void onclick(View view) {
        int high2 = Integer.parseInt(high.getText().toString());
        double weight;
        if(sex=="女"){

            weight = (high2 - 70) * 0.6;
            Toast.makeText(getApplicationContext(), String.valueOf(weight), Toast.LENGTH_LONG).show();
        }
        else{

            weight = (high2 - 80) * 0.7;
            Toast.makeText(getApplicationContext(), String.valueOf(weight), Toast.LENGTH_LONG).show();
        }
    }
}

