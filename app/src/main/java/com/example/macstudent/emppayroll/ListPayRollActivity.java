package com.example.macstudent.emppayroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.example.macstudent.emppayroll.adapter.EmployeeAdapterRecView;
import com.example.macstudent.emppayroll.db.DbHandler;
import com.example.macstudent.emppayroll.modelEntities.Employee;
import com.example.macstudent.emppayroll.RecyclerViewItemClickListner;

import java.util.ArrayList;

public class ListPayRollActivity extends AppCompatActivity {

    public ListPayRollActivity(){

    }
    private ArrayList<Employee> empolyeeList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pay_roll);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //
        recyclerView = (RecyclerView) findViewById(R.id.list_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addOnItemTouchListener(new RecyclerViewItemClickListner(this, recyclerView ,new RecyclerViewItemClickListner.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Intent intent = new Intent(ListPayRollActivity.this,EmployeeProfile.class);
                        intent.putExtra("detail",empolyeeList.get(position));
                        startActivity(intent);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        Toast.makeText(ListPayRollActivity.this, "No action ", Toast.LENGTH_SHORT).show();
                    }
                })
        );
        empolyeeList = new ArrayList<Employee>();
        empolyeeList.addAll(new DbHandler(this).getAllEmployess());
        
        EmployeeAdapterRecView adapter = new EmployeeAdapterRecView(this, empolyeeList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}
