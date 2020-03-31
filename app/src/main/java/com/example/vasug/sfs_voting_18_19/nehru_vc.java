package com.example.vasug.sfs_voting_18_19;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class nehru_vc extends AppCompatActivity implements View.OnClickListener{
    Button bad1,bad2,bad3,bad4,bad5;
    Context ctx = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nehru_vc);

        bad1 = (Button) findViewById(R.id.NVC1);
        bad2 = (Button) findViewById(R.id.NVC2);
        bad3 = (Button) findViewById(R.id.NVC3);
        bad4 = (Button) findViewById(R.id.NVC4);
        bad5 = (Button) findViewById(R.id.NVC5);

        bad1.setOnClickListener(this);
        bad2.setOnClickListener(this);
        bad3.setOnClickListener(this);
        bad4.setOnClickListener(this);
        bad5.setOnClickListener(this);
    }
    Intent NC = new Intent("com.example.vasug.SFS_VOTING_18_19.nehru_c");
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.NVC1:
                nehru_database db1 = new nehru_database(ctx);
                db1.enter_data(db1,1,0,0,0,0);
                Toast.makeText(nehru_vc.this, "your vote is registered ...\n NOW VOTE FOR YOUR CAPTAIN", Toast.LENGTH_LONG).show();
                startActivity(NC);
                break;
            case R.id.NVC2:
                nehru_database db2 = new nehru_database(ctx);
                db2.enter_data(db2,0,1,0,0,0);
                Toast.makeText(nehru_vc.this, "your vote is registered ...\n NOW VOTE FOR YOUR CAPTAIN", Toast.LENGTH_LONG).show();
                startActivity(NC);
                break;
            case R.id.NVC3:
                nehru_database db3 = new nehru_database(ctx);
                db3.enter_data(db3,0,0,1,0,0);
                Toast.makeText(nehru_vc.this, "your vote is registered ...\n NOW VOTE FOR YOUR CAPTAIN", Toast.LENGTH_LONG).show();
                startActivity(NC);
                break;
            case R.id.NVC4:
                nehru_database db4 = new nehru_database(ctx);
                db4.enter_data(db4,0,0,0,1,0);
                Toast.makeText(nehru_vc.this, "your vote is registered ...\n NOW VOTE FOR YOUR CAPTAIN", Toast.LENGTH_LONG).show();
                startActivity(NC);
                break;
            case R.id.NVC5:
                nehru_database db5 = new nehru_database(ctx);
                db5.enter_data(db5,0,0,0,0,1);
                Toast.makeText(nehru_vc.this, "your vote is registered ...\n NOW VOTE FOR YOUR CAPTAIN", Toast.LENGTH_LONG).show();
                startActivity(NC);
                break;
        }

    }

}
