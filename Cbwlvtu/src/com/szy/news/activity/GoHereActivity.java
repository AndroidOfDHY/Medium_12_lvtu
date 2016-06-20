package com.szy.news.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GoHereActivity extends Activity {
	private Button btnStartChoose; 

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.go_here_layout);
		btnStartChoose=(Button) findViewById(R.id.btnStartChoose); 
		btnStartChoose.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
		            Intent intent=new Intent(GoHereActivity.this,NavigationActivity.class);
		            startActivity(intent);
			   }
			  });
	}
}
