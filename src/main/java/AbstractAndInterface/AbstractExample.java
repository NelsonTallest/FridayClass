package AbstractAndInterface;


abstract class AnimalAbstract{

    public  abstract void sound();

    public  void sleep(){
        System.out.println("The animal is sleeping");
    }
}

class DogAbstract extends AnimalAbstract{
    public void sound(){
        System.out.println("The Dog barks");
    }

}
public class AbstractExample {
    public static void main(String[] args) {
        AnimalAbstract myDog = new DogAbstract();
        myDog.sound();
        myDog.sleep();
    }
}
