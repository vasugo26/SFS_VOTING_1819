package com.example.vasug.sfs_voting_18_19;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class gandhi_vc extends AppCompatActivity implements View.OnClickListener {
    Button bad1,bad2,bad3,bad4;
    Context ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gandhi_vc);
        bad1 = (Button) findViewById(R.id.GVC1);
        bad2 = (Button) findViewById(R.id.GVC2);
        bad3 = (Button) findViewById(R.id.GVC3);
        bad4 = (Button) findViewById(R.id.GVC4);


        bad1.setOnClickListener(this);
        bad2.setOnClickListener(this);
        bad3.setOnClickListener(this);
        bad4.setOnClickListener(this);

    }
    Intent GC = new Intent("com.example.vasug.SFS_VOTING_18_19.gandhi_c");
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.GVC1:
                gandhi_database db1 = new gandhi_database(ctx);
                db1.enter_data(db1, 1, 0,0,0);
                Toast.makeText(gandhi_vc.this, "your vote is registered ...\n NOW VOTE FOR YOUR CAPTAIN", Toast.LENGTH_LONG).show();
                startActivity(GC);

                break;
            case R.id.GVC2:
                gandhi_database db2 = new gandhi_database(ctx);
                db2.enter_data(db2, 0,1,0,0);
                Toast.makeText(gandhi_vc.this, "your vote is registered ...\n NOW VOTE FOR YOUR CAPTAIN", Toast.LENGTH_LONG).show();
                startActivity(GC);
                break;

            case R.id.GVC3:
                gandhi_database db3 = new gandhi_database(ctx);
                db3.enter_data(db3, 0, 0,1,0);
                Toast.makeText(gandhi_vc.this, "your vote is registered ...\n NOW VOTE FOR YOUR CAPTAIN", Toast.LENGTH_LONG).show();
                startActivity(GC);
                break;

            case R.id.GVC4:
                gandhi_database db4 = new gandhi_database(ctx);
                db4.enter_data(db4, 0, 0,0,1);
                Toast.makeText(gandhi_vc.this, "your vote is registered ...\n NOW VOTE FOR YOUR CAPTAIN", Toast.LENGTH_LONG).show();
                startActivity(GC);
                break;

        }
    }
}

