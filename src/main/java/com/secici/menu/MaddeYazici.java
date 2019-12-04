package com.secici.menu;

import java.util.Scanner;

public class MaddeYazici {
	
	Dogrulayici dogrulayici = new Dogrulayici();

	public void besinciMaddeyiYaz(Input inputs, Scanner scanner) {
		System.out.println(StringYazici.besinciMaddeYazisi + Desen.tab);
        int girilenCiftSayi = inputs.sayiGir(scanner, StringYazici.ciftSayiyiGirYazisi);
        App.tekVeyaCiftSayiyaKadarOlanSayilariGoster(girilenCiftSayi);
        System.out.println(StringYazici.düzCizgi);
	}



	public void dorduncuMaddeyiYaz(Input inputs, Scanner scanner) {
		System.out.println(StringYazici.dorduncuMaddeYazisi + Desen.tab);
    	int girilenTekSayi = inputs.sayiGir(scanner, StringYazici.tekSayiyiGirYazisi);
    	
//    	boolean sayiTekMi = sayiTekMi(girilenTekSayi);
//    	
//    	while(!sayiTekMi) {
//    	  girilenTekSayi = inputs.sayiGir(scanner, tekSayiyiGirYazisi);
//    	}
        App.tekVeyaCiftSayiyaKadarOlanSayilariGoster(girilenTekSayi);
        System.out.println(StringYazici.düzCizgi);
	}



	public void ucuncuMaddeyiYaz(Input inputs, Scanner scanner, String girilenCumle) {
		System.out.println(StringYazici.ucuncuMaddeYazisi + Desen.tab);
		System.out.print(Desen.altSatir);
		
		int ilkAralik = inputs.sayiGir(scanner,StringYazici. ilkSayiyiGirYazisi);
    	int sonAralik = inputs.sayiGir(scanner, StringYazici.sonSayiyiGirYazisi);
    	
    	boolean ilkSayiIkinciSayidanKucukMu = dogrulayici.ilkSayiIkinciSayidanKucukMu(ilkAralik, sonAralik);
		
		while(!ilkSayiIkinciSayidanKucukMu) {
			System.out.println(StringYazici.aralikHatasiMesaji);
			ilkAralik = inputs.sayiGir(scanner, StringYazici.ilkSayiyiGirYazisi);
			sonAralik = inputs.sayiGir(scanner, StringYazici.sonSayiyiGirYazisi);
			ilkSayiIkinciSayidanKucukMu =  dogrulayici.ilkSayiIkinciSayidanKucukMu(ilkAralik, sonAralik);
		
		}
		
		App.gireceğinizAralıktakiHarfleriGoster(girilenCumle, ilkAralik, sonAralik);
		
		System.out.println(StringYazici.düzCizgi);
	}



	public  void ikinciMaddeyiYaz(Input inputs, TersLDeseni tersLDeseni, Scanner scanner) {
		System.out.println(StringYazici.ikinciMaddeYazisi + Desen.tab);
        int yildizSayisi = inputs.sayiGir(scanner, StringYazici.lDekiYildizSayisiniGirYazisi);
        tersLDeseni.tersLBas(yildizSayisi);
        System.out.println(StringYazici.düzCizgi);
	}



	public  void birinciMaddeYazici(Input inputs, Scanner scanner, String girilenCumle) {
        
    	StringBuilder stringBuilder = new StringBuilder(girilenCumle);
        String girilenCümleninTersi = stringBuilder.reverse().toString();
        
        System.out.println(Desen.altSatir + StringYazici.ilkMaddeYazisi +Desen.tab + Desen.tab + Desen.tab + Desen.tab);
        System.out.println(Desen.altSatir +girilenCumle);
        System.out.println(Desen.altSatir +StringYazici. girilenCümleninTersiYazisi + Desen.tab + girilenCümleninTersi  );
        System.out.println(StringYazici.düzCizgi);
        
		
	}
    

}
