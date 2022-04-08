package com.uas.SuryaJuniawan;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class start extends AppCompatActivity{
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openStart();
            }
        });

    }
    public void openStart(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
