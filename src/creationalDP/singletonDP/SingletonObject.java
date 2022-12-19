package creationalDP.singletonDP;

public class SingletonObject {
    String message = "Hello SingletonObj";
    private static SingletonObject instance = new SingletonObject();
    private SingletonObject(){}

    //without creating object we can get the object
    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMessage(){
        this.message = this.message+"is the same?";
        System.out.println(this.message);
    }
}
