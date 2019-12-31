package traditional;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import traditional.bean.Dog;
import traditional.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TraditionalPerson.class)
public class SpringbootPersonTest {
    @Autowired
    Person person;
    @Autowired
    Dog dog;

    @Test
    public void testPerson(){
        System.out.println(person);
    }
}
