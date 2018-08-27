package InterviewPrograms;

public class SwapStringWithoutThirdvar {

	public static void main(String[] args) {
		String str = "hello";
		String str1 = "World";

		str = str + str1;// helloworld
		str1 = str.substring(0, (str.length() - str1.length()));
		str = str.substring(str1.length());

		System.out.println(str);
		System.out.println(str1);

	}

}
