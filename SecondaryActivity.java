
package subham.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import java.lang.Math;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    EditText e1,e2;
    Button add;
    Button subt,multi,divi,modu,pwr;
    String s1,s2;
    double result=0;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        e1=(EditText)findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);
        add=(Button)findViewById(R.id.plus);
        subt=(Button)findViewById(R.id.minus);
        multi=(Button)findViewById(R.id.mult);
        divi=(Button)findViewById(R.id.div);
        modu=(Button)findViewById(R.id.mod);
        pwr=(Button)findViewById(R.id.power);

        t1=(TextView)findViewById(R.id.textview);





        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();

                result=Integer.parseInt(s1)+Integer.parseInt(s2);

                t1.setText(String.valueOf(result));

            }
        });
        subt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();

                result=Integer.parseInt(s1)-Integer.parseInt(s2);


                t1.setText(String.valueOf(result));

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();

                result=Integer.parseInt(s1)*Integer.parseInt(s2);

                t1.setText(String.valueOf(result));

            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();

                result=(double) Integer.parseInt(s1)/Integer.parseInt(s2);

                t1.setText(String.valueOf(result));

            }
        });

        modu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();

                result= Integer.parseInt(s2) % Integer.parseInt(s1);

                t1.setText(String.valueOf(result));

            }
        });

        pwr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();

                result= (int) Math.pow(Integer.parseInt(s1),Integer.parseInt(s2));

                t1.setText(String.valueOf(result));

            }
        });
        


    }
}

