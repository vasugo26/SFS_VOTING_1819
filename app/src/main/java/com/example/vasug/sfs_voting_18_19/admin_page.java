package com.example.vasug.sfs_voting_18_19;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;





public class admin_page extends AppCompatActivity {
    Button bad1;
    EditText pass1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_page);

        bad1 = (Button) findViewById(R.id.login);
        pass1 = (EditText) findViewById(R.id.pass);

        bad1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String p1 = pass1.getText().toString();
                        if (p1.equals("@string/password")) {
                            Intent result = new Intent("com.example.vasug.SFS_VOTING_18_19.result_page");
                            startActivity(result);
                        } else {
                            Toast.makeText(admin_page.this, "SORRY,YOU HAVE ENTERED WRONG PASSWORD \n PLEASE TRY AGAIN", Toast.LENGTH_LONG).show();
                        }


                    }
                }

        );



    }








}
