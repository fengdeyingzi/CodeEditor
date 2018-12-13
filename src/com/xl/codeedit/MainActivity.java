package com.xl.codeedit;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import com.luoye.simpleC.view.TextEditor;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		TextEditor edit = new TextEditor(this);
		setContentView(edit);
		
		
    }
}
