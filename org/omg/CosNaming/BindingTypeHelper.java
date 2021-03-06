package org.omg.CosNaming;

import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;
import org.omg.CORBA.TypeCode;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

public abstract class BindingTypeHelper {
  private static String _id = "IDL:omg.org/CosNaming/BindingType:1.0";
  
  private static TypeCode __typeCode = null;
  
  public static void insert(Any paramAny, BindingType paramBindingType) {
    OutputStream outputStream = paramAny.create_output_stream();
    paramAny.type(type());
    write(outputStream, paramBindingType);
    paramAny.read_value(outputStream.create_input_stream(), type());
  }
  
  public static BindingType extract(Any paramAny) { return read(paramAny.create_input_stream()); }
  
  public static TypeCode type() {
    if (__typeCode == null)
      __typeCode = ORB.init().create_enum_tc(id(), "BindingType", new String[] { "nobject", "ncontext" }); 
    return __typeCode;
  }
  
  public static String id() { return _id; }
  
  public static BindingType read(InputStream paramInputStream) { return BindingType.from_int(paramInputStream.read_long()); }
  
  public static void write(OutputStream paramOutputStream, BindingType paramBindingType) { paramOutputStream.write_long(paramBindingType.value()); }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\org\omg\CosNaming\BindingTypeHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */