package com.szy.news.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SaveOrGiveupActivity extends Activity {
	private Button Cancel_track; 
	private Button Give_up_track; 
	private Button Sace_track; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.save_or_giveup);
		Cancel_track=(Button) findViewById(R.id.Cancel_track); 
		Give_up_track=(Button) findViewById(R.id.Give_up_track); 
		Sace_track=(Button) findViewById(R.id.Sace_track); 
		Sace_track.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
		            Intent intent=new Intent(SaveOrGiveupActivity.this,ItemSaveTrackHeadviewActivity.class);
		            startActivity(intent);
			   }
			  });
		Give_up_track.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
		            Intent intent=new Intent(SaveOrGiveupActivity.this,TabHostActivity.class);
		            startActivity(intent);
			   }
			  });
		Cancel_track.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
				   finish();
			   }
			  });
	}
}
