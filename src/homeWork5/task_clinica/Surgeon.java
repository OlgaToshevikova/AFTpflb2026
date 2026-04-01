package homeWork5.task_clinica;

public class Surgeon extends Doctor {


    public Surgeon(String type) {
        super(type);
    }
    @Override
    public void heal(Patient patient) {
        System.out.println("Отрезает все лишнее");
        patient.state = "Здоров";
        System.out.println("Состояние пациента после лечения " + patient.state);
    }
}
