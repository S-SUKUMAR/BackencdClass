
 class computer {
	   private String brand;
	   private String model;
	   private double price;
	   
	   public String getbrand() {
		  return brand;
	   }
	   public void setbrand(String brand) {
		   this.brand=brand;
	   }

	public String getmodel() {
		  return model;
	 }
	 public void setmodel(String model) {
		   this.model=model;
		   
	 }
	 public double getprice() {
		  return price;
	}
	public void setprice(double price) {
		   this.price=price;
		   
	}


	public class Main {

		public static void main(String[] args) {
			computer c = new computer();
			c.setbrand("Lenovo");
			c.setmodel("IdeaPad Slim 1");
			c.setprice(23990.00);
			System.out.println(c.getbrand());
			System.out.println(c.getmodel());
			System.out.println(c.getprice());
		}

	}
	}

