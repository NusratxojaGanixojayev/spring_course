package spring_introduction;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Person");

    }

    public void setPet(Pet pet) {
        System.out.println(" Class person set");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Qalisan");
        pet.say();
    }
}
