
import java.util.Scanner;

public class CalculatorInConsole {
	
	public static void main(String[] args) {
		boolean bool = true;
		while (bool == true) {
			Scanner scanner = new Scanner(System.in);
			String enter = scanner.nextLine();
			int result = 0;
			String[] massiv;
			enter = enter.replace(" ", "");
			if(enter.equals("exit")) {
				bool = false;
			}
			
			if (enter.contains("+")) {
				massiv = enter.split("\\+");
				result =  Integer.parseInt(massiv[0]) +  Integer.parseInt(massiv[1]);
				System.out.println(result);
			}
			else if (enter.contains("*")) {
				massiv = enter.split("\\*");
				result =  Integer.parseInt(massiv[0]) *  Integer.parseInt(massiv[1]);
				System.out.println(result);
			}
			else if (enter.contains("-")) {
				massiv = enter.split("-");
				result =  Integer.parseInt(massiv[0]) -  Integer.parseInt(massiv[1]);
				System.out.println(result);
			}
			else if (enter.contains("/")) {
				massiv = enter.split("/");
				result =  Integer.parseInt(massiv[0]) /  Integer.parseInt(massiv[1]);
				System.out.println(result);
			}
		}
		
		
	}

}
