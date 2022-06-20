package apnacollegeconcepts.homeworkquestions.questionset1;

public class BMW extends Car{

    @Override
    public void start(){
        System.out.println("BMW Start");
    }

    @Override
    public void stop(){
        System.out.println("BMW Stop");
    }

    public void speed(){
        System.out.println("BMW Speed");
    }

    public static void main(String[] args) {
        BMW b1 = (BMW) new Car(); //Not allowed.
        b1.speed();
        b1.start();
        b1.stop(); // ClassCastException
    }
}