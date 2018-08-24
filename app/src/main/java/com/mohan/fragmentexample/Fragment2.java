package com.mohan.fragmentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment2 extends Fragment{
    private static final String TAG = "Fragment1";

    private Button buttonNavFrag1;
    private Button buttonNavFrag2;
    private Button buttonNavFrag3;
    private Button buttonNavSecondActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout, container , false);
        buttonNavFrag1 = (Button) view.findViewById(R.id.btnNavFrag1);
        buttonNavFrag2 = (Button) view.findViewById(R.id.btnNavFrag2);
        buttonNavFrag3 = (Button) view.findViewById(R.id.btnNavFrag3);
        buttonNavSecondActivity = (Button) view.findViewById(R.id.btnNavSecondActivity);
        Log.d(TAG, "onCreateView: Started");

        buttonNavFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Going to Fragment 1", Toast.LENGTH_LONG).show();

                ((MainActivity)getActivity()).setViewPager(0);
            }
        });
        buttonNavFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Going to Fragment 2", Toast.LENGTH_LONG).show();

                ((MainActivity)getActivity()).setViewPager(1);
            }
        });
        buttonNavFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Going to Fragment 3", Toast.LENGTH_LONG).show();

                ((MainActivity)getActivity()).setViewPager(2);
            }
        });

        buttonNavSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Going to Fragment 1", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
                // navigate to fragment method called
            }
        });

        return view;
    }
}
