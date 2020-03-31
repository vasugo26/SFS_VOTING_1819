package com.example.vasug.sfs_voting_18_19;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

public class result_page extends AppCompatActivity implements View.OnClickListener
{
    Button bad1,bad2,bad3,
            bad4,bad5,bad6,bad7,bad8,bad9,bad10,bad11,bad12;

    Context ctx = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_page);
        bad1 = (Button) findViewById(R.id.gandhi_clear);
        bad2 = (Button) findViewById(R.id.gandhi_vice_captain);
        bad3 = (Button) findViewById(R.id.gandhi_captain);
        bad4 = (Button) findViewById(R.id.teresa_clear);
        bad5 = (Button) findViewById(R.id.teresa_vice_captain);
        bad6 = (Button) findViewById(R.id.teresa_captain);
        bad7 = (Button) findViewById(R.id.tagore_clear);
        bad8 = (Button) findViewById(R.id.tagore_vice_captain);
        bad9 = (Button) findViewById(R.id.tagore_captain);
        bad10 = (Button) findViewById(R.id.nehru_clear);
        bad11= (Button) findViewById(R.id.nehru_vice_captain);
        bad12= (Button) findViewById(R.id.nehru_captain);



        bad1.setOnClickListener(this);
        bad2.setOnClickListener(this);
        bad3.setOnClickListener(this);
        bad4.setOnClickListener(this);
        bad5.setOnClickListener(this);
        bad6.setOnClickListener(this);
        bad7.setOnClickListener(this);
        bad8.setOnClickListener(this);
        bad9.setOnClickListener(this);
        bad10.setOnClickListener(this);
        bad11.setOnClickListener(this);
        bad12.setOnClickListener(this);

    }
    int  c1 = 0,f1=0,i1=0,l1=0, o1 = 0,r1=0,u1=0,y1=0;
    int  c2 = 0,f2=0,i2=0,l2=0, o2 = 0,r2=0,u2=0,y2=0,yy2=0;
    int  c3 = 0,f3=0,i3=0,l3=0, o3 = 0,r3=0,u3=0;
    int  c = 0 ,f =0,i =0,l =0, o  = 0,r =0 ,u=0,y=0;

    private void gandhi_vc(){
        gandhi_database dop = new gandhi_database(ctx);
        String[] columns = {gandhi_database.table1info.can1};
        String[] columns2 = {gandhi_database.table1info.can2};
        String[] columns3 = {gandhi_database.table1info.can3};
        String[] columns4 = {gandhi_database.table1info.can4};

        SQLiteDatabase sq = dop.getReadableDatabase();

        Cursor cu = sq.query(gandhi_database.table1info.TABLE_NAME,columns,"abc = ?", new String[]{"1"},null,null,null);
        Cursor cu2 = sq.query(gandhi_database.table1info.TABLE_NAME,columns2,"def = ?", new String[]{"1"},null,null,null);
        Cursor cu3 = sq.query(gandhi_database.table1info.TABLE_NAME,columns3,"ghi = ?",new String[]{"1"},null,null,null);
        Cursor cu4 = sq.query(gandhi_database.table1info.TABLE_NAME,columns4,"jkl = ?",new String[]{"1"},null,null,null);
        c1=cu.getCount();
        cu.close();
        f1=cu2.getCount();
        cu2.close();
        i1=cu3.getCount();
        cu3.close();
        l1=cu4.getCount();
        cu4.close();


        sq.close();


        Toast.makeText(result_page.this,"votes for Ruchi Bansal is " + Integer.toString(c1) +"....\n" +
                "votes for Sucheta Shandilya is " + Integer.toString(f1) +"....\n"+
                "votes for Ananya Kher is " + Integer.toString(i1) +"....\n"+
                "votes for Daivik Kaiswani is " + Integer.toString(l1) +"....", Toast.LENGTH_LONG).show();
    }
    private void gandhi_c(){
        gandhi_database dop2 = new gandhi_database(ctx);
        String[] columns5 = {gandhi_database.table1info.can5};
        String[] columns6 = {gandhi_database.table1info.can6};
        String[] columns7 = {gandhi_database.table1info.can7};
        String[] columns8 = {gandhi_database.table1info.can8};

        SQLiteDatabase sq2 = dop2.getReadableDatabase();

        Cursor cu5 = sq2.query(gandhi_database.table1info.TABLE_NAME, columns5, "mno = ?", new String[]{"1"}, null, null, null, null);
        Cursor cu6 = sq2.query(gandhi_database.table1info.TABLE_NAME, columns6, "pqr = ?", new String[]{"1"}, null, null, null, null);
        Cursor cu7 = sq2.query(gandhi_database.table1info.TABLE_NAME, columns7, "stu = ?", new String[]{"1"}, null, null, null, null);
        Cursor cu8 = sq2.query(gandhi_database.table1info.TABLE_NAME, columns8, "vwx = ?", new String[]{"1"}, null, null, null, null);


        o1=cu5.getCount();
        cu5.close();
        r1=cu6.getCount();
        cu6.close();
        u1=cu7.getCount();
        cu7.close();
        y1=cu8.getCount();
        cu8.close();


        sq2.close();


        Toast.makeText(result_page.this,"votes for LIPIKA BISHT  is " + Integer.toString(o1) +"....\n" +
                "votes for Akriti Rawat is " + Integer.toString(r1) +"....\n"+
                "votes for Arya Veer Khanna is " + Integer.toString(u1) +"....\n"+
                "votes for Dolphee Khurana is " + Integer.toString(y1) +"....", Toast.LENGTH_LONG).show();

    }
    private void teresa_vc(){

        teresa_database dop = new teresa_database(ctx);
        String[] columns = {teresa_database.table2info.can1};
        String[] columns2 = {teresa_database.table2info.can2};
        String[] columns3 = {teresa_database.table2info.can3};
        String[] columns4 = {teresa_database.table2info.can4};

        SQLiteDatabase sq = dop.getReadableDatabase();

        Cursor cu = sq.query(teresa_database.table2info.TABLE_NAME,columns,"abc = ?", new String[]{"1"},null,null,null);
        Cursor cu2 = sq.query(teresa_database.table2info.TABLE_NAME,columns2,"def = ?", new String[]{"1"},null,null,null);
        Cursor cu3 = sq.query(teresa_database.table2info.TABLE_NAME,columns3,"ghi = ?",new String[]{"1"},null,null,null);
        Cursor cu4 = sq.query(teresa_database.table2info.TABLE_NAME,columns4,"jkl = ?",new String[]{"1"},null,null,null);


        c2=cu.getCount();
        cu.close();
        f2=cu2.getCount();
        cu2.close();
        i2=cu3.getCount();
        cu3.close();
        l2=cu4.getCount();
        cu4.close();


        sq.close();


        Toast.makeText(result_page.this,"votes for Sohini Ghosh is " + Integer.toString(c2) +"....\n" +
                "votes for Aditya Pandey is " + Integer.toString(f2) +"....\n"+
                "votes for Nischal Joshi is " + Integer.toString(i2) +"....\n"+
                "votes for Vartik Chaturvedi is " + Integer.toString(l2) +"....", Toast.LENGTH_LONG).show();
    }
    private void teresa_c(){
        teresa_database dop2 = new teresa_database(ctx);
        String[] columns5 = {teresa_database.table2info.can5};
        String[] columns6 = {teresa_database.table2info.can6};
        String[] columns7 = {teresa_database.table2info.can7};
        String[] columns8 = {teresa_database.table2info.can8};
        String[] columns9 = {teresa_database.table2info.can9};

        SQLiteDatabase sq2 = dop2.getReadableDatabase();

        Cursor cu5 = sq2.query(teresa_database.table2info.TABLE_NAME, columns5, "mno = ?", new String[]{"1"}, null, null, null, null);
        Cursor cu6 = sq2.query(teresa_database.table2info.TABLE_NAME, columns6, "pqr = ?", new String[]{"1"}, null, null, null, null);
        Cursor cu7 = sq2.query(teresa_database.table2info.TABLE_NAME, columns7, "stu = ?", new String[]{"1"}, null, null, null, null);
        Cursor cu8 = sq2.query(teresa_database.table2info.TABLE_NAME, columns8, "vwx = ?", new String[]{"1"}, null, null, null, null);
        Cursor cu9 = sq2.query(teresa_database.table2info.TABLE_NAME, columns9, "yza = ?", new String[]{"1"}, null, null, null, null);
        o2=cu5.getCount();
        cu5.close();
        r2=cu6.getCount();
        cu6.close();
        u2=cu7.getCount();
        cu7.close();
        y2=cu8.getCount();
        cu8.close();
        yy2=cu9.getCount();
        cu9.close();


        sq2.close();


        Toast.makeText(result_page.this,"votes for Adiya Chopra is " + Integer.toString(o2) +"....\n" +
                "votes for Akriti Bhan is " + Integer.toString(r2) +"....\n"+
                "votes for Samarth Shah is " + Integer.toString(u2) +"....\n"+
                "votes for Chaiytanya Gupta is " + Integer.toString(y2) +"....\n"+
                "votes for Yashika Shishodia is " + Integer.toString(yy2) +"....\n", Toast.LENGTH_LONG).show();
    }

    private void tagore_vc()
    {
        tagore_database dop = new tagore_database(ctx);
        String[] columns = {tagore_database.table3info.can1};
        String[] columns2 = {tagore_database.table3info.can2};
        String[] columns3 = {tagore_database.table3info.can3};
        String[] columns4 = {tagore_database.table3info.can4};

        SQLiteDatabase sq = dop.getReadableDatabase();

        Cursor cu = sq.query(tagore_database.table3info.TABLE_NAME,columns,"abc = ?", new String[]{"1"},null,null,null);
        Cursor cu2 = sq.query(tagore_database.table3info.TABLE_NAME,columns2,"def = ?", new String[]{"1"},null,null,null);
        Cursor cu3 = sq.query(tagore_database.table3info.TABLE_NAME,columns3,"ghi = ?",new String[]{"1"},null,null,null);
        Cursor cu4 = sq.query(tagore_database.table3info.TABLE_NAME,columns4,"jkl = ?",new String[]{"1"},null,null,null);


        c3=cu.getCount();
        cu.close();
        f3=cu2.getCount();
        cu2.close();
        i3=cu3.getCount();
        cu3.close();
        l3=cu4.getCount();
        cu4.close();





        sq.close();


        Toast.makeText(result_page.this,"votes for  Tanisha Goel  is " + Integer.toString(c3) +"....\n" +
                "votes for Prakriti Suman is " + Integer.toString(f3) +"....\n"+
                "votes for Gaurav Dabas is " + Integer.toString(i3) +"....\n"+
                "votes for Vidhi Sinha is " + Integer.toString(l3) +"....", Toast.LENGTH_LONG).show();
    }
    private void tagore_c()
    {
        tagore_database dop2 = new tagore_database(ctx);
        String[] columns5 = {tagore_database.table3info.can5};
        String[] columns6 = {tagore_database.table3info.can6};
        String[] columns7 = {tagore_database.table3info.can7};


        SQLiteDatabase sq2 = dop2.getReadableDatabase();

        Cursor cu5 = sq2.query(tagore_database.table3info.TABLE_NAME, columns5, "mno = ?", new String[]{"1"}, null, null, null, null);
        Cursor cu6 = sq2.query(tagore_database.table3info.TABLE_NAME, columns6, "pqr = ?", new String[]{"1"}, null, null, null, null);
        Cursor cu7 = sq2.query(tagore_database.table3info.TABLE_NAME, columns7, "stu = ?", new String[]{"1"}, null, null, null, null);


        o3=cu5.getCount();
        cu5.close();
        r3=cu6.getCount();
        cu6.close();
        u3=cu7.getCount();
        cu7.close();


        sq2.close();

        Toast.makeText(result_page.this,"votes for Harshvardhan Chaudhary is " + Integer.toString(o3) +"....\n" +
                "votes for Saumya is " + Integer.toString(r3) +"....\n"+
                "votes for Hiral Verma is " + Integer.toString(u3) +"....", Toast.LENGTH_LONG).show();
    }
    public void nehru_vc()
    {
        nehru_database dop = new nehru_database(ctx);
        String[] columns = {nehru_database.table4info.can1};
        String[] columns2 = {nehru_database.table4info.can2};
        String[] columns3 = {nehru_database.table4info.can3};
        String[] columns4 = {nehru_database.table4info.can4};
        String[] columns5 = {nehru_database.table4info.can5};

        SQLiteDatabase sq = dop.getReadableDatabase();

        Cursor cu  = sq.query(nehru_database.table4info.TABLE_NAME,columns, "abc = ?",new String[]{"1"},null,null,null);
        Cursor cu2 = sq.query(nehru_database.table4info.TABLE_NAME,columns2,"def = ?",new String[]{"1"},null,null,null);
        Cursor cu3 = sq.query(nehru_database.table4info.TABLE_NAME,columns3,"ghi = ?",new String[]{"1"},null,null,null);
        Cursor cu4 = sq.query(nehru_database.table4info.TABLE_NAME,columns4,"jkl = ?",new String[]{"1"},null,null,null);
        Cursor cu5 = sq.query(nehru_database.table4info.TABLE_NAME,columns5,"mno = ?",new String[]{"1"},null,null,null);


        c=cu.getCount();
        cu.close();
        f=cu2.getCount();
        cu2.close();
        i=cu3.getCount();
        cu3.close();
        l=cu4.getCount();
        cu4.close();
        o=cu5.getCount();
        cu5.close();

        sq.close();


        Toast.makeText(result_page.this,"votes for Khushi Raina is " + Integer.toString(c) +"....\n" +
                "votes for Shrey Sankit is " + Integer.toString(f) +"....\n"+
                "votes for Abhay Rawat is " + Integer.toString(i) +"....\n"+
                "votes for Harsh Kumar is " + Integer.toString(l) +"....\n"+
                "votes for Ashmit Nehra is " + Integer.toString(o) +"....", Toast.LENGTH_LONG).show();
    }
    public void nehru_c()
    {
        nehru_database dop2 = new nehru_database(ctx);

        String[] columns6 = {nehru_database.table4info.can6};
        String[] columns7 = {nehru_database.table4info.can7};
        String[] columns8 = {nehru_database.table4info.can8};

        SQLiteDatabase sq2 = dop2.getReadableDatabase();


        Cursor cu6 = sq2.query(nehru_database.table4info.TABLE_NAME, columns6, "pqr = ?", new String[]{"1"}, null, null, null, null);
        Cursor cu7 = sq2.query(nehru_database.table4info.TABLE_NAME, columns7, "stu = ?", new String[]{"1"}, null, null, null, null);
        Cursor cu8 = sq2.query(nehru_database.table4info.TABLE_NAME, columns8, "vwx = ?", new String[]{"1"}, null, null, null, null);

        r=cu6.getCount();
        cu6.close();
        u=cu7.getCount();
        cu7.close();
        y=cu8.getCount();
        cu8.close();

        sq2.close();


        Toast.makeText(result_page.this,"votes for Unnati Dhiman is " + Integer.toString(r) +"....\n" +
                "votes for Shubhangi Mishra is " + Integer.toString(u) +"....\n"+
                "votes for Samriddhi Hansaz is " + Integer.toString(y) +"....", Toast.LENGTH_LONG).show();
    }




    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.gandhi_clear:
                gandhi_database clear1 = new gandhi_database(ctx);
                SQLiteDatabase db = clear1.getWritableDatabase();
                db.delete(gandhi_database.table1info.TABLE_NAME,null,null);
                db.close();

                break;

            case  R.id.gandhi_vice_captain:

                gandhi_vc();

                break;

            case  R.id.gandhi_captain:
                gandhi_c();
                break;
            case  R.id.teresa_clear:
                teresa_database clear2 = new teresa_database(ctx);
                SQLiteDatabase db2 = clear2.getWritableDatabase();
                db2.delete(teresa_database.table2info.TABLE_NAME,null,null);
                db2.close();
                break;
            case  R.id.teresa_vice_captain:
                teresa_vc();
                break;
            case  R.id.teresa_captain:
                teresa_c();
                break;
            case  R.id.tagore_clear:
                tagore_database clear3 = new tagore_database(ctx);
                SQLiteDatabase db3 = clear3.getWritableDatabase();
                db3.delete(tagore_database.table3info.TABLE_NAME,null,null);
                db3.close();
                break;
            case  R.id.tagore_vice_captain:
                tagore_vc();
                break;
            case  R.id.tagore_captain:
                tagore_c();
                break;
            case  R.id.nehru_clear:
                nehru_database clear4 = new nehru_database(ctx);
                SQLiteDatabase db4 = clear4.getWritableDatabase();
                db4.delete(nehru_database.table4info.TABLE_NAME,null,null);
                db4.close();
                break;
            case  R.id.nehru_vice_captain:
                nehru_vc();
                break;
            case  R.id.nehru_captain:
                nehru_c();
                break;



        }

    }
}
