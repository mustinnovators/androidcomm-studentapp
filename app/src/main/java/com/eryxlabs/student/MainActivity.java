package com.eryxlabs.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;

    @BindView(R.id.btnSignin)
    Button btnSignIn;

    @BindView(R.id.username)
    EditText username;

    @BindView(R.id.password)
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

//        final TextView tv = findViewById(R.id.tv);
//        final EditText editText=  findViewById(R.id.editText);
//        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do sth user click
                String str = editText.getText().toString();
                tv.setText(str);
            }
        });
    }
}
