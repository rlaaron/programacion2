public class Metric {
    private Date date;
    private double weight, height;
    private int patientId;
    private String bmi;

    public Metric(Date date, double weight, double height, int patientId) {
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.patientId = patientId;
        this.bmi = bmi();
    }
    //setters and getters
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String bmi(){
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else if(bmi<40){
            return "Obesity";
        } else {
            return "Morbid obesity";
        }
    }

    // @Override

    public String toString() {
        return "\tMetrics: " + date + ", height=" + height + ", weight=" + weight + ", bmi = " + bmi;
    }
}
