public class Patient {
    private int id,age;
    private String name, gender;


    public Patient (int id, int age, String name, String gender){
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }


    public String toString(){
        return "name: "+ name + " age: " + age + " gender: " + gender + " id: " + id;    
    }

}
