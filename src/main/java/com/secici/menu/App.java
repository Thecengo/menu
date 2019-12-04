package com.secici.menu;

import java.util.Scanner;


public class App 
{
	
	static Scanner scanner = new Scanner(System.in);
	
    public static void main( String[] args )
    {
    	Input inputs = new Input();
    	
    	TersLDeseni tersLDeseni = new TersLDeseni();
    	
    	MaddeYazici maddeYazici = new MaddeYazici();

    
    	
    	String girilenCumle  =  inputs.cümleGir(scanner,StringYazici.cumleGirinizYazisi);
    	
//    	String devamKarakteri = inputs.cümleGir(scanner,StringYazici.devamEtmekIstermisinizYazisi);
        
    	System.out.println(StringYazici.düzCizgi);
    	
  
        //1. madde kutusu

    	maddeYazici.birinciMaddeYazici(inputs, scanner, girilenCumle);
            
        //2. madde kutusu
    	maddeYazici.ikinciMaddeyiYaz(inputs, tersLDeseni, scanner);
        
        //3. madde kutusu
    	maddeYazici.ucuncuMaddeyiYaz(inputs, scanner, girilenCumle);
        
        //4. madde kutusu
    	maddeYazici.dorduncuMaddeyiYaz(inputs, scanner);
        
        
        //5. madde kutusu
    	maddeYazici. besinciMaddeyiYaz(inputs, scanner);
        
  
    }




    
    public static void gireceğinizAralıktakiHarfleriGoster(String cumle, int ilkAralık, int sonAralık) {
    	String araliktakiHarfler = cumle.substring(ilkAralık, sonAralık);
    	
    	System.out.println(araliktakiHarfler);
    	
    }
    
    public static void tekVeyaCiftSayiyaKadarOlanSayilariGoster(int sayi) {
    	
    	
    	for (int i = 0; i < sayi ; i++) {
    		if( i % 2 == 0 && sayi % 2 == 0) {
    			System.out.print((i +1) + Desen.tab);
    			continue;
    		}
    		else if(i % 2 == 0) {
    				System.out.print(i  + Desen.tab);
    				continue;
    		}
    	
    	}
    	
    	System.out.println();
    	
    }
    

    

    
 
}
