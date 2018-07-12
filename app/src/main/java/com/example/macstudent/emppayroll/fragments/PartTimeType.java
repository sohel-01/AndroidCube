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

import com.example.macstudent.emppayroll.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class PartTimeType extends Fragment {
    @BindView(R.id.txtPTtype)
    TextView txtPTtype;
    @BindView(R.id.rgPartTimeType)
    RadioGroup rgPartTimeType;
    @BindView(R.id.rbCommBasedPT)
    RadioButton rbCommBasedPT;
    @BindView(R.id.rbFixBasedPT)
    RadioButton rbFixBasedPT;

    Unbinder unbinder;


    public PartTimeType() {
        // Required empty public constructor
    }

@Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.frag_layout_part_time_type, container, false);
        unbinder = ButterKnife.bind(this, mView);
rgPartTimeType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int id = checkedId;

        if (id == R.id.rbCommBasedPT){
            FragmentManager mFragmentManager = getFragmentManager();
            FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
            CommissionBasedFragment commissionBasedFragment = new CommissionBasedFragment();
            mFragmentTransaction.replace(R.id.fragCommBased,commissionBasedFragment);
        }
        if (id == R.id.rbFixBasedPT){
            FragmentManager mFragmentManager = getFragmentManager();
            FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
            FixedBasedFragment fixedBasedFragment = new FixedBasedFragment();
            mFragmentTransaction.replace(R.id.fragFixBased,fixedBasedFragment);
        }

    }
});
        return mView;
    }
}
