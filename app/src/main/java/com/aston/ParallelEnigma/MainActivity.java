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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.view.View;
import android.graphics.Typeface;

public class MainActivity extends Activity {
	
	
	private LinearLayout linear2;
	private ImageView imageview3;
	private TextView textview1;
	private Button button2;
	private ImageView imageview2;
	
	private SharedPreferences savegame;
	private Intent play = new Intent();
	private AlertDialog.Builder msgbox;
	private MediaPlayer intro;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview1 = (TextView) findViewById(R.id.textview1);
		button2 = (Button) findViewById(R.id.button2);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		savegame = getSharedPreferences("savegame", Activity.MODE_PRIVATE);
		msgbox = new AlertDialog.Builder(this);
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				play.setClass(getApplicationContext(), HelpActivity.class);
				startActivity(play);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivity(play);
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				play.setClass(getApplicationContext(), AboutActivity.class);
				startActivity(play);
			}
		});
	}
	private void initializeLogic() {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/range_mono.ttf"), 1);
		intro = MediaPlayer.create(getApplicationContext(), R.raw.intro);
		intro.setLooping(true);
		intro.start();
		play.setClass(getApplicationContext(), SplashActivity.class);
		startActivity(play);
		if (savegame.getString("level", "").equals("")) {
			SketchwareUtil.showMessage(getApplicationContext(), "Thank you for installing☺️");
			savegame.edit().putString("level", "1").commit();
			play.setClass(getApplicationContext(), HelpActivity.class);
			startActivity(play);
		}
		if (savegame.getString("level", "").equals("1")) {
			play.setClass(getApplicationContext(), Level1Activity.class);
		}
		else {
			if (savegame.getString("level", "").equals("2")) {
				play.setClass(getApplicationContext(), Level2Activity.class);
			}
			else {
				if (savegame.getString("level", "").equals("3")) {
					play.setClass(getApplicationContext(), Level3Activity.class);
				}
				else {
					if (savegame.getString("level", "").equals("4")) {
						play.setClass(getApplicationContext(), Level4Activity.class);
					}
					else {
						if (savegame.getString("level", "").equals("5")) {
							play.setClass(getApplicationContext(), Level5Activity.class);
						}
						else {
							if (savegame.getString("level", "").equals("6")) {
								play.setClass(getApplicationContext(), Level6Activity.class);
							}
							else {
								if (savegame.getString("level", "").equals("7")) {
									play.setClass(getApplicationContext(), Level7Activity.class);
								}
								else {
									if (savegame.getString("level", "").equals("8")) {
										play.setClass(getApplicationContext(), Level8Activity.class);
									}
									else {
										if (savegame.getString("level", "").equals("9")) {
											play.setClass(getApplicationContext(), Level9Activity.class);
										}
										else {
											if (savegame.getString("level", "").equals("10")) {
												play.setClass(getApplicationContext(), Level10Activity.class);
											}
											else {
												
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
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		msgbox.setTitle("Quit");
		msgbox.setMessage("Do you really want to exit?");
		msgbox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				intro.release();
				finish();
			}
		});
		msgbox.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		msgbox.create().show();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (savegame.getString("level", "").equals("1")) {
			play.setClass(getApplicationContext(), Level1Activity.class);
		}
		else {
			if (savegame.getString("level", "").equals("2")) {
				play.setClass(getApplicationContext(), Level2Activity.class);
			}
			else {
				if (savegame.getString("level", "").equals("3")) {
					play.setClass(getApplicationContext(), Level3Activity.class);
				}
				else {
					if (savegame.getString("level", "").equals("4")) {
						play.setClass(getApplicationContext(), Level4Activity.class);
					}
					else {
						if (savegame.getString("level", "").equals("5")) {
							play.setClass(getApplicationContext(), Level5Activity.class);
						}
						else {
							if (savegame.getString("level", "").equals("6")) {
								play.setClass(getApplicationContext(), Level6Activity.class);
							}
							else {
								if (savegame.getString("level", "").equals("7")) {
									play.setClass(getApplicationContext(), Level7Activity.class);
								}
								else {
									if (savegame.getString("level", "").equals("8")) {
										play.setClass(getApplicationContext(), Level8Activity.class);
									}
									else {
										if (savegame.getString("level", "").equals("9")) {
											play.setClass(getApplicationContext(), Level9Activity.class);
										}
										else {
											if (savegame.getString("level", "").equals("10")) {
												play.setClass(getApplicationContext(), Level10Activity.class);
											}
											else {
												
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
