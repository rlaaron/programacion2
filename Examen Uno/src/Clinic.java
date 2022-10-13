import java.util.Scanner;
public class Clinic {
    private Patient[] patients;
    private Metric[] metrics;
    private int patientCount, metricCount;

    public Clinic() {
        patients = new Patient[100];
        metrics = new Metric[100];
        metricCount = 0;
        patientCount = 0;
    }
    public String addPatient(Patient patient){
        if (isPatient(patient.getId())) {
            return "Patient already exists";
        } else {
            patients[patientCount] = patient;
            patientCount++;
            return "Patient added";
        }
    }
    public void addMetric(Metric metric){
        metrics[metricCount] = metric;
        metricCount++;
    }
    public void printPatients(){
        for (int i = 0; i < patientCount; i++) {
            System.out.println(patients[i]);
        }
    }
    public void printMetrics(){
        for (int i = 0; i < metricCount; i++) {
            System.out.println(metrics[i]);
        }
    }
    public void printPatientMetrics(int id){
        for (int i = 0; i < metricCount; i++) {
            if(metrics[i].getPatientId() == id){
                System.out.println(metrics[i]);
            }
        }
    }

    public void printInfoPatient(int id){
        for (int i = 0; i < patientCount; i++) {
            if(patients[i].getId() == id){
                System.out.println(patients[i]);
            }
        }
    }
    
    public boolean isPatient(int id){
        for (int i = 0; i < patientCount; i++) {
            if(patients[i].getId() == id){
                return true;
            }
        }
        return false;
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        Clinic clinic = new Clinic();
        int opt = 0;
        boolean n = false;
        do {
            // sc.nextLine();
            System.out.println("1.- add patient");
            System.out.println("2.- search patient");
            System.out.println("3.- show patient");
            System.out.println("4.- exit");
            opt = sc.nextInt();
            switch (opt){
                case 1: 
                    sc.nextLine();
                    System.out.println("Enter id");
                    int id = sc.nextInt();
                    System.out.println("Enter age");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter name");
                    String name = sc.nextLine();
                    System.out.println("Enter gender");
                    String gender = sc.nextLine();
                    Patient patient = new Patient(id, age, name, gender);
                    System.out.println(clinic.addPatient(patient));
                    sc.nextLine();
                case 2:
                    System.out.println("Enter id to search");
                    int id2 = sc.nextInt();
                    int opt2 = 0;
                    boolean n2 = false;
                    if(clinic.isPatient(id2)){
                        do {
                            sc.nextLine();
                            System.out.println("Patient found");
                            System.out.println("1.- show patient");
                            System.out.println("2.- add visit");
                            System.out.println("3.- show history");
                            System.out.println("4.- exit");
                            opt2 = sc.nextInt();
                            switch (opt2){
                                case 1:
                                    clinic.printInfoPatient(id2);
                                    break;
                                case 2:
                                    System.out.println("\nEnter date");
                                    System.out.println("Enter day");
                                    int day = sc.nextInt();
                                    System.out.println("Enter month");
                                    int month = sc.nextInt();
                                    System.out.println("Enter year");
                                    int year = sc.nextInt();
                                    Date date = new Date(day, month, year);
                                    System.out.println("Enter weight");
                                    double weight = sc.nextDouble();
                                    System.out.println("Enter height");
                                    double height = sc.nextDouble();
                                    Metric metric = new Metric(date, weight, height, id2);
                                    clinic.addMetric(metric);
                                    break;
                                case 3:
                                    clinic.printPatientMetrics(id2);
                                    break;
                                case 4:
                                    n2 = true;
                                    break;
                                default:
                                    System.out.println("Invalid option");
                                    break;
                            }
                        } while (!n2);
                    } else {
                        System.out.println("Patient not found");
                    }
                    break;
                case 3:
                    clinic.printPatients();
                    break;
                case 4:
                    n = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while(!n);
        sc.close();
        
    }
}
