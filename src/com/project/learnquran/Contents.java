package com.project.learnquran;

import java.util.zip.Inflater;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Toast;

public class Contents extends Fragment implements OnTouchListener {
	
	float x1 , y1;
	float x2, y2;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v =  inflater.inflate(R.layout.contents, container, false);
		return v;
	}
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		Log.e("1", "onTouch called");
		switch (event.getAction()) {
		// This executes when user first touches the screen
		case MotionEvent.ACTION_DOWN:
			x1 = event.getX();
			y1 = event.getY();
			break;
		case MotionEvent.ACTION_UP:
			x2 = event.getX();
			y2 = event.getY();
			if (x1 < x2)
            {
				Toast.makeText(getActivity().getApplicationContext(), "Left to Right Swap Performed", Toast.LENGTH_LONG).show();
            }
            // if right to left sweep event on screen
            if (x1 > x2)
            {
            	Toast.makeText(getActivity().getApplicationContext(), "Right to Left Swap Performed", Toast.LENGTH_LONG).show();
            }
            // if UP to Down sweep event on screen
            if (y1 < y2)
            {
            	Toast.makeText(getActivity().getApplicationContext(), "UP to Down Swap Performed", Toast.LENGTH_LONG).show();
            }
            //if Down to UP sweep event on screen
            if (y1 > y2)
            {
            	Toast.makeText(getActivity().getApplicationContext(), "Down to UP Swap Performed", Toast.LENGTH_LONG).show();
            }
			break;
		default:
			break;
		}
		return false;
	}
	
}
