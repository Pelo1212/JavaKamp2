package methods;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj="Bugun hava çok güzel";
		String yeniMesaj=mesaj.substring(0,2);   // 0 ı say 2 yi sayma.substring bir değer return ediyor.değişkenin tipineyse ona atayacağın değerin tipi de aynı olmalı.burda stringe stirng olan bi şey atadık
		String yeniMesaj2=sehirVer();            //string tipinde değişkenime string döndüren bi operasyon atadım no hata :)
		int sayi =topla(5,7);
		int toplam=topla2(2,3,1,6,5,4,9,8,7,12,56);
		System.out.println(yeniMesaj);
		System.out.println(yeniMesaj2);
		System.out.println(sayi);
		System.out.println(toplam);
	}
	public static void ekle() {
		System.out.println("eklendi");
		
	}
    public static void sil() {
    	System.out.println("silindi");
    	
    }
    public static void güncelle() {
    	System.out.println("güncellendi");
    	
    }
    public static int topla(int sayi1,int sayi2) {  // fonksiyonun int tipinde bir şey döndürücek demek.
    	return sayi1+sayi2;
    }
    public static int topla2 (int... sayilar) {   //variable argument yapısı bu aslında arkada bi dizi dönüyor.
    	                                           // çok tercih etme! ne gönderileceği belli olmadığı için bu tür yapıların test edilebilirliği zayıflıyor
    	int toplam=0;
    	  for(int sayi:sayilar) {
    		  toplam+=sayi;
    	  }
    	  return toplam;
    	
    }
    public static String sehirVer() {
    	return "Ankara";
    }
}
