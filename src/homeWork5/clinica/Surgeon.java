package homeWork5.clinica;

public class Surgeon extends Doctor {

    @Override
    public void heal(Patient patient) {
        System.out.println("Отрезает все лишнее");
        patient.state = "Здоров";
        System.out.println("Состояние пациента после лечения " + patient.state);
    }

    @Override
    public String toString() {
        return "Хирург";
    }
}
