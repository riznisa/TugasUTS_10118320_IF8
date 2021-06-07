package com.latihan.a10118320;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddActivity extends AppCompatActivity {

    DBHelper helper;
    EditText TxTitle, TxKategori, TxIsi;
    long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        helper = new DBHelper(this);

        id = getIntent().getLongExtra(DBHelper.row_id, 0);

        TxTitle = (EditText)findViewById(R.id.txTitle_add);
        TxKategori = (EditText)findViewById(R.id.txKategori_add);
        TxIsi = (EditText)findViewById(R.id.txIsi_add);
    }

    public boolean onCreateOptionMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.add_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save_add:
                String title = TxTitle.getText().toString().trim();
                String kategori = TxKategori.getText().toString().trim();
                String isi = TxIsi.getText().toString().trim();

                //get data
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat simpleDate = new SimpleDateFormat("MM dd, yyyy");
                String created = simpleDate.format(calendar.getTime());

                ContentValues values = new ContentValues();
                values.put(DBHelper.row_title, title);
                values.put(DBHelper.row_kategori, kategori);
                values.put(DBHelper.row_isi, isi);

                //create condition if title and deatil is empty(title.equals(""), kategori.equals(""), isi.equals("")) {
                //if Toast.makeText(AddActivity.this, "Nothing to save", Toast.LENGTH_SHORT).show();
            //}else{
                helper.insertData(values);
            //}

            //Toast.makeText(AddActivity.this, "Saved", Toast.LENGTH_SHORT).show();
            //finish();
        }

        return super.onOptionsItemSelected(item);
    }
}