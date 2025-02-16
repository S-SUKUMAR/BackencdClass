
public class Index_of_Element {

		public static void main(String args[]) {
			int a[]= {1,2,3,3,10,4};
			int flag=0;
			System.out.println("Enter the Key value:");
			int key=3;
			for(int i=0;i<a.length;i++) {
				if(a[i]==key) {
					System.out.println(key +" Found at "+ i);
					flag=1;
				}
			}
			if(flag==0)
				System.out.println("Element Not Found :"+key);
		}

	}

