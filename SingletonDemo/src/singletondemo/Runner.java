package singletondemo;


public class Runner {
    
    public static void main(String[] args) {
        
        SingletonDemo ins = SingletonDemo.getInstance();
        SingletonDemo ins2 = SingletonDemo.getInstance();
        SingletonDemo ins3 = SingletonDemo.getInstance();
        SingletonDemo ins4 = SingletonDemo.getInstance();
        
        System.out.println(SingletonDemo.getInstanceCount());
    }
    
}
