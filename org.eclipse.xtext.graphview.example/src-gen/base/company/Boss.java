package base.company;

import base.Person;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class Boss extends Person {
  public Boss() {
  }
  
  public Boss(final Procedure1<Boss> initializer) {
    initializer.apply(this);
  }
  
  @Override
  public String toString() {
    String result = new ToStringBuilder(this).addAllFields().toString();
    return result;
  }
}
