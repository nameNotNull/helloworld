package com.example.testandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.view.View;;
public class HelloWorld extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello_world, menu);
        return true;
    }
    
    public void clickHandler(View source)
    {
    	TextView tv = (TextView) findViewById(R.id.textView2);
    	tv.setText("now time is " +new java.util.Date());
    	
    	
    }
}
