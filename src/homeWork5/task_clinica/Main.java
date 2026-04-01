package homeWork5.task_clinica;

public class Main {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("surgeon");
        Therapist therapist = new Therapist("therapist");
        Dentist dentist = new Dentist("dentist");
        Patient patient = new Patient("Иван", 2, "surgeon", "Болен");
        therapist.appointDoctor(patient);
        dentist.heal(patient);
        surgeon.heal(patient);
    }
}
