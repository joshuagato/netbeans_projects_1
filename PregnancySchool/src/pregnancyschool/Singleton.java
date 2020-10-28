package pregnancyschool;


public class Singleton {
    
    private Singleton(){}
    
    public static class SingletonHolder{
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance (){
        return SingletonHolder.INSTANCE;
    }
            
    public static void main(String[] args) {
        
    }
    
}
