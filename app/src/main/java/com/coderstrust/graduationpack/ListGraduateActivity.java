package com.coderstrust.graduationpack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListGraduateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_graduate);

        ListView lv = findViewById(R.id.list_view);

        ArrayList<String> graduates = new ArrayList<>();

        graduates.add("Timz owen");
        graduates.add("Kevin Brian");
        graduates.add("Steve Owino");
        graduates.add("Ian owen");
        graduates.add("Kevin Bravin");
        graduates.add("Andrew Owino");
        graduates.add("Timz Kipkosgei");
        graduates.add("Justus Brian");
        graduates.add("Steve Rono");
        graduates.add("Timz owen");
        graduates.add("Ian Brian");
        graduates.add("Steve Oluoch");
        graduates.add("Vincent owen");
        graduates.add("Kevin Kipchumba");
        graduates.add("Larry Owino");
        graduates.add("Timz Mathew");
        graduates.add("Justine Brian");
        graduates.add("Steve Sheila");
        graduates.add("Bravin owen");
        graduates.add("Kevin Oluch");
        graduates.add("Stephen  Owino");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,graduates);

        lv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home) {
            startActivity(new Intent(ListGraduateActivity.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}