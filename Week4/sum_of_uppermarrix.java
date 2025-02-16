
public class sum_of_uppermarrix {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},
				      {2,3,4},
				      {5,6,7}};
		int sum=0;
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					continue;
				}
				else		
				sum+=arr[i][j];
				
			}
		}
		System.out.println(sum);
		}

	}

