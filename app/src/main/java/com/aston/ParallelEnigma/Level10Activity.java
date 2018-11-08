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
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.webkit.WebViewClient;
import android.text.Editable;
import android.text.TextWatcher;
import android.content.ClipData;
import android.content.ClipboardManager;

public class Level10Activity extends Activity {
	
	
	private LinearLayout linear2;
	private TextView offline;
	private TextView textview2;
	private EditText ans;
	private WebView hashv;
	
	private Intent next = new Intent();
	private AlertDialog.Builder dialog;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.level10);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		offline = (TextView) findViewById(R.id.offline);
		textview2 = (TextView) findViewById(R.id.textview2);
		ans = (EditText) findViewById(R.id.ans);
		hashv = (WebView) findViewById(R.id.hashv);
		hashv.getSettings().setJavaScriptEnabled(true);
		hashv.getSettings().setSupportZoom(true);
		dialog = new AlertDialog.Builder(this);
		
		ans.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if(chkintconn()){
					    offline.setVisibility(View.INVISIBLE);
					hashv.setVisibility(View.VISIBLE);
					if (ans.getText().toString().toLowerCase().equals("1cc69f027a318e603bf9465ea666b96a")) {
						dialog.create().show();
					}
					else {
						hashv.loadUrl("https://helloacm.com/api/md5/?s=".concat(ans.getText().toString()));
					}
				}
				else{
					    offline.setVisibility(View.VISIBLE);
					    hashv.setVisibility(View.INVISIBLE);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		hashv.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				hashv.setVisibility(View.INVISIBLE);
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				hashv.setVisibility(View.VISIBLE);
				super.onPageFinished(_param1, _param2);
			}
		});
	}
	private void initializeLogic() {
		hashv.setVisibility(View.INVISIBLE);
		offline.setVisibility(View.INVISIBLE);
		((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "encrypt"));
		setTitle("Level10:Final Crypt");
		next.setClass(getApplicationContext(), FinalscnActivity.class);
		dialog.setTitle("Bravo🎉");
		dialog.setMessage("Game Completed✨");
		dialog.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				startActivity(next);
				hashv.clearCache(true);
				finish();
			}
		});
		dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		hashv.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _detconn () {
	}
	private boolean chkintconn() {
		Context context = this;
		ConnectivityManager con_manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		return (con_manager.getActiveNetworkInfo() != null && con_manager.getActiveNetworkInfo().isAvailable() && con_manager.getActiveNetworkInfo().isConnected());
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
