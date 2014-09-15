package com.example.simplerssreader;

//import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

	/**List headlines;
	List links;**/
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/**headlines= new ArrayList();
		links= new ArrayList();**/
		
		 if (savedInstanceState == null) {
	            addRssFragment();
	     }
		
			}

	private void addRssFragment() {
		// TODO Auto-generated method stub
		FragmentManager manager = getSupportFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		RssFragment fragment = new RssFragment();
		transaction.add(R.id.fragment_container, fragment);
		transaction.commit();	
	}

	@Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("fragment_added", true);
    }
}
