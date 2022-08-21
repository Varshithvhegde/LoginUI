package com.varshith.loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    TextView signin,signup,signin_signup_txt,forgot_password;
    CircleImageView circleImageView;
    Button signin_signup_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signin = findViewById(R.id.signin);
        signup = findViewById(R.id.signup);
        signin_signup_txt = findViewById(R.id.signin_signup_txt);
        forgot_password = findViewById(R.id.forgot_password);
        circleImageView = findViewById(R.id.circleImageView);
        signin_signup_btn = findViewById(R.id.signin_signup_btn);
        //SignIn Activity Listener
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signin.setTextColor(Color.parseColor("#FFFFFF"));
                signin.setBackgroundColor(Color.parseColor("#FF2729C3"));
                signup.setTextColor(Color.parseColor("#FF2729C3"));
                signup.setBackgroundResource(R.drawable.bordershape);
                circleImageView.setImageResource(R.drawable.sigin_boy_img);
                signin_signup_txt.setText("Sign In");
                signin_signup_btn.setText("Sign In");
                forgot_password.setVisibility(View.VISIBLE);
            }
        });
        //SigUP Activity
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup.setTextColor(Color.parseColor("#FFFFFF"));
                signup.setBackgroundColor(Color.parseColor("#FF2729C3"));
                signin.setTextColor(Color.parseColor("#FF2729C3"));
                signin.setBackgroundResource(R.drawable.bordershape);
                circleImageView.setImageResource(R.drawable.sigup_boy_img);
                signin_signup_txt.setText("Sign Up");
                signin_signup_btn.setText("Sign Up");
                forgot_password.setVisibility(View.INVISIBLE);



            }
        });
    }
}