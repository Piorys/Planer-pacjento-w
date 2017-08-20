package Utils;

import java.util.Scanner;
import Data.Patient;
public class Hospital {
	

	static Scanner scan = new Scanner(System.in);
	static boolean end = false;
	static boolean repeat = false;
	static Patient[] line = new Patient[10];
	
	public static Patient addPatient(){
		System.out.println("Zamierzasz dopisać pacjenta do listy");
		System.out.println("");
			
			System.out.println("Podaj proszę imię pacjenta");
			String patientName = scan.nextLine();
			System.out.println("");
			System.out.println("Podaj proszę nazwisko pacjenta");
			String patientSurname = scan.nextLine();
			System.out.println("");
			System.out.println("Podaj proszę PESEL pacjenta");
			String PESEL = scan.nextLine();
			while (PESEL.length() != 11) {
				System.out.println("Podaj poprawny numer PESEL!");
				PESEL = scan.nextLine();
			} 
		return new Patient(patientName, patientSurname, PESEL);	
};

	public static  void addToLine(){
		for(int i=0; i<line.length ; i++ ){
			if(line[i] == null){
				line[i] = addPatient();
			}else if(line[i] != null){
				continue;
			} else {
				System.out.println("Przykro nam, kolejka jest pełna!");
			}
			break;
		}
};

	public static void readPatients(){
		for(int i=0; i<line.length; i++){
			int pozycja = i+1;
			if(line[i] != null){
				System.out.println("Pozycja " + pozycja + ": ");
				System.out.println("Imię: " + Patient.getName());
				System.out.println("Nazwisko: " + Patient.getSurname());
				System.out.println("PESEL: " + Patient.getPESEL());	
			}else{
				System.out.println("Wolne miejsce");
			}
		};
		
	};
	
	public static void closeApp(){
		System.out.println("Do widzenia!");
		end = true;
	}
	
	public static void errorMsg(){
		System.out.println("Błąd, wybierz poprawną opcję!");
	};
}


