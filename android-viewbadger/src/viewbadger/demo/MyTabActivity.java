package viewbadger.demo;

import com.readystatesoftware.viewbadger.BadgeView;
import com.readystatesoftware.viewbadger.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class MyTabActivity extends Activity{

	BadgeView badgeView;
	
	Button rb;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_base);
		rb=(Button) findViewById(R.id.bt);
		badgeView=new BadgeView(this, rb);
		badgeView.setWidth(20);
		badgeView.setHeight(20);
		badgeView.show();
	}

}
