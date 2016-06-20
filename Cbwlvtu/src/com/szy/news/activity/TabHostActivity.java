package com.szy.news.activity;


import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
@SuppressWarnings("deprecation")
public class TabHostActivity extends TabActivity implements OnCheckedChangeListener {
	//public class TabHostActivity extends Activity{
	private TabHost tabHost;
	private Intent RecordIntent;
	private Intent NavigationIntent;
	private Intent FindIntent;
	private Intent MineIntent;
	private RadioGroup mainTab;
	@Override  
    public void onCreate(Bundle savedInstanceState) {  
       super.onCreate(savedInstanceState);
       requestWindowFeature(Window.FEATURE_NO_TITLE);
       setContentView(R.layout.base_radiobutton_layout); 
       mainTab=(RadioGroup)findViewById(R.id.rgMainBottomNav);
       mainTab.setOnCheckedChangeListener(this);

		//LayoutInflater.from(this).inflate(R.layout.base_radiobutton_layout, tabHost.getTabContentView(), true);

     initIntent();  
       addSpec(); 

    }
/*    private void initRadios() {
    	
        ((RadioButton) findViewById(R.id.rbRecodeModuleMain)).setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.rbTeamModuleMain)).setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.rbFindModuleMain)).setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.rbMineModuleMain)).setOnCheckedChangeListener(this);
   }*/

	private void initIntent() {
		RecordIntent = new Intent(this, RecordActivity.class);
		NavigationIntent = new Intent(this, GoHereActivity.class);
		FindIntent = new Intent(this, FindActivity.class);
		MineIntent = new Intent(this, MineActivity.class);

	 }
    private void addSpec() {
		this.tabHost=getTabHost();
		TabHost localTabHost=this.tabHost;
      tabHost.addTab(this.buildTagSpec("tab_record",R.string.record,R.drawable.six_main_record, RecordIntent));
      tabHost.addTab(this.buildTagSpec("tab_navigation",R.string.navigation,R.drawable.six_main_team, NavigationIntent));
      tabHost.addTab(this.buildTagSpec("tab_find",R.string.find,R.drawable.six_main_find, FindIntent));
      tabHost.addTab(this.buildTagSpec("tab_mine", R.string.mine,R.drawable.six_main_mine, MineIntent));
      }
    private TabHost.TabSpec buildTagSpec(String tagName, int tagLable,  
            int icon, Intent content) {  
        return tabHost  
               .newTabSpec(tagName)  
               .setIndicator(getResources().getString(tagLable),  
                      getResources().getDrawable(icon)).setContent(content);  
     }

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub

            switch (checkedId) {
            case R.id.rbRecodeModuleMain:
                this.tabHost.setCurrentTabByTag("tab_record");
                break;
            case R.id.rbTeamModuleMain:
                this.tabHost.setCurrentTabByTag("tab_navigation");
                break;
            case R.id.rbFindModuleMain:
                this.tabHost.setCurrentTabByTag("tab_find");
                break;
            case R.id.rbMineModuleMain:
                this.tabHost.setCurrentTabByTag("tab_mine");
                break;
            
        }
	}
}
