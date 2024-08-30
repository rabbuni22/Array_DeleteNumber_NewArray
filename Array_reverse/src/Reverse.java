
public class Reverse {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55,6,7,8};
		int i=0;
		int j=arr.length-1;
	int reversedArr[]=reverse(arr,i,j);
	for(int k:reversedArr) {
		System.out.print(k+" ");
	}

	}

	public static int[] reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
		
	}

}
