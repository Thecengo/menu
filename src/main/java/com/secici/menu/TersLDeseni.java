package com.secici.menu;

public class TersLDeseni {

    public  void tersLBas(int uzunluk) {
    	
    	
    	for(int i = 0; i < uzunluk ; i++ ) {
    		System.out.print("*" + Desen.tab);
    	}
    	
    	System.out.print(Desen.altSatir + Desen.altSatir);
    	for(int i = 1; i < uzunluk ; i++ ) {
    		System.out.println("*" + Desen.altSatir);
    	}
    	
    }
}
