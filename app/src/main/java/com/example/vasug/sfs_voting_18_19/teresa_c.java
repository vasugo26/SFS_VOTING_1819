package com.example.vasug.sfs_voting_18_19;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class teresa_c extends AppCompatActivity implements View.OnClickListener{
    Button bad1, bad2, bad3, bad4,bad5;
    Context ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teresa_c);
        bad1 = (Button) findViewById(R.id.MC1);
        bad2 = (Button) findViewById(R.id.MC2);
        bad3 = (Button) findViewById(R.id.MC3);
        bad4 = (Button) findViewById(R.id.MC4);
        bad5 = (Button) findViewById(R.id.MC5);


        bad1.setOnClickListener(this);
        bad2.setOnClickListener(this);
        bad3.setOnClickListener(this);
        bad4.setOnClickListener(this);
        bad5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.MC1:


                teresa_database db1 = new teresa_database(ctx);
                db1.enter_data_c(db1, 1, 0, 0, 0,0);
                Toast.makeText(teresa_c.this, "THANK YOU", Toast.LENGTH_LONG).show();
                Intent WP1 = new Intent(getApplicationContext(), WELCOME_PAGE.class);
                WP1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(WP1);


                break;
            case R.id.MC2:
                teresa_database db2 = new teresa_database(ctx);
                db2.enter_data_c(db2, 0, 1, 0, 0,0);
                Toast.makeText(teresa_c.this, "THANK YOU", Toast.LENGTH_LONG).show();
                Intent WP2 = new Intent(getApplicationContext(), WELCOME_PAGE.class);
                WP2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(WP2);



                break;
            case R.id.MC3:
                teresa_database db3 = new teresa_database(ctx);
                db3.enter_data_c(db3, 0, 0, 1, 0,0);
                Toast.makeText(teresa_c.this, "THANK YOU", Toast.LENGTH_LONG).show();
                Intent WP3 = new Intent(getApplicationContext(), WELCOME_PAGE.class);
                WP3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(WP3);


                break;
            case R.id.MC4:
                teresa_database db4 = new teresa_database(ctx);
                db4.enter_data_c(db4, 0, 0, 0, 1,0);
                Toast.makeText(teresa_c.this, "THANK YOU", Toast.LENGTH_LONG).show();
                Intent WP4 = new Intent(getApplicationContext(), WELCOME_PAGE.class);
                WP4.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(WP4);

                break;

            case R.id.MC5:
                teresa_database db5 = new teresa_database(ctx);
                db5.enter_data_c(db5, 0, 0, 0, 0,1);
                Toast.makeText(teresa_c.this, "THANK YOU", Toast.LENGTH_LONG).show();
                Intent WP5 = new Intent(getApplicationContext(), WELCOME_PAGE.class);
                WP5.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(WP5);

                break;
        }

    }
}
