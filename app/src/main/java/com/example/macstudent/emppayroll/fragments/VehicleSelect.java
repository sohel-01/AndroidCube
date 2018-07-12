package com.example.macstudent.emppayroll.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.macstudent.emppayroll.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class VehicleSelect extends Fragment {

@BindView(R.id.txtVehType)
TextView txtVehTypeTitle;
@BindView(R.id.rgbVehicle)
RadioGroup rgbVehicle;
@BindView(R.id.rbCar)
RadioButton rbCar;
@BindView(R.id.rbMotorcycle)
RadioButton rbMotorcycle;
@BindView(R.id.imgMake)
ImageView imgMake;
@BindView(R.id.actvMaker)
AutoCompleteTextView actvMake;
@BindView(R.id.txtVehName)
TextView txtVehName;
@BindView(R.id.edtLicencePlate)
EditText edtLicencePlate;

Unbinder unbinder;

public VehicleSelect(){

}
@Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_vehicel_select, container, false);
        setHasOptionsMenu(true);
        unbinder = ButterKnife.bind(this, mView);

        return mView;
    }


}
