package enumerated;

import static enumerated.Spiciness.*;
/**
 * Created by xuan on 2017/2/27 0027.
 */
public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) {this.degree = degree;}

    @Override
    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(HOT));
    }
}
