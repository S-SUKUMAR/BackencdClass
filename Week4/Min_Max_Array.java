
public class Min_Max_Array {
    public static void min(int arr[]) {
    	int min=arr[0];
    	for(int i=0;i<arr.length;i++)
    		if(min>arr[i])
    			min=arr[i];
    	System.out.println(min);		
   }
    public static void max(int arr[]) {
    	int max=arr[0];
    	for(int i=0;i<arr.length;i++)
    		if(max<arr[i])
    			max=arr[i];
    	System.out.println(max);		
    }
	public static void main(String[] args) {
	int a[]= {2,5,6,8,9,15,3};
	min(a);
	max(a);
	}
}
