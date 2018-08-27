package InterviewPrograms;

import java.util.Arrays;

public class sortSTring {

	public static void main(String[] args) {
		// : Sort a string which has only 0, 1, 2 in it. Sample input:
		// 010201010100222112 | Sample output: 000000011111122222
		
		String str="010201010100222112";
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		}

	}


