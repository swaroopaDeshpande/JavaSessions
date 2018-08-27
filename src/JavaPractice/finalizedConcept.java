package JavaPractice;

public class finalizedConcept {
	//finalized is method
	
	public void finalize()
	{
		System.out.println("finalized method");
	}

	static public  void main(String[] args) {
		
		
		finalizedConcept obj=new finalizedConcept();
		obj=null;
		System.gc();

	}
	
	

}
