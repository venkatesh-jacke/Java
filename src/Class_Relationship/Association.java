package Class_Relationship;

public class Association {
    public static void main(String[] args) {
        Patient p1 = new Patient("joel");
        Patient p2 = new Patient("James");
        Patient p3 = new Patient("jade");
        Patient[] patients = new Patient[3];
        patients[0] = p1;
        patients[1] = p2;
        patients[0] = p3;
        Doctor doctor = new Doctor("Paul", patients);


    }

    static class Doctor {
        String name;
        Patient[] patients;

        Doctor(String name, Patient[] patients) {
            this.name = name;
            this.patients = patients;
        }


    }

    static class Patient {
        String name;

        Patient(String name) {
            this.name = name;
        }
    }
}

/*
Doctor has many Patients no need to depend on a single patient
SameWay a patient can visit any no of doctors for consulting

RelationShip between doctor and patient is weak.

Its has independant life cycle of an object

Doctor ------- patient

*/
