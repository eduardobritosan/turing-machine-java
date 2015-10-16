import java.util.Scanner;

/**
 * 
 */

/**
 * @author eebritos
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduzca la cadena de entrada");
		String input = keyboard.nextLine();
		System.out.println("Introduzca el nombre del fichero");
		String filename = keyboard.nextLine();
		System.out.println("Desea ver la cinta tras la ejecucion?(y/n)");
		boolean print = keyboard.nextBoolean();

		
		
		TuringMachine tm = new TuringMachine();
		@SuppressWarnings("unused")
		ParserTM parser = new ParserTM(filename, tm);
		tm.run(input,print);
		keyboard.close();
	}

}
