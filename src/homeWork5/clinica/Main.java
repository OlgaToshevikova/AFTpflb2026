package homeWork5.clinica;

public class Main {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        Therapist therapist = new Therapist();
        Dentist dentist = new Dentist();
        Patient patient = new Patient("Иван", 4, surgeon, "Болен");
        therapist.appointDoctor(patient);
    }
}
