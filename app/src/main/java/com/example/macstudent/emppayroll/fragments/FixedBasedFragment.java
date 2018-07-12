package com.example.macstudent.emppayroll.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.macstudent.emppayroll.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FixedBasedFragment extends Fragment {
    @BindView(R.id.edtRatefix)
    EditText edtRatefix;
    @BindView(R.id.edtHourfix)
    EditText edtHourfix;
    @BindView(R.id.edtFixAmt)
    EditText edtFixAmt;

    Unbinder unbinder;

    public FixedBasedFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.frag_layout_fixed_based,container,false);
        unbinder = ButterKnife.bind(this, mView);
        return mView;
    }
}
