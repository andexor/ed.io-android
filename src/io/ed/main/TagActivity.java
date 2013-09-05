package io.ed.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import io.ed.R;

//import android.content.SharedPreferences;

public class TagActivity extends Activity {

	/**
	 * Logger.
	 */
	// private static String TAG = TagActivity.class.getName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.tag_layout);
		Intent intent = this.getIntent();
		if (intent.getAction().equals(Intent.ACTION_SEND)) {
			String titleString = intent.getStringExtra(Intent.EXTRA_SUBJECT);
			String urlString = intent.getStringExtra(Intent.EXTRA_TEXT);
			TextView title = (TextView) findViewById(R.id.title);
			title.setText(titleString);
			TextView url = (TextView) findViewById(R.id.url);
			url.setText(urlString);
			// Bundle b = intent.getExtras();
			// Set<String> set = b.keySet();
			// Iterator<String> i = set.iterator();
			// Log.d(TAG, "=====");
			// while (i.hasNext()) {
			// String key = i.next();
			// Object o = b.get(key);
			// if (o instanceof String) {
			// String val = (String) o;
			// Log.d(TAG, "key=" + key + ", val=" + val);
			// } else
			// Log.d(TAG, "key=" + key + ", val is not a String");
			// }
		}
		// SharedPreferences sp = this.getSharedPreferences("screen", 0);
		// sp.getString("test", "default");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		this.getMenuInflater().inflate(R.menu.tag, menu);
		return true;
	}

	@Override
	protected void onRestart() {
		super.onRestart();
	}

	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onStop() {
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
	/*
	 * private void setStatus(String s) { // final TextView tags = (TextView)
	 * findViewById(R.id.tags); // String text = (String) tags.getText(); //
	 * text += s; // text += " "; // tags.setText(text); Log.d(TAG, s); }
	 */
}
