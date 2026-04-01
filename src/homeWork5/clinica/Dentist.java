package homeWork5.clinica;

public class Dentist extends Doctor {
    public Dentist(String type) {
        super(type);
    }

    @Override
    public void heal(Patient patient) {
        System.out.println("Зубки вылечены");
        patient.state = "Теперь с зубками все в порядке";
        System.out.println("Состояние пациента после лечения " + patient.state);
    }
}
