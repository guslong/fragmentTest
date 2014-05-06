package com.example.fragtest1;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// create a ViewFragment object which will be passed to the fragment transaction
		Fragment viewFragment = new ViewFragment();
		
		// create a Fragment transaction
		FragmentTransaction f1 = 
				getFragmentManager().beginTransaction().add(android.R.id.content, viewFragment);
		// do it
		f1.commit();
		
		
		/**
		 * adding the second fragment
		 */
		
		Fragment fragment2 = new Fragment2();
		FragmentTransaction f2 = 
				getFragmentManager().beginTransaction().add(android.R.id.content, fragment2);
		// do it
		f2.commit();
		
	}
}
