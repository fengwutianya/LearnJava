package typeinfo.pets;

import java.util.List;
import java.util.Collections;
import java.util.Arrays;
/**
 * Created by xuan on 2016/9/5.
 */
public class LiteralPetCreator extends PetCreator {
    @SuppressWarnings("unchecked")
    //Collections.unmodifiableType() 只读类型容器
    //Arrays.asList() 批量例举创建list
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class, Hamster.class
            )); //.class编译器检查

    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}
