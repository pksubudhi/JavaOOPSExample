/*
WhatsApp: +91-8895174939
Email: mailtopksubudhi@gmail.com
Web: www.pksubudhi.com
*/
public interface SeesPatients {
	static final int MAX_PATIENTS = 100;
	void addPatient(Patient p) throws PatientException;
	Patient [] getPatients();
	String getPatientsAsString();
	boolean isPatient(Patient p);
}
