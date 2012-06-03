package com.minas_explosivas;

import android.widget.ImageButton;

public class Tile {
    private ImageButton button;
    private boolean minePresent;
    public int px,py;
	

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
    public void set_pos(int x, int y) {
	this.px=x;
	this.py=y;
    }
    public int get_posx() {
	return px;
    }
    public void get_posy() {
	return py;
    }
	

}
