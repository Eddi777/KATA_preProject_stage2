import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Start");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld1 = context.getBean("helloworld", HelloWorld.class);
        System.out.println("helloworld1 " + helloWorld1.getMessage());

        HelloWorld helloWorld2 = context.getBean("helloworld", HelloWorld.class);
        System.out.println("helloworld2 " + helloWorld2.getMessage());
        System.out.println("Hello world same? - " + (helloWorld2 == helloWorld1));
        System.out.println("");

        Cat cat1 = context.getBean("cat", Cat.class);
        System.out.println("cat1 " + cat1.getMessage());

        Cat cat2 = context.getBean("cat", Cat.class);
        System.out.println("cat1 " + cat2.getMessage());
        System.out.println("Cats same? - " + (cat1 == cat2));




    }
}