package com.szy.news.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FindActivity extends Activity{
	private Button btnSearchInFindSearch; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find_layout);
		btnSearchInFindSearch=(Button) findViewById(R.id.btnSearchInFindSearch); 
		btnSearchInFindSearch.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
		            Intent intent=new Intent(FindActivity.this,FindSearchActivity.class);
		            startActivity(intent);
			   }
			  });
	}
}
