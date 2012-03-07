package base;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class Phone {
  public Phone() {
  }
  
  public Phone(final Procedure1<Phone> initializer) {
    initializer.apply(this);
  }
  
  private String number;
  
  public String getNumber() {
    return this.number;
  }
  
  public void setNumber(final String number) {
    this.number = number;
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nPhone {");
    result.append("\n  number = ").append(String.valueOf(number).replace("\n","\n  "));
    result.append("\n}");
    return result.toString();
    
  }
}
