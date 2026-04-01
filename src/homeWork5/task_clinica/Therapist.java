package homeWork5.task_clinica;

public class Therapist extends Doctor {

    public Therapist(String type) {
        super(type);
    }
    public void heal() {
        System.out.println("Лечит все");
    }
    public void appointDoctor(Patient patient) {
        int curePlan = patient.curePlan;
        if (curePlan == 1) {
            patient.setDoctor("хирург");
        } else if (curePlan == 2) {
            patient.setDoctor("дантист");
        } else {
            patient.setDoctor("терапевт");
            heal();
            patient.state = "Здоров";
            System.out.println("Состояние пациента после лечения " + patient.state);
        }
        System.out.println("Пациенту назначен врач " + patient.doctor);
    }
}
