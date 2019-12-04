package com.secici.menu;

import java.util.Scanner;

public class Input {

    public String cümleGir(Scanner scanner, String istenilenCümle) {
    	System.out.print(istenilenCümle + Desen.altSatir);
    	return scanner.nextLine();
    	
    }
    
    public  int sayiGir(Scanner scanner, String istekCumlesi) {
    	System.out.print(istekCumlesi + Desen.altSatir);
    	return scanner.nextInt();
    	
    }
}
