package company;

import company.Boss;
import company.Person;

public class Employee extends Person {
  private Boss boss;
  
  public Boss getBoss() {
    return this.boss;
  }
  
  public void setBoss(final Boss boss) {
    this.boss = boss;
  }
}
