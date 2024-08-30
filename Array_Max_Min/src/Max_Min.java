
public class Max_Min {

	public static void main(String[] args) {
		int arr[]= {12,23,32,34,43,21,8,11,3,99};
	    int highest=max(arr);
		int lowest=min(arr);
		System.out.println(highest);
		System.out.println(lowest);

	}
  public static int max(int arr[]) {
	  int max=arr[0];
	  for(int i=1;i<arr.length;i++) {
		  if(arr[i]>max) {
			  max=arr[i];
		  }
	  }
	  return max;
  }
  public static int min(int arr[]) {
	  int min=arr[0];
	  for(int i=1;i<arr.length;i++) {
		  if(arr[i]<min) {
			  min=arr[i];
		  }
	  }
	  return min;
  }
}
