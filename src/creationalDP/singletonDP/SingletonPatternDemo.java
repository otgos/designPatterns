package creationalDP.singletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // we cannot create object using new keyword
        //SingletonObject singletonObject = new SingletonObject();
        SingletonObject singletonObject = SingletonObject.getInstance();
        System.out.println(singletonObject.message);
        singletonObject.showMessage();

        //testing the new object is the same or not
        SingletonObject singletonObject1 = SingletonObject.getInstance();
        System.out.println(singletonObject1.message);

    }
}
