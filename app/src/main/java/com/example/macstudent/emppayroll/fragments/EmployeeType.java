package com.example.macstudent.emppayroll.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.macstudent.emppayroll.R;
import com.example.macstudent.emppayroll.modelEntities.PartTime;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class EmployeeType extends Fragment {

    @BindView(R.id.txtTofEmp)
    TextView txtToEmp;
    @BindView(R.id.rgEmpType)
    RadioGroup rgEmpType;
    @BindView(R.id.rbPartTime)
    RadioButton rbPartTime;
    @BindView(R.id.rbFullTime)
    RadioButton rbFullTime;
    @BindView(R.id.rbIntern)
    RadioButton rbIntern;
    Unbinder unbinder;

public EmployeeType(){

}
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_employee_type, container, false);
        setHasOptionsMenu(true);
        unbinder = ButterKnife.bind(this, mView);
rgEmpType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int id = checkedId;

        switch (id) {
            case R.id.rbPartTime: {
                FragmentManager mFragmentManager = getFragmentManager();
                FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
                PartTimeType partTimeType = new PartTimeType();
                mFragmentTransaction.add(R.id.fragSelectPTType, partTimeType);
                break;
            }
            case R.id.rbFullTime: {
                FragmentManager mFragmentManager = getFragmentManager();
                FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
                FullTimeFragment fullTimeFragment = new FullTimeFragment();
                mFragmentTransaction.replace(R.id.fragFullTime, fullTimeFragment);
                break;
            }
            case R.id.rbIntern: {
                FragmentManager mFragmentManager = getFragmentManager();
                FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
                InternFragment internFragment = new InternFragment();
                mFragmentTransaction.replace(R.id.fragIntern, internFragment);
                break;
            }
        }
    }
});
        return mView;
    }
}