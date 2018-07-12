package com.example.macstudent.emppayroll;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class LoginActivity extends AppCompatActivity {
EditText edtUserName;
EditText edtPassword;
CheckBox chkIsRemember;
Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

edtUserName = findViewById(R.id.edtEmail);
edtPassword = findViewById(R.id.edtPassword);
chkIsRemember = findViewById(R.id.chkRememberMe);
btnLogin = findViewById(R.id.btnLogin);


        SharedPreferences msharedPreferences =this.getSharedPreferences("myPref",MODE_PRIVATE);
        final SharedPreferences.Editor mEditor = msharedPreferences.edit();
        if(msharedPreferences.getString("userid",null) != null)
        {
            edtUserName.setText(msharedPreferences.getString("userid",null));
            edtUserName.setText(msharedPreferences.getString("password",null));
            chkIsRemember.setChecked(true);
        }
btnLogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String userName = edtUserName.getText().toString();
        String password = edtPassword.getText().toString();
        if(userName.equals("user@employee.com") && password.equals("sohel101"))
        {

            if (chkIsRemember.isChecked()) {
                mEditor.putString("userid", userName);
                mEditor.putString("password", password);
                //mEditor.commit();
            }
            else {
                mEditor.remove("userid");
                mEditor.remove("password");
            }
            mEditor.apply();// (user@employee.com/s3cr3t
            Toast.makeText(getApplicationContext(),"Login Sucess",Toast.LENGTH_LONG).show();
            Intent mIntent = new Intent(LoginActivity.this,HomeActivity.class);
            mIntent.putExtra("Name","Sohel Mohammed");
            mIntent.putExtra("email","mdsp@gmail.com");

            startActivity(mIntent);
        }
        else {
            Toast.makeText(getApplicationContext(), "Invalid UserId or Password", Toast.LENGTH_SHORT).show();
        }
    }
});
    }

}
