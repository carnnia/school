
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!?!");
		System.out.println("number of args " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);  
		}//for END
		
		
		double yenTransactionAmmount = 999.123456789;
	/*	System.out.printf("%.2f", yenTransactionAmmount);*/
	}//main END
}//class END
