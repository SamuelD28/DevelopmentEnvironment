package com.samdube.developmentenvironment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        for(int i = 0 ; i < 5 ; i++ )
        {
            test_fragment fragment = new test_fragment();
            fragmentTransaction.add(R.id.fragmentContainer, fragment);
        }
        fragmentTransaction.commit();
    }
}
