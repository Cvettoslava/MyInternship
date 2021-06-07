package Exc5;

public class Person implements java.io.Serializable{
    String name, egn;
    int age;

    public Person (String nameP, int ageP, String egnP){
        this.name = nameP;
        this.age = ageP;
        this.egn = egnP;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public void Talking (){
        System.out.println("I am able to talk..!");
    }
    @Override
    public String toString() {
        return new StringBuffer("Name: ").append(this.name)
                .append(", Age : ").append(this.age).append(", EGN : ").append(this.egn).toString();
    }
}
