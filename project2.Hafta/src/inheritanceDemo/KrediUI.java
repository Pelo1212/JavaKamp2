package inheritanceDemo;

public class KrediUI {
	
	/*public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager) { //bir classın içindeki metodda parametre olarak başka bir classı çağırıyorum.
		                                                                  // ve onun özelliklerini bu classımın altında çağırabiliyorum
		ogretmenKrediManager.hesapla();
		
	}*/
	
	public void KrediHesapla(BaseKrediManager baseKrediManager) {    // yukardaki gibi tek tek yapmak yerine parametreye anneyi verip mainde çocuklarından istediğimiz alabilriz. :)
		baseKrediManager.hesapla();                                  // bunu referans tip olması sağlıyor base hem öğretmenin hem tarımın hem askerin referansını tutabiliyor çünkü.
		
	}
	

}
