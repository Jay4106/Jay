package forloop;

public class Forloop1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//list of even numbers
		   //define limit
        int i = 50;
       
        System.out.println("Printing Even numbers between 1 and " + i);
       
        for(int j=1; j <= i; j++){
               
                // if the number is divisible by 2 then it is even
                if( j % 2 == 0)
                {
                        System.out.print(j + " ");
                }
}
	}
}