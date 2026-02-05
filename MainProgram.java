import com.codegnan.javaapp05022026.mathematics.Division;

public class MainProgram {
	public static void main(String[] args) {
		System.out.println("main started.");

		Division division = new Division();
		division.divide(new int[] {10,2,20,5});
		//division.divide(new int[] {10,0,20,5});
		//division.divide(new int[] {10,2,20,0});
		//division.divide(new int[] {10});
		
		System.out.println("main ended.");

	}
}