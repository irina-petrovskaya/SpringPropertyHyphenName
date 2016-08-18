import aaa.bbb.ccc.Bean1;
import aaa.bbb.ccc.Bean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/29/2016.
 * Project: propertyHyphenName
 * *******************************
 */
public class RunMe {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Bean1 bean11 = (Bean1) ctx.getBean("b1!!!!bean-test=name");
        Bean1 bean12 = (Bean1) ctx.getBean("b2");
        Bean2 bean21 = (Bean2) ctx.getBean("b3");
        Bean2 bean22 = (Bean2) ctx.getBean("b4");
        System.out.println(bean11.toString());
        System.out.println(bean12.toString());
        System.out.println(bean21.toString());
        System.out.println(bean22.toString());
    }
}
