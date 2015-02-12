package com.example.pruebas1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button = (Button) findViewById(R.id.button1);
		
		final Activity act = this;
		
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Log.i(this.getClass().getName(),"Llamanda a ventana dos");
		         
				Intent intent = new Intent(act,DosActivity.class);
		            startActivity(intent);

				};
				
				

			});
	}
}
