package com.example.jathinvarma.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jathinvarma.R;
import com.example.jathinvarma.Word_MeaningActivity;

public class FragmentExample extends Fragment {
    public FragmentExample(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState){
        View view =inflater.inflate(R.layout.fragment_defintion, container, false);

        Context context=getActivity();

        TextView text = (TextView) view.findViewById(R.id.txtTV);//Find textView Id

        String example= ((Word_MeaningActivity)context).example;
        text.setText(example);

        if(example==null)
        {
            text.setText("No Example found");
        }
        return view;
    }
}
