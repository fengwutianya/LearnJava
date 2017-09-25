package InnerClass.innerClassWithoutName;

/**
 * Created by xuan on 2017/9/25 0025.
 */
public class AnnoymousDemo1 {
    public static void main(String[] args) {
        new AnnoymousDemo1().play();
    }

    private void play() {
        Dog dog = new Dog();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
//                dog = new Dog(); 必须是final 或者 实际上的final
                while (dog.getAge() < 100) {
                    dog.happyBirthday();
                    System.out.println(dog.getAge());
                }
            }
        };
        new Thread(runnable).start();
    }
}
