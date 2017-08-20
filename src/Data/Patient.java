package Data;

public class Patient {
	
	/*Pola */
	private static String patientName;
	private static String patientSurname;
	private static String PESEL;
	
	/*Getters n Setters*/
	public static String getName(){
		return patientName;
	};
	
	public void setName(String patientName){
		Patient.patientName = patientName;
	}
	
	public static String getSurname(){
		return patientSurname;
	}
	
	public void setSurname(String patientSurname){
		Patient.patientSurname = patientSurname;
	}
	public static String getPESEL(){
		return PESEL;
	}
	public void setPESEL(String PESEL){
		Patient.PESEL = PESEL;
	}
	
	/* Konstruktor */
	public Patient(String patientName, String patientSurname, String PESEL) {
        this.setName(patientName);
        this.setSurname(patientSurname);
        this.setPESEL(PESEL);
    }
	
	
}
