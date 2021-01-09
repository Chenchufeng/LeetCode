package autowried;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {
  @Resource(name = "cat1")
  private Cat cat;

  @Autowired
  @Qualifier(value = "dog")
  private Dog dog;

  private String str;

  public Cat getCat() {
    return cat;
  }

  public Dog getDog() {
    return dog;
  }

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  @Override
  public String toString() {
    return "User{" + "cat=" + cat + ", dog=" + dog + ", str='" + str + '\'' + '}';
  }
}
