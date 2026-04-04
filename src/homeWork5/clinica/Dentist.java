package homeWork5.clinica;

public class Dentist extends Doctor {

    @Override
    public void heal(Patient patient) {
        System.out.println("Зубки вылечены");
        patient.state = "Теперь с зубками все в порядке";
        System.out.println("Состояние пациента после лечения " + patient.state);
    }

    @Override
    public String toString() {
        return "Дантист";
    }
}
