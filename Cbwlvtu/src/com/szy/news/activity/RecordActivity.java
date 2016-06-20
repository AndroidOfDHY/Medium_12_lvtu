package com.szy.news.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RecordActivity extends Activity{
	private Button btnStartRecode; 
	private Button btnPauseRecode; 
	private Button btnStopRecode; 
	private Button btnGoonRecode; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.record_layout);
		btnStartRecode=(Button) findViewById(R.id.btnStartRecode); 
		btnPauseRecode=(Button) findViewById(R.id.btnPauseRecode); 
		btnStopRecode=(Button) findViewById(R.id.btnStopRecode);
		btnGoonRecode=(Button) findViewById(R.id.btnGoonRecode); 
		btnStartRecode.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
				   btnPauseRecode.setVisibility(View.VISIBLE);
				   btnStopRecode.setVisibility(View.VISIBLE);
				   btnStartRecode.setVisibility(View.GONE);
			   }
			  });
		btnPauseRecode.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
				   btnPauseRecode.setVisibility(View.GONE);
				   btnGoonRecode.setVisibility(View.VISIBLE);
			   }
			  });
		btnGoonRecode.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
				   btnPauseRecode.setVisibility(View.VISIBLE);
				   btnGoonRecode.setVisibility(View.GONE);
			   }
			  });
		btnStopRecode.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
		            Intent intent=new Intent(RecordActivity.this,SaveOrGiveupActivity.class);
		            startActivity(intent);
			   }
			  });

	}
}
