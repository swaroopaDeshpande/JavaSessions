package InterviewPrograms;

public class JunksplCharacteristicsRemove {

	public static void main(String[] args) {
		// [A-Za-z0-9]
		String str = "%^%$^$$Hello&%$%^^";
		str = str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str);
	}

}
