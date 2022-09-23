public class Patient {
    private int id,age,metricsCount;
    private String name, gender;
    private Metric[] metrics;

    public Patient (int id, int age, int metricsCount, String name, String gender){
        this.id = id;
        this.age = age;
        this.metricsCount = metricsCount;
        this.name = name;
        this.gender = gender;
        metrics = new Metric[100];
        metricsCount = 0;
    }

    //setters and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMetricsCount() {
        return metricsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
