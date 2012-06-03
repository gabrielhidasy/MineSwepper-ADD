package com.minas_explosivas;

import android.widget.ImageButton;

public class Tile {
	private ImageButton button;
	private boolean minePresent;
	public int px,py;
	
	public boolean isParachutePresent() {
		return parachutePresent;
	}

	public void setParachutePresent(boolean parachutePresent) {
		this.parachutePresent = parachutePresent;
	}

	public Tile(ImageButton button) {
		this.button=button;
		this.minePresent=false;
	}
	
	public ImageButton getButton() {
		return button;
	}
	public void setButton(ImageButton button) {
		this.button = button;
	}
	public boolean isMinePresent() {
		return minePresent;
	}
	public void setMinePresent(boolean minePresent) {
		this.minePresent = minePresent;
	}

	

}
