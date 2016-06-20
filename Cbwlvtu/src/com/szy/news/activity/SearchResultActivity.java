package com.szy.news.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SearchResultActivity extends Activity{
	private Button btnBackInFindSearch; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search_result_layout);
		btnBackInFindSearch=(Button) findViewById(R.id.btnBackInFindSearch); 
		btnBackInFindSearch.setOnClickListener(new OnClickListener() {
			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub 
		            Intent intent=new Intent(SearchResultActivity.this,FindSearchActivity.class);
		            startActivity(intent);
			   }
			  });
	}
}
