package Collections;

import java.util.ArrayList;
import java.util.List;


public class ConvertArrayListtoArray {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		Object[] objects= list.toArray();
        for (Object obj : objects)
            System.out.print(obj + " ");
    }
	
	

	}


