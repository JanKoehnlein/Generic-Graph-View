package base.company;

import base.Person;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class Boss extends Person {
  public Boss() {
  }
  
  public Boss(final Procedure1<Boss> initializer) {
    initializer.apply(this);
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nBoss {");
    result.append("\n  firstName = ").append(String.valueOf(firstName).replace("\n","\n  "));
    result.append("\n  lastName = ").append(String.valueOf(lastName).replace("\n","\n  "));
    result.append("\n  address = ").append(String.valueOf(address).replace("\n","\n  "));
    result.append("\n  phone = ").append(String.valueOf(phone).replace("\n","\n  "));
    result.append("\n}");
    return result.toString();
    
  }
}
