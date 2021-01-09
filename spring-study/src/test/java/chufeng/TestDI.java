package chufeng;

import entity.Student;
import entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

  @Test
  public void test_Bean_Xml_File() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    Student student = context.getBean("student", Student.class);
    System.out.println(student.toString());
  }

  @Test
  public void test_Bean_namespace() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    User user1 = context.getBean("c_namespace_user", User.class);
    User user2 = context.getBean("c_namespace_user", User.class);
    System.out.println(user1.hashCode());
    System.out.println(user2.hashCode());
    System.out.println(user1.equals(user2));
  }
}
