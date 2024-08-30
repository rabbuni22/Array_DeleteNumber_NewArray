import java.util.ArrayList;

public class Longest_Prefix {

	public static void main(String[] args) {
		String str="abcbbabca";
		findPrefix(str);

	}

	private static void findPrefix(String str) {
		int start=0;
		int end=0;
		int max_length=0;
		ArrayList<Character> list=new ArrayList<Character>();
		while(end<str.length()) {
			if(!list.contains(str.charAt(end))) {
				list.add(str.charAt(end));
				end++;
				max_length=Math.max(max_length, list.size());
			}
			else {
				list.remove(Character.valueOf(str.charAt(start)));
				start++;
			}
		}
		System.out.println(str.substring(start, end)+" Maximum length of the unique character in a String is :"+max_length);
		
		
		
	}

}
