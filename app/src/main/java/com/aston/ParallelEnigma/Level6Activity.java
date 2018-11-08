package com.aston.ParallelEnigma;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.graphics.Typeface;

public class Level6Activity extends Activity {
	
	
	private LinearLayout linear1;
	private TextView q1;
	private EditText answer1;
	private TextView q2;
	private EditText answer2;
	private TextView q3;
	private EditText answer3;
	
	private SharedPreferences savegame;
	private Intent next = new Intent();
	private AlertDialog.Builder dialog;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.level6);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		q1 = (TextView) findViewById(R.id.q1);
		answer1 = (EditText) findViewById(R.id.answer1);
		q2 = (TextView) findViewById(R.id.q2);
		answer2 = (EditText) findViewById(R.id.answer2);
		q3 = (TextView) findViewById(R.id.q3);
		answer3 = (EditText) findViewById(R.id.answer3);
		savegame = getSharedPreferences("savegame", Activity.MODE_PRIVATE);
		dialog = new AlertDialog.Builder(this);
		
		answer1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (answer1.getText().toString().toLowerCase().equals("strontium")) {
					if (answer2.getText().toString().toLowerCase().equals("krypton")) {
						if (answer3.getText().toString().toLowerCase().equals("barium")) {
							dialog.create().show();
						}
					}
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		answer2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (answer1.getText().toString().toLowerCase().equals("strontium")) {
					if (answer2.getText().toString().toLowerCase().equals("krypton")) {
						if (answer3.getText().toString().toLowerCase().equals("barium")) {
							dialog.create().show();
						}
					}
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		answer3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (answer1.getText().toString().toLowerCase().equals("strontium")) {
					if (answer2.getText().toString().toLowerCase().equals("krypton")) {
						if (answer3.getText().toString().toLowerCase().equals("barium")) {
							dialog.create().show();
						}
					}
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
	}
	private void initializeLogic() {
		setTitle("Level6:Periodic Crypt");
		next.setClass(getApplicationContext(), Level7Activity.class);
		dialog.setTitle("Success");
		dialog.setMessage("Are you ready for next level?");
		dialog.setPositiveButton("Yes✔️", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				savegame.edit().putString("level", "7").commit();
				startActivity(next);
				finish();
			}
		});
		dialog.setNegativeButton("No❌", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		q1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/range_mono.ttf"), 1);
		q2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/range_mono.ttf"), 1);
		q3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/range_mono.ttf"), 1);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
