
public class Palindrum {

	public static void main(String[] args) {
		int arr[]= {2,1,3,1,3,1,2};
		boolean isPalindrum=true;
		int i=0,j=arr.length-1;
	
			
				while(i<j) {
					if(arr[i]!=arr[j]) {
						isPalindrum=false;
						break;
				         
					} 
					i++;
					j--;
					
				}
				if(isPalindrum) {
					System.out.println("Given Array is Palindrum");
				}else {
					System.out.println("Given Array is Not Palindrum");
				}
	         
			
	
			}
			
		
			
		}
		

	


