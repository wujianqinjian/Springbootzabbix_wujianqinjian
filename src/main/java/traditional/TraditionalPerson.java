package traditional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import traditional.bean.Person;


@SpringBootApplication
public class TraditionalPerson {

    @Autowired
    Person person;

    public static void main(String[] args) {
        System.out.println("");
        SpringApplication.run(TraditionalPerson.class);
    }

  /*  @Bean
    public ViewResolver myViewResolver(){
        return new MyViewReslover();
    }*/

    /*private static class MyViewReslover implements ViewResolver {

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }*/
}
