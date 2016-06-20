package com.szy.news.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ItemSaveTrackHeadviewActivity extends Activity {
	private Button button1; 
	private Button button2; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.item_save_track_headview);
		button1=(Button) findViewById(R.id.button1); 
		button2=(Button) findViewById(R.id.button2); 
		button1.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
				   finish();
			   }
			  });
		button2.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
		            Intent intent=new Intent(ItemSaveTrackHeadviewActivity.this,TabHostActivity.class);
		            startActivity(intent);
			   }
			  });
	}
}
