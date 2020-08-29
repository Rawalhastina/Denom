package com.example.denom;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends ActionBarActivity {
	public TextView n1,n3,n5,n7,n9,n11,n13,n15;
	public EditText n2,n4,n6,n8,n10,n12,n14,n16;
	public TextView res,res1,res2,res3,res4,res5,res6,res7;
	Button buttonTotal, buttonClear;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		n1 = (TextView)findViewById(R.id.textView10);
		n2 = (EditText)findViewById(R.id.editText6);
		n3 = (TextView)findViewById(R.id.textView9);
		n4 = (EditText)findViewById(R.id.editText10);
		n5 = (TextView)findViewById(R.id.textView8);
		n6 = (EditText)findViewById(R.id.editText11);
		n7 = (TextView)findViewById(R.id.textView7);
		n8 = (EditText)findViewById(R.id.editText12);
		n9 = (TextView)findViewById(R.id.textView6);
		n10 = (EditText)findViewById(R.id.editText13);
		n11 = (TextView)findViewById(R.id.textView5);
		n12 = (EditText)findViewById(R.id.editText14);
		n13 = (TextView)findViewById(R.id.textView4);
		n14 = (EditText)findViewById(R.id.editText15);
		n15 = (TextView)findViewById(R.id.textView3);
		n16 = (EditText)findViewById(R.id.editText16);
		res = (TextView)findViewById(R.id.textView1);
		res1 = (TextView)findViewById(R.id.textView17);
		res2 = (TextView)findViewById(R.id.textView16);
		res3 = (TextView)findViewById(R.id.textView15);
		res4 = (TextView)findViewById(R.id.textView13);
		res5 = (TextView)findViewById(R.id.textView12);
		res6 = (TextView)findViewById(R.id.textView14);
		res7 = (TextView)findViewById(R.id.textView11);
		Button Total = (Button) findViewById(R.id.button2);
		Button Clear = (Button) findViewById(R.id.button1);
		Total.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int sum=0;
				int a,b,c;
				//for 2000
				a=Integer.parseInt(n1.getText().toString());
				b=Integer.parseInt(n2.getText().toString());
				
				c=a*b;
			
				sum=sum+c;
				res.setText(""+c);
				//for 500
				
				a=Integer.parseInt(n3.getText().toString());
				
				b=Integer.parseInt(n4.getText().toString());
				
				c=a*b;
			
				sum=sum+c;
				Toast.makeText(getApplicationContext(),c,Toast.LENGTH_SHORT).show();  
				res1.setText(""+c);
				//for 200
				a=Integer.parseInt(n5.getText().toString());
				b=Integer.parseInt(n6.getText().toString());
				
				c=a*b;
			
				sum=sum+c;
				Toast.makeText(getApplicationContext(),c,Toast.LENGTH_SHORT).show();
				res2.setText(""+c);
			//for 100
				a=Integer.parseInt(n7.getText().toString());
				b=Integer.parseInt(n8.getText().toString());
				
				c=a*b;
			
				sum=sum+c;
				Toast.makeText(getApplicationContext(),c,Toast.LENGTH_SHORT).show();
				res3.setText(""+c);
			//for 50
				a=Integer.parseInt(n9.getText().toString());
				b=Integer.parseInt(n10.getText().toString());
				
				c=a*b;
			
				sum=sum+c;
				res4.setText(""+c);
			//for 20
				a=Integer.parseInt(n11.getText().toString());
				b=Integer.parseInt(n12.getText().toString());
				
				c=a*b;
			
				sum=sum+c;
				res5.setText(""+c);
			//for 10
				a=Integer.parseInt(n13.getText().toString());
				b=Integer.parseInt(n14.getText().toString());
				
				c=a*b;
			
				sum=sum+c;
				res6.setText(""+c);
			//for 5
				a=Integer.parseInt(n15.getText().toString());
				b=Integer.parseInt(n16.getText().toString());
				
				c=a*b;
			
				sum=sum+c;
				res7.setText(""+c);
			
			
				
				

			}
		});
		}
				// TODO Auto-generated method stub
				
	    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	
		getMenuInflater().inflate(R.menu.main, menu);
		return true;}
	 @Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
