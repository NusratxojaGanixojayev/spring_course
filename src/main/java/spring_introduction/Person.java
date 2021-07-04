package spring_introduction;

public class Person {
    private Pet pet;
    private String Surname;
    private int age;


    public Person() {
        System.out.println("Person");

    }

    public void setPet(Pet pet) {
        System.out.println(" Class person set");
        this.pet = pet;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Qalisan");
        pet.say();
    }
}
