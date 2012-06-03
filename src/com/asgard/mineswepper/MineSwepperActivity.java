package com.asgard.mineswepper;
	
	
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;
	
public class MineSwepperActivity extends Activity {
    Map<String, Tile> board = new HashMap<String, Tile>();
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
	initButton("A1",R.id.A1);
	initButton("A2",R.id.A2);
	initButton("A3",R.id.A3);
	initButton("A4",R.id.A4);
	initButton("B1",R.id.B1);
	initButton("B2",R.id.B2);
	initButton("B3",R.id.B3);
	initButton("B4",R.id.B4);
	initButton("C1",R.id.C1);
	initButton("C2",R.id.C2);
	initButton("C3",R.id.C3);
	initButton("C4",R.id.C4);
	initButton("D1",R.id.D1);
	initButton("D2",R.id.D2);
	initButton("D3",R.id.D3);
	initButton("D4",R.id.D4);
	initButton("E1",R.id.E1);
	initButton("E2",R.id.E2);
	initButton("E3",R.id.E3);
	initButton("E4",R.id.E4);
	initButton("F1",R.id.F1);
	initButton("F2",R.id.F2);
	initButton("F3",R.id.F3);
	initButton("F4",R.id.F4);
    }
	
	
    private void initButton(final String name,int id) {
	ImageButton imgbut = (ImageButton) findViewById(id); // Use this method carefully, it consumes lots of system resources
	final Tile tile = new Tile(imgbut);
	board.put(name, tile);
	final ImageView A1 = (ImageView)findViewById(id);
	A1.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
		    if(matbombs.check(board.get(name))) {
			A1.setImageResource(R.drawable.mine_blow);
			showMessage("You Lose");
		    }
						
		    else {
			numbombs(A1,Tile name);
		    }
		}
	    });
    }
	    
	
    private void numbombs(ImageView Imgb, Tile name) {
	switch (Imgb.bombsAside(name);) {
	case 1:
	    Imgb.setImageResource(R.drawable.1);
	    break;
	case 2:
	    Imgb.setImageResource(R.drawable.2);
	    break;
	case 3:
	    Imgb.setImageResource(R.drawable.3);
	    break;
	case 4:
	    Imgb.setImageResource(R.drawable.4);
	    break;
	case 5:
	    Imgb.setImageResource(R.drawable.5);
	    break;
	case 6:
	    Imgb.setImageResource(R.drawable.6);
	    break;
	case 7:
	    Imgb.setImageResource(R.drawable.7);
	    break;
	case 8:
	    Imgb.setImageResource(R.drawable.8);
	    break;
	case 0:
	    Imgb.setImageResource(R.drawable.square);
	    break;
	}
		
    }
    public void showMessage(String s) {
	Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
