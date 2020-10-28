package singletondemo;


public class SingletonDemo {
    
    private static int countInstance;
    private static SingletonDemo instance;
    
    private SingletonDemo(){
        countInstance+=1;
    }
    
    public static int getInstanceCount(){
        return countInstance;
    }
    
    public static SingletonDemo getInstance(){
        if(instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }
}
