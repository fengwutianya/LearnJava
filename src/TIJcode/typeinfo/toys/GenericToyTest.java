//: typeinfo/toys/GenericToyTest.java
// Testing class Class.
package TIJcode.typeinfo.toys;

import typeinfo.toys.*;

public class GenericToyTest {
  public static void main(String[] args) throws Exception {
    Class<typeinfo.toys.FancyToy> ftClass = typeinfo.toys.FancyToy.class;
    // Produces exact type:
    typeinfo.toys.FancyToy fancyToy = ftClass.newInstance();
    Class<? super typeinfo.toys.FancyToy> up = ftClass.getSuperclass();
    // This won't compile:
    // Class<Toy> up2 = ftClass.getSuperclass();
    // Only produces Object:
    Object obj = up.newInstance();
  }
} ///:~
