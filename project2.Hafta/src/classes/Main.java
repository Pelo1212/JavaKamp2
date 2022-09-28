package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

	}

/* CustomerManager customerManager=new CustomerManager();
   CustomerManager customerManager2=new CustomerManager();
   customerManager=customerManager2;   ->referans noları eşitledim.1. mi new'lememe gerek kalmadı. "CustomerManager customerManager;" 'da olur artık.
                                       ->ikisi de heap te aynı yere gidecek.
                                       ->heap'te customerManager için ayrılan kısım garbage C.sayesinde bellekten sililnecek.
                                       
   .değer tiplerreferans tipler gibi çalışmaz sadece stack var onlarda.
   .String değer tip gibi çalışan referans tiptir.
 */
	}


