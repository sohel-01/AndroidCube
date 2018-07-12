package com.example.macstudent.emppayroll.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.macstudent.emppayroll.R;
import com.example.macstudent.emppayroll.modelEntities.Employee;

import java.util.List;

public class EmployeeAdapterRecView extends RecyclerView.Adapter<EmployeeAdapterRecView.CombinedViewHandler> {
    private Context mContext;

    private List<Employee> employeeList;

    public EmployeeAdapterRecView(Context mContext,List<Employee> employeeList){
        this.mContext = mContext;
        this.employeeList = employeeList;
    }

    @Override
    public void onBindViewHolder(CombinedViewHandler handler, int position) {
    Employee employee = employeeList.get(position);

    handler.textViewName.setText("Name : "+employee.getName());
    handler.textViewDob.setText("Date of Birth : "+employee.getDob());
    handler.textViewType.setText("Employee Nature : "+String.valueOf(employee.getEmpType()));
    }

    @Override
    public CombinedViewHandler onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        //LayoutInflater inflater = LayoutInflater.from(mCtx);
        //View view = inflater.inflate(R.layout.payroll_emp_item, null);
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_employee_item_view, parent, false);
        return new CombinedViewHandler(view);
    }
        @Override
        public int getItemCount () {
            return employeeList.size();
        }

        class CombinedViewHandler extends RecyclerView.ViewHolder {

            TextView textViewName, textViewDob, textViewType;

            public CombinedViewHandler(View itemView) {
                super(itemView);

                textViewName = itemView.findViewById(R.id.textViewName);
                textViewDob = itemView.findViewById(R.id.textViewDob);
                textViewType = itemView.findViewById(R.id.textViewtype);
            }
        }
    }
