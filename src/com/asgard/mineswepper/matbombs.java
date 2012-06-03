package com.asgard.mineswepper;

import java.util.Random;

public class matbombs {
	private int[][] mat;
    private int x,y;
	matbombs(int num, int dimx, int dimy) {
		mat = new int[dimx][dimy];
		x=dimx;
		y=dimy;
		Random rand = new Random(); 
		for(int i=0;i<num;i++) {
		    mat[rand.nextInt(dimx)][rand.nextInt(dimy)]=1;
		}
	}

	public static boolean check(Tile name) {
	    if(mat[name.px][name.py]==1) {
		return true;
	    }
	    else {
		return false;
	    }
	}

	public int bombsAside(Tile name) {
	    int count = 0;
	    for(int i=name.px-1; i<=name.px+1;i++) {
		for(int j=name.py-1;j<=name.py;j++) {
		    if(i>0 && j>0 && i<x && j<y) {
			if(mat[i][j]==1)
			    count++;
		    }
		}
	    }	
	    return count;
	}
}
