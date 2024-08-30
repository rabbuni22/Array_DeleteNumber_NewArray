import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		System.out.print("Please Enter the Number you want to delete in the Array: ");
		Scanner sc=new Scanner(System.in);
		int deNumber=sc.nextInt();
		int arr[]= {20,10,30,40,50,10};
		int count=delete(arr,deNumber);
		System.out.println(count);
		int arr1[]=newArray(arr,deNumber,count);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		}
	public static int delete(int arr[],int deNumber) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==deNumber) {
				count++;
				
				
			}
		}
		return count;
		
		
		
	}
	public static   int[] newArray(int arr[],int deNumber,int count) {
		int arr1[]=new int[arr.length-count];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=deNumber) {
				arr1[j]=arr[i];
				j++;
			}
		}
		return arr1;
		
	}

}
