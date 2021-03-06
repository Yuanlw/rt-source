package org.omg.PortableServer;

import org.omg.CORBA.BAD_PARAM;
import org.omg.CORBA.portable.IDLEntity;

public class ImplicitActivationPolicyValue implements IDLEntity {
  private int __value;
  
  private static int __size = 2;
  
  private static ImplicitActivationPolicyValue[] __array = new ImplicitActivationPolicyValue[__size];
  
  public static final int _IMPLICIT_ACTIVATION = 0;
  
  public static final ImplicitActivationPolicyValue IMPLICIT_ACTIVATION = new ImplicitActivationPolicyValue(0);
  
  public static final int _NO_IMPLICIT_ACTIVATION = 1;
  
  public static final ImplicitActivationPolicyValue NO_IMPLICIT_ACTIVATION = new ImplicitActivationPolicyValue(1);
  
  public int value() { return this.__value; }
  
  public static ImplicitActivationPolicyValue from_int(int paramInt) {
    if (paramInt >= 0 && paramInt < __size)
      return __array[paramInt]; 
    throw new BAD_PARAM();
  }
  
  protected ImplicitActivationPolicyValue(int paramInt) {
    this.__value = paramInt;
    __array[this.__value] = this;
  }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\org\omg\PortableServer\ImplicitActivationPolicyValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */