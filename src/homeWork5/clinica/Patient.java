package homeWork5.clinica;

public class Patient {
    String name;
    int curePlan;
    String doctor;
    String state;

    public Patient(String name, int curePlan, String doctor, String state) {
        this.name = name;
        this.curePlan = curePlan;
        this.doctor = doctor;
        this.state = state;
    }

    public void setCurePlan(Patient patient,int curePlan) {
        this.curePlan = curePlan;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
