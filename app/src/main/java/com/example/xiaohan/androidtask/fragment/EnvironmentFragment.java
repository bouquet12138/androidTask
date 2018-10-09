package com.example.xiaohan.androidtask.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xiaohan.androidtask.R;
import com.example.xiaohan.androidtask.base.BaseFragment;
import com.example.xiaohan.androidtask.view.IEnvironmentView;

/**
 * A simple {@link Fragment} subclass.
 */
public class EnvironmentFragment extends BaseFragment implements IEnvironmentView{


    public EnvironmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_environment, container, false);
    }

}
