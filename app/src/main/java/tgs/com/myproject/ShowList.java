package tgs.com.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowList extends AppCompatActivity {
TextView Results;
  String Rslt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.child_item);

        Rslt=getIntent().getStringExtra("Result");

        Results=findViewById(R.id.title);

        Results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShowList.this,ShowList.class);
                startActivity(intent);
            }
        });

    }
}
