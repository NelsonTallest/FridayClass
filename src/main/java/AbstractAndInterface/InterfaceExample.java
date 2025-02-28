package AbstractAndInterface;



interface  Animal {
    void sound();

    default void sleep(){
        System.out.println("The animal is sleeping");
    }
}

class Dog implements Animal, AnimalTwo {
    public void sound(){
        System.out.println("The Dog barks");
    }
    public  void jump(){
        System.out.println("The Dog jumps");
    }
}

interface AnimalTwo {
    void jump();
}
public class InterfaceExample {

    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
        myDog.sleep();

        AnimalTwo myDogTwo = new Dog();
        myDogTwo.jump();
    }
}
