
public class privatemember_methods{
	   private String title;
	   private String author;
	   private double price;
	   public String gettitle() {
		  return title;
	   }
	   public void settitle(String title) {
		   this.title=title;
	   }

	public String getauthor() {
		  return author;
	 }
	 public void setauthor(String author) {
		   this.author=author;
		   
	 }
	 public double getprice() {
		  return price;
	}
	public void setprice(double price) {
		   this.price=price;
		   
	}


	public class Library {

		public static void main(String[] args) {
			privatemember_methods pm = new privatemember_methods();
			pm.settitle("Harry Potter");
			pm.setauthor("J K Rowling");
			pm.setprice(1499.99);
			System.out.println(pm.gettitle());
			System.out.println(pm.getauthor());
			System.out.println(pm.getprice());
		}

	}
	}
