
public class Runner {

	public static void main(String[] args) {
   
	/*
    String colour = "Teal";
    String result = null;
    
    switch(colour) {
    case "Blue":
    case "Teal":
    	System.out.println("Blue");
    	break;
    case "Green":
    case "Olive":
    	System.out.println("Green");
    	break;
    default:
    	System.out.println("No such colour");
    
    }
	System.out.println(result);
	*/
		
 /*   boolean EOF = false;
	
	do {
		// listening for input from a device
		// to see if we have an8
	} while (!EOF);
	System.out.println("After loop");	
	}
*/
		int count = 0;
		boolean forever = true;
		while(forever) {}
	
	
		for (;;) {
			System.out.println("count = " + count);
			if ( count >= 10) break;
			count++;
			
		}
		//System.out.println("count = " + count);
		for (int i = 0 , k = 0; (i < 10 && k < 10) ; i++, k++) {
            System.out.println("Count is: " + (i + 1));
        }
}
}


// & | ^