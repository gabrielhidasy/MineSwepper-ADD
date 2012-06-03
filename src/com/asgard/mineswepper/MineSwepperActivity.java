	package com.asgard.mineswepper;
	
	
	import android.app.Activity;
	import android.os.Bundle;
	import android.view.View;
	import android.view.View.OnClickListener;
	import android.widget.ImageView;
	import android.widget.Toast;
	
	public class MineSwepperActivity extends Activity {
		matbombs M1;
	    /** Called when the activity is first created. */
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	        showMessage("Oh hi, my name is Boxxy!");
	        initButtons();
	        M1 = new matbombs(8,6,4);
	    }
	
	
	    private void initButtons() {
	    	 initButton(R.id.A1);
	         initButton(R.id.A2);
	         initButton(R.id.A3);
	         initButton(R.id.A4);
	         initButton(R.id.B1);
	         initButton(R.id.B2);
	         initButton(R.id.B3);
	         initButton(R.id.B4);
	         initButton(R.id.C1);
	         initButton(R.id.C2);
	         initButton(R.id.C3);
	         initButton(R.id.C4);
	         initButton(R.id.D1);
	         initButton(R.id.D2);
	         initButton(R.id.D3);
	         initButton(R.id.D4);
	         initButton(R.id.E1);
	         initButton(R.id.E2);
	         initButton(R.id.E3);
	         initButton(R.id.E4);
	         initButton(R.id.F1);
	         initButton(R.id.F2);
	         initButton(R.id.F3);
	         initButton(R.id.F4);
	    }
	
	
		private void initButton(int id) {
			final ImageView A1 = (ImageView)findViewById(id);
	        A1.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					if(matbombs.check("A","1")) {
						A1.setImageResource(R.drawable.mine_blow);
						showMessage("You Lose");
					}
						
					else {
						numbombs(A1,"A","1");
					}
				}
			});
		}
	    
	    
	    public void showMessage(String s) {
	    	Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
	    }
	
	private void numbombs(ImageView A1, String string, String string2) {
		int temp = M1.bombsAside("A","1");
		switch (temp) {
			case 1:
				A1.setImageResource(R.drawable.square);
				break;
			case 2:
				A1.setImageResource(R.drawable.square);
				break;
			case 3:
				A1.setImageResource(R.drawable.square);
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				A1.setImageResource(R.drawable.mine_not_blow);
				break;
			case 7:
				break;
			case 8:
				break;
			case 0:
				A1.setImageResource(R.drawable.square);
				break;
		}
		
	}
	}