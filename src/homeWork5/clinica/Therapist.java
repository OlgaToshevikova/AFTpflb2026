package homeWork5.clinica;

public class Therapist extends Doctor {

    @Override
    public void heal(Patient patient) {
        System.out.println("Лечит все");
    }

    public void appointDoctor(Patient patient) {
        int curePlan = patient.curePlan;
        if (curePlan == 1) {
            patient.setDoctor(new Surgeon());
            patient.getDoctor().heal(patient);
        } else if (curePlan == 2) {
            patient.setDoctor(new Dentist());
            patient.getDoctor().heal(patient);
        } else {
            patient.setDoctor(new Therapist());
            patient.getDoctor().heal(patient);
            patient.state = "Здоров";
            System.out.println("Состояние пациента после лечения " + patient.state);
        }
        System.out.println("Пациенту назначен врач " + patient.getDoctor());
    }

    @Override
    public String toString() {
        return "Терапевт";
    }
}
