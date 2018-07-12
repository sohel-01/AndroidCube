package com.example.macstudent.emppayroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.macstudent.emppayroll.db.DbHandler;
import com.example.macstudent.emppayroll.modelEntities.Employee;
import com.example.macstudent.emppayroll.modelEntities.Vehicle;

import butterknife.BindView;

public class EmployeeProfile extends AppCompatActivity {

    @BindView(R.id.empname)
    TextView empname;
    @BindView(R.id.emptype)
    TextView emptype;
    @BindView(R.id.empearnings)
    TextView empearnings;
    @BindView(R.id.empdob)
    TextView empdob;
    @BindView(R.id.internschoolName)
    TextView internschoolname;
    @BindView(R.id.empvehicleDetail)
    TextView empVehicleDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_profile);
        setTitle("Employee Details");
        Employee memployee = (Employee) getIntent().getSerializableExtra("detail");
        empname.setText("Name : "+ memployee.getName());
        emptype.setText("Type : "+memployee.getEmpType());
        empearnings.setText("Earnings : "+memployee.getEarnings());
        empdob.setText("Date of Birth : "+memployee.getDob());

        if (!memployee.getSchoolName().equals(""))
        {
            internschoolname.setVisibility(View.VISIBLE);
            internschoolname.setText("School: "+memployee.getSchoolName());
        }
        Vehicle c = new DbHandler(this).getVehicle(memployee.getId());
        if (c != null)
        {
            String text = "Type: "+ c.getVehicleType() + "\nMake: "+c.getVehicleMake()+"\nModel:"+c.getVehicleModel()+"\nInsured: "+(c.getVehicleInsured() ?"Yes" : "No");
            empVehicleDetails.setText("Vehicle Information:\n"+text);
        }
        else {
            empVehicleDetails.setVisibility(View.GONE);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
    }

