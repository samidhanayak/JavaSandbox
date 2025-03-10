package Mar01;

public class BlockDemo {

        // Constructor // 3
        BlockDemo(){
            System.out.println("Inside the constructor...");
        }

        static {
            System.out.println("Static Block ");
        }

        static  {
            System.out.println("Static Block 2");
        }

        {
            System.out.println("Instance Block");
        }

        public void set(){
            System.out.println("Inside non static set method");
        }

        public static void show(){
            System.out.println("Static show method.");
        }


}
