package Annotation;

import Annotation.hibernate_annotation.*;

import java.lang.reflect.Method;

/**
 * Created by xuan on 2017/8/17 0017.
 */
public class ParseHibernateAnnotation {
    public static void main(String[] args) {
        Class<Hero> heroClass = Hero.class;
        MyEntity myEntity = heroClass.getAnnotation(MyEntity.class);
        if (null == myEntity) {
            System.out.println("Hero类不是实体类");
        } else {
            System.out.println("Hero类是实体类");
            MyTable myTable = heroClass.getAnnotation(MyTable.class);
            String tableName = myTable.name();
            System.out.println("对应表名是" + tableName);
            Method[] methods = heroClass.getMethods();
            Method primaryKey = null;
            for (Method method: methods) {
                MyId myId = method.getAnnotation(MyId.class);
                if (myId != null) {
                   primaryKey = method;
                    break;
                }
            }
            if (primaryKey != null) {
                System.out.println("找到主键：" + method2attribute(primaryKey.getName()));
                String strategy = primaryKey.getAnnotation(MyGeneratedValue.class).strategy();
                System.out.println("主键增长策略：" + strategy);
                String columnName = primaryKey.getAnnotation(MyColumn.class).value();
                System.out.println("对应数据库字段为：" + columnName);
            }
            for (Method method: methods) {
                MyColumn myColumn = method.getAnnotation(MyColumn.class);
                if (myColumn != null) {
                    System.out.println("属性：" + method2attribute(method.getName()) +
                        " 对应列名：" + myColumn.value());
                }
            }
        }
    }

    private static String method2attribute(String method) {
        String attribute = null;
        attribute  = method.substring(3, 4).toLowerCase() + method.substring(4);

        return attribute;
    }
}
