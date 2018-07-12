package com.example.macstudent.emppayroll;

import android.app.DatePickerDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.macstudent.emppayroll.fragments.VehicleSelect;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import butterknife.BindView;

public class AddEmployeeDetailsActivity extends AppCompatActivity {
    EditText edtEmployeeName;
    EditText edtDOB;
    CheckBox chIsVehicle;
    Calendar myCalendar = Calendar.getInstance();

    String[] Values = getResources().getStringArray(R.array.Maker);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee_details);

        edtEmployeeName = findViewById(R.id.edtEnterEmployee);
        edtDOB = (EditText) findViewById(R.id.dateOfBirth);
        edtDOB.setText(Utility.getDateTimeWithoutTime());
        setUpListener();
        chIsVehicle = (CheckBox) findViewById(R.id.chkIsVehicle);
    }

    private void setUpListener() {
        edtDOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePicker();
            }

        });

        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };

        public void chkboxSelected (View view){
            FragmentManager mFragmentManager = getFragmentManager();
            FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
            VehicleSelect mVehicleSelect = new VehicleSelect();
            mFragmentTransaction.add(R.id.fragVehicleSelect, mVehicleSelect);

        }
    }

    private void updateLabel() {
        String myFormat = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.getDefault());
        edtDOB.setText(sdf.format(myCalendar.getTime()));
    }

    private void showDatePicker() {
        DatePickerDialog dd = new DatePickerDialog(AddEmployeeDetailsActivity.this, date, myCalendar
                .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH));
        dd.getDatePicker().setMaxDate(System.currentTimeMillis());
        dd.show();
    }
}