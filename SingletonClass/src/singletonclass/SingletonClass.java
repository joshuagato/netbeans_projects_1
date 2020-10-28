package singletonclass;

public class SingletonClass {

private static SingletonClass instance;

    private SingletonClass() {
    // your code
    }


    public static SingletonClass getInstance() {
        if(instance == null) {
        instance = new SingletonClass();
        }
        return instance;

    }
}

// SingletonClass.getInstance() 