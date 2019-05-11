package tgs.com.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
  EditText Login,Passowrd;
  Button Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity_file);

        Login=findViewById(R.id.loginId);
        Passowrd=findViewById(R.id.password);
        Button=findViewById(R.id.button);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Login.getText().toString().equals("srishti") && Passowrd.getText().toString().equals("12345678")){
                    Intent intent=new Intent(Login.this,MainActivity.class);
                    // intent.putExtra("","");
                    startActivity(intent);
                }

            }
        });


    }
}
