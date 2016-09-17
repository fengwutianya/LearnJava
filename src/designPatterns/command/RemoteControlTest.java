package designPatterns.command;

/**
 * Created by xuan on 2016/9/16 0016.
 */
public class RemoteControlTest {        //client
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(); //invoker
        Light light = new Light("");      //commandReceiver
        LightOnCommand lightOn = new LightOnCommand(light);     //command
        remote.setCommand(lightOn);     //setCommand
        remote.buttonWasPressed();      //runCommand

        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorOpenCommand garageOpen =
                new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}

/*
client想要开灯，于是invoker接受开灯命令（setCommand）
并runCommand方法，把开灯任务分配给实际执行者CommandReceiver
 */
