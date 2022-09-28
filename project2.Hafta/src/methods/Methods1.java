package methods;

public class Methods1 {

	public static void main(String[] args) {
		sayiBulmaca();           //methodu main de direk ismi ile çağırıyoruz.

	}
	public static void sayiBulmaca() {
		int[]sayılar=new int[] {1,2,5,7,9,0,3};
		int aranacak=5;
		boolean varMı=false;
		
		   for(int sayi:sayılar) {
			   if(sayi==aranacak) {
				   varMı=true;
				   break;
			   }
		   }
		if(varMı) {
			mesajVer("sayı mevcuttur"+ aranacak);
		}
		else {
			mesajVer("sayı mevcut değildir."+aranacak);
		}
	}
   
	public static void mesajVer(String mesaj) {          //methoda değişkenimizi (farketmez) tipiyle beraber atadık=parametre
		System.out.println(mesaj);                       //parametre string tipinde bir mesaj içeriyor.bu methodu yukarda kullanıp parametre kısmına ifademizi yazdık.
	}
}
