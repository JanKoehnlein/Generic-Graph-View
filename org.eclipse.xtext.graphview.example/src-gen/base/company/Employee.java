package base.company;

import base.Person;
import base.company.Boss;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

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
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nEmployee {");
    result.append("\n  boss = ").append(String.valueOf(boss).replace("\n","\n  "));
    result.append("\n  firstName = ").append(String.valueOf(firstName).replace("\n","\n  "));
    result.append("\n  lastName = ").append(String.valueOf(lastName).replace("\n","\n  "));
    result.append("\n  address = ").append(String.valueOf(address).replace("\n","\n  "));
    result.append("\n  phone = ").append(String.valueOf(phone).replace("\n","\n  "));
    result.append("\n}");
    return result.toString();
    
  }
}
