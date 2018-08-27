package InterviewPrograms;

public class EliminateNum {

	public static void main(String[] args) {
		// Program: String s = "sub53od73th"; Eliminate the numbers alone. Print the Alphabets.
		String s="sub53od73th";
		//[^a-zA-Z]
		s=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
	}

}
