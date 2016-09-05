package typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuan on 2016/9/5.
 */
public class ForNameCreator extends PetCreator{
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();

    private static String[] typeNames = {
            "typeinfo.pets.Mutt",
            "typeinfo.pets.Pug",
            "typeinfo.pets.EgyptianMau",
            "typeinfo.pets.Manx",
            "typeinfo.pets.Cymric",
            "typeinfo.pets.Rat",
            "typeinfo.pets.Mouse",
            "typeinfo.pets.Hamster"
    };

//    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        for (int i = 0; i < typeNames.length; i++) Class.forName(typeNames[i]).newInstance();
//    }
    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add((Class<? extends Pet>) Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    static {
        loader();
    }
}

//���þ�̬��ʼ���Ӿ�����ʼ�����еľ�̬����
//ǿ������ת�������unchecked����warning����@SuppressWarnings("unchecked")
//���ܷ��ھ�̬��ʼ���Ӿ����棬ֻ����д��̬����
