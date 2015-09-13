package com.sociablue.surbhisapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    LinearLayout slider;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        Log.e("mytage", "SurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhiSurbhi");
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
//        slider = (LinearLayout) rootView.findViewById(R.id.slider);

        return rootView;

    }

    @Override
    public void onResume() {
        super.onResume();
//        TranslateAnimation slideAnim = new TranslateAnimation(Animation.RELATIVE_TO_PARENT,0f,Animation.RELATIVE_TO_PARENT,0f,Animation.RELATIVE_TO_SELF,0f,Animation.RELATIVE_TO_SELF, -1.0f);
//        slideAnim.setDuration(8000);
//        slider.startAnimation(slideAnim);

    }
}
