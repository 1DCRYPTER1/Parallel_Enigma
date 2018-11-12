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
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.graphics.Typeface;

public class AboutActivity extends Activity {
	
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView appnm;
	private ImageView imageview2;
	private TextView desp;
	private TextView vinfo;
	private ImageView imageview1;
	private TextView contxt;
	
	private Intent contact = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.about);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		appnm = (TextView) findViewById(R.id.appnm);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		desp = (TextView) findViewById(R.id.desp);
		vinfo = (TextView) findViewById(R.id.vinfo);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		contxt = (TextView) findViewById(R.id.contxt);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				contact.setData(Uri.parse("mailto:astonlopes1999@gmail.com?subject=Parallel+Enigma+Review"));
				contact.setAction(Intent.ACTION_VIEW);
				startActivity(contact);
			}
		});
	}
	private void initializeLogic() {
		setTitle("About");
		appnm.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/range_mono.ttf"), 0);
		desp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/range_mono.ttf"), 0);
		contxt.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/range_mono.ttf"), 0);
		vinfo.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/range_mono.ttf"), 0);
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
