package cn.edu.gdmec.s07131039.intentfiles;

import cn.edu.gdmec.s07131039.intentfiles.R;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText myet;
	Button mybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybtn = (Button) findViewById(R.id.button1);
        myet = (EditText) findViewById(R.id.editText1);
        mybtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri myuri = Uri.parse(myet.getText().toString());
				Intent myet = new Intent(Intent.ACTION_VIEW,myuri);
				startActivity(myet);
				
			}
        	
        });
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
