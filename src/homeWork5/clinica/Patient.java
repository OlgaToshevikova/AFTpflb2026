package homeWork5.clinica;

public class Patient {
    String name;
    int curePlan;
    Doctor doctor;
    String state;
    public Patient(String name, int curePlan, Doctor doctor, String state) {
        this.name = name;
        this.curePlan = curePlan;
        this.doctor = doctor;
        this.state = state;
    }
    public void setCurePlan(int curePlan) {
        this.curePlan = curePlan;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Doctor getDoctor() {
        return doctor;
    }
}
