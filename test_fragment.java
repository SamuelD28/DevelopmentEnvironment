package com.samdube.developmentenvironment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class test_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view =  inflater.inflate(R.layout.test_fragment, container, false);

        Button btnClose = (Button) view.findViewById(R.id.closeBtn);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button)v;
                RemoveFragment();
            }
        });

        return view;
    }

    public void RemoveFragment()
    {
        FragmentManager fragmentManger = getActivity().getSupportFragmentManager();
        if(fragmentManger == null)
            throw new NullPointerException("Fragment manager is not initialise in the activity");
        else
            fragmentManger.beginTransaction().remove(this).commit();
    }
}
