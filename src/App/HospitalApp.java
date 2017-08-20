package App;

import java.util.Scanner;
import Utils.Hospital;

public class HospitalApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option;
		boolean end = false;
		

		do {
			System.out.println("Witamy w Planerze pracjentów, proszę wybrać opcję: ");
			System.out.println("0 - Wyjście z programu");
			System.out.println("1 - Dopisanie pacjenta");
			System.out.println("2 - Wyświetl listę pacjentów");
			option = scan.nextInt();

			if (option == 0) {
				Hospital.closeApp();
			} else if (option == 1) {
				Hospital.addToLine();
			} else if (option == 2) {
				Hospital.readPatients();
			} else {
				Hospital.errorMsg();
			};
		} while (end == false);
		scan.close();

	}



}
