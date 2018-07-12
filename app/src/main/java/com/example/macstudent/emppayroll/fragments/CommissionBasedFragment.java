package com.example.macstudent.emppayroll.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.macstudent.emppayroll.R;
import com.example.macstudent.emppayroll.modelEntities.CommissionBasedPartTime;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class CommissionBasedFragment extends Fragment {
    @BindView(R.id.edtCommHour)
    EditText edtCommHour;
    @BindView(R.id.edtCommRate)
    EditText edtCommRate;
    @BindView(R.id.edtCommPercent)
    EditText edtCommPercent;
    Unbinder unbinder;

    public CommissionBasedFragment(){


    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View mView = inflater.inflate(R.layout.frag_layout_commisiion_based,container,false);
        unbinder = ButterKnife.bind(this, mView);
        return mView;
    }
}
