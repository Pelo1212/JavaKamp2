package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product();
		product.setName("laptop");   //takma isim nokta ile bilgilerini yazıyoruz.
		product.setId(1);
		product.setPrice(5000);
		product.setStockAmount(0);
		product.setDescription("asus laptop");
		product.setRenk("mavi");
		product.setKod("");
		
		
		
        // bu productı kim kullanıcak başka bir class kullanıcak productManager classı oluştur.sonra çağır buraya
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);  //main de metodumu çağırdım.ürünümü ekledim.
	}



	}


