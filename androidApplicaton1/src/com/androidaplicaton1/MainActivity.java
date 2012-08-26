package com.androidaplicaton1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the message from the intent
     
        setContentView(R.layout.main);
    }
    public void sendMessage(View view){
    	
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText editText = (EditText) findViewById(R.id.editText1);
    	String message = editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);     	
    }
    
}