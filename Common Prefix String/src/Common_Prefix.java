import java.util.Arrays;

public class Common_Prefix {

	public static void main(String[] args) {
		String str[]= {"rabbuni","rabb","rab"};
	String ss=	commonPrefix(str);
	System.out.println(ss);

		
	}

	private static String commonPrefix(String[] str) {
		Arrays.sort(str);
	String str1=str[0];
	String str2=str[str.length-1];		
	int index=0;
	while(index<str.length-1) {
		if(str1.charAt(index)==str2.charAt(index)) {
			index++;
		}else {
			break;
		}
		}
	return index==0?"":str1.substring(0,index);
	}

	

	

}
