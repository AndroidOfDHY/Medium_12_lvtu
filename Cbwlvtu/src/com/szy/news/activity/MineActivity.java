package com.szy.news.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MineActivity extends Activity{
	private Button my_collect; 
	private Button my_journey; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mine_layout);
		my_collect=(Button) findViewById(R.id.my_collect); 
		my_collect.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
		            Intent intent=new Intent(MineActivity.this,MyCollectActivity.class);
		            startActivity(intent);
			   }
			  });
		my_journey=(Button) findViewById(R.id.my_journey); 
		my_journey.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
		            Intent intent=new Intent(MineActivity.this,MyJourneyActivity.class);
		            startActivity(intent);
			   }
			  });
	}
}
