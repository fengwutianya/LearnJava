package container;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by xuan on 2016/7/13 0013.
 */
public class BasicContainer {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("hello");
        System.out.println(c);
        c.remove("hello");
        System.out.println(c);
        c.add(new Integer(10));
        System.out.println(c);
        c.remove(new Integer(10));
        System.out.println(c);
        c.add(new Name("zhenxuan", "zhu"));
        System.out.println(c);
        System.out.println(c.remove(new Name("zhenxuan", "zhu")));
        System.out.println(c);

    }
}

class Name {
    private String firstName, lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    @Override
    public int hashCode() {
        return (firstName + " " + lastName).hashCode();
    }
    @Override
    public boolean equals(Object name) {
        if (name instanceof Name) {
            return (((Name) name).firstName == this.firstName) &&
                    (((Name) name).lastName == this.lastName);
        }
        return super.equals(name);
    }
}
