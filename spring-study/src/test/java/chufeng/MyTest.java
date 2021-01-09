package chufeng;

import autowried.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

  @Test
  public void testMethodAutowire() {
    ApplicationContext context = new ClassPathXmlApplicationContext("Autowire.xml");
    User user = context.getBean("user", User.class);
    user.getCat().shout();
    user.getDog().shout();
  }

  public static void main(String[] args) {
    String classFile = "com.jd.".replaceAll("\\.", "/") + "MyClass.class";
    System.out.println(classFile);
  }
}
