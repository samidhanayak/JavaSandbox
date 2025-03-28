package Mar22;

public class SingletonDemo {
    public static SingletonDemo sg = null;

    private SingletonDemo() {};

    public static SingletonDemo getInstance(){
        //if(sg == null){
            sg = new SingletonDemo();
        //}
        return sg;
    }


}
