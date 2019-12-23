package traditional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import traditional.bean.Person;


@SpringBootApplication
public class HelloPerson {

    @Autowired
    Person person;

    public static void main(String[] args) {
        System.out.println("");
        SpringApplication.run(HelloPerson.class);
    }
}
