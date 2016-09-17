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
client��Ҫ���ƣ�����invoker���ܿ������setCommand��
��runCommand�������ѿ�����������ʵ��ִ����CommandReceiver
 */
