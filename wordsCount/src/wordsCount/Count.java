package wordsCount;

import java.util.Arrays;

public class Count {

	public static void main(String[] args) {
		String str="Hello users please follow my channel";
		String str1[]=str.split(" ");
		long countOfWords=Arrays.stream(str1).count();
		System.out.println(countOfWords);
		

	}

}
