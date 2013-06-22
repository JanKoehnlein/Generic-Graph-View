package base.company;

import base.Person;
import base.company.Boss;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@SuppressWarnings("all")
public class Employee extends Person {
  public Employee() {
  }
  
  public Employee(final Procedure1<Employee> initializer) {
    initializer.apply(this);
  }
  
  private Boss boss;
  
  public Boss getBoss() {
    return this.boss;
  }
  
  public void setBoss(final Boss boss) {
    this.boss = boss;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
