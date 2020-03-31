package com.example.vasug.sfs_voting_18_19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class WELCOME_PAGE extends AppCompatActivity implements View.OnClickListener {
    Button bad1, bad2, bad3, bad4, bad5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome__page);
        bad1 = findViewById(R.id.GANDHI);
        bad2 = findViewById(R.id.TERESA);
        bad3 = findViewById(R.id.TAGORE);
        bad4 = findViewById(R.id.NEHRU);
        bad5 = findViewById(R.id.ADMIN);
        bad1.setOnClickListener(this);
        bad2.setOnClickListener(this);
        bad3.setOnClickListener(this);
        bad4.setOnClickListener(this);
        bad5.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.GANDHI:
                Intent gv = new Intent("com.example.vasug.SFS_VOTING_18_19.gandhi_vc");
                startActivity(gv);
                break;
            case R.id.ADMIN:
                Intent ad = new Intent("com.example.vasug.SFS_VOTING_18_19.admin_page");
                startActivity(ad);
                break;
            case R.id.TERESA:
                Intent mv = new Intent("com.example.vasug.SFS_VOTING_18_19.teresa_vc");
                startActivity(mv);
                break;
            case R.id.TAGORE:
                Intent tv = new Intent("com.example.vasug.SFS_VOTING_18_19.tagore_vc");
                startActivity(tv);
                break;
            case R.id.NEHRU:
                Intent nv = new Intent("com.example.vasug.SFS_VOTING_18_19.nehru_vc");
                startActivity(nv);
                break;
        }
    }
}







