
package com.fuav.android.fragments.support;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fuav.android.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScopeOfServiceFragment extends Fragment {


    public ScopeOfServiceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scope_of_service, container, false);
    }

}