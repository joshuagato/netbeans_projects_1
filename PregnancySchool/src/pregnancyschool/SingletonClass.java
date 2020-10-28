package pregnancyschool;


public class SingletonClass {

    public static SingletonClass instance;

        public SingletonClass() {
        // your code
        }


        public static SingletonClass getInstance() {
            if(instance == null) {
            instance = new SingletonClass();
            }
            return instance;

        }

        public static void main (String [] args){
            SingletonClass sclass = new SingletonClass();
            sclass.getInstance();
        }
}

// SingletonClass.getInstance()