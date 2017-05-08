package com.diparth98.droidcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private EditText input1;
    private EditText input2;
    private Button Equals;
    private RadioGroup radioOpGroup;
    private RadioButton btndisplay;
    double num1;
    double num2;
    double op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1=(EditText)findViewById(R.id.editText2);
        input2=(EditText)findViewById(R.id.editText3);
        Equals=(Button)findViewById(R.id.equals);
        radioOpGroup=(RadioGroup)findViewById(R.id.radioGroup);
        result=(TextView)findViewById(R.id.res);
        Equals.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          if (v == Equals)
                                          {
                                              num1=Double.parseDouble(input1.getText().toString());
                                              num2=Double.parseDouble(input2.getText().toString());
                                              int selected=radioOpGroup.getCheckedRadioButtonId();
                                              btndisplay=(RadioButton)findViewById(selected);
                                              if(btndisplay.getText().toString().equals("Plus"))
                                                  op=num1+num2;
                                              else if(btndisplay.getText().toString().equals("Minus"))
                                                  op=num1-num2;
                                              else if(btndisplay.getText().toString().equals("Multiply"))
                                                  op=num1*num2;
                                              else if(btndisplay.getText().toString().equals("Divide"))
                                                  op=num1/num2;
                                              result.setText(Double.toString(op));

                                          }
                                      }
                                  }
        );

    }
}
