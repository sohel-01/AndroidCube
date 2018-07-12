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

public class FullTimeFragment extends Fragment {

    @BindView(R.id.edtftSalary)
    EditText edtftSalary;
    @BindView(R.id.ftBonous)
    EditText ftBonous;

    Unbinder unbinder;

    public FullTimeFragment(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.frag_layout_full_time, container, false);
        unbinder = ButterKnife.bind(this, mView);
        return mView;
    }

}
