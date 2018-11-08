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
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.animation.Animator;
import android.view.View;
import android.graphics.Typeface;

public class Level2Activity extends Activity {
	
	
	private LinearLayout linear5;
	private TextView textview1;
	private LinearLayout linear9;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private Button rstbtn;
	private ImageView imageview1;
	private ImageView imageview2;
	private ImageView imageview3;
	private ImageView imageview4;
	private ImageView imageview5;
	private ImageView imageview6;
	private ImageView imageview7;
	private ImageView imageview8;
	private ImageView imageview9;
	
	private Intent next = new Intent();
	private AlertDialog.Builder dialog;
	private SharedPreferences savegame;
	private ObjectAnimator objanim = new ObjectAnimator();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.level2);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		rstbtn = (Button) findViewById(R.id.rstbtn);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		dialog = new AlertDialog.Builder(this);
		savegame = getSharedPreferences("savegame", Activity.MODE_PRIVATE);
		
		rstbtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview2.setRotation((float)(90));
				imageview3.setRotation((float)(180));
				imageview4.setRotation((float)(90));
				imageview5.setRotation((float)(270));
				imageview6.setRotation((float)(270));
				imageview7.setRotation((float)(90));
				imageview8.setRotation((float)(0));
				imageview9.setRotation((float)(180));
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				objanim.setTarget(imageview2);
				objanim.setPropertyName("rotation");
				objanim.setDuration((int)(500));
				objanim.setInterpolator(new LinearInterpolator());
				objanim.setFloatValues((float)((imageview2.getRotation() + 90) % 360));
				objanim.start();
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				objanim.setTarget(imageview3);
				objanim.setPropertyName("rotation");
				objanim.setDuration((int)(500));
				objanim.setInterpolator(new LinearInterpolator());
				objanim.setFloatValues((float)((imageview3.getRotation() + 90) % 360));
				objanim.start();
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				objanim.setTarget(imageview4);
				objanim.setPropertyName("rotation");
				objanim.setDuration((int)(500));
				objanim.setInterpolator(new LinearInterpolator());
				objanim.setFloatValues((float)((imageview4.getRotation() + 90) % 360));
				objanim.start();
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				objanim.setTarget(imageview5);
				objanim.setPropertyName("rotation");
				objanim.setDuration((int)(500));
				objanim.setInterpolator(new LinearInterpolator());
				objanim.setFloatValues((float)((imageview5.getRotation() + 90) % 360));
				objanim.start();
			}
		});
		
		imageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				objanim.setTarget(imageview6);
				objanim.setPropertyName("rotation");
				objanim.setDuration((int)(500));
				objanim.setInterpolator(new LinearInterpolator());
				objanim.setFloatValues((float)((imageview6.getRotation() + 90) % 360));
				objanim.start();
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				objanim.setTarget(imageview7);
				objanim.setPropertyName("rotation");
				objanim.setDuration((int)(500));
				objanim.setInterpolator(new LinearInterpolator());
				objanim.setFloatValues((float)((imageview7.getRotation() + 90) % 360));
				objanim.start();
			}
		});
		
		imageview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				objanim.setTarget(imageview8);
				objanim.setPropertyName("rotation");
				objanim.setDuration((int)(500));
				objanim.setInterpolator(new LinearInterpolator());
				objanim.setFloatValues((float)((imageview8.getRotation() + 90) % 360));
				objanim.start();
			}
		});
		
		imageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				objanim.setTarget(imageview9);
				objanim.setPropertyName("rotation");
				objanim.setDuration((int)(500));
				objanim.setInterpolator(new LinearInterpolator());
				objanim.setFloatValues((float)((imageview9.getRotation() + 90) % 360));
				objanim.start();
			}
		});
		
		objanim.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				if (imageview1.getRotation() == 0) {
					if (imageview2.getRotation() == 0) {
						if (imageview3.getRotation() == 0) {
							if (imageview4.getRotation() == 0) {
								if (imageview5.getRotation() == 0) {
									if (imageview6.getRotation() == 0) {
										if (imageview7.getRotation() == 0) {
											if (imageview8.getRotation() == 0) {
												if (imageview9.getRotation() == 0) {
													dialog.create().show();
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
	}
	private void initializeLogic() {
		setTitle("Level2:The Maze");
		next.setClass(getApplicationContext(), Level3Activity.class);
		dialog.setTitle("Success");
		dialog.setMessage("Are you ready for next level?");
		dialog.setPositiveButton("Yes✔️", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				savegame.edit().putString("level", "3").commit();
				startActivity(next);
				finish();
			}
		});
		dialog.setNegativeButton("No❌", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		rstbtn.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/range_mono.ttf"), 1);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/range_mono.ttf"), 1);
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
