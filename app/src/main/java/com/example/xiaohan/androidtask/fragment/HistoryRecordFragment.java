package com.example.xiaohan.androidtask.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xiaohan.androidtask.R;
import com.example.xiaohan.androidtask.base.BaseFragment;
import com.example.xiaohan.androidtask.view.IHistoryRecordView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryRecordFragment extends BaseFragment implements IHistoryRecordView {


    public HistoryRecordFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_history_record, container, false);
    }

}
