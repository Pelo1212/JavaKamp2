package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI =new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());// KrediUI classında parametre olarak ogretmeni verdiğimiz için mainde de metodu çağırken bu şekilde parametresini yazmalıyız.
	}

}
