package com.example.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AccountLogin extends AppCompatActivity {
    private Button login,register;
    private EditText password,account;
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login =(Button)findViewById(R.id.button_login);
        register =(Button)findViewById(R.id.button_sign);
        account = (EditText) findViewById(R.id.account);
        password = (EditText) findViewById(R.id.password);
        show = (TextView) findViewById(R.id.textView_show);
        login.setOnClickListener(login_onclick);
        register.setOnClickListener(register_onclick);
    }
    private View.OnClickListener login_onclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String account_show = account.getText().toString();
            show.setText("登入帳號為:"+account_show);

        }
    };


    private  View.OnClickListener register_onclick =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String account_show = password.getText().toString();
            show.setText("註冊帳號為:"+account_show);

        }
    };
}
