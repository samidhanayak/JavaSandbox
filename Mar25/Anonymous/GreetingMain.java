package Mar25.Anonymous;

public class GreetingMain {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello");
            }
        };

        HindiGreeting hg = new HindiGreeting() {
            @Override
            public void namaste() {
                System.out.println("Namaste");
            }
        };

        greeting.greet();
        hg.namaste();
    }
}
