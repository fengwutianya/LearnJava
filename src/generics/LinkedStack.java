package generics;

import org.junit.Test;

/**
 * Created by xuan on 2017/4/1 0001.
 */
public class LinkedStack<T> {
    private class Node<U> {
        U item;
        Node<U> next;
        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }
        Node() {
            this(null, null);
        }
        public boolean end() {
            return item == null && next == null;    //˫�ر�׼ʹ�ÿ��Բ���null�ڵ�
        }
    }

    private Node<T> top = new Node<>(); //�ڱ���β�ڵ�
    public void push(T item) {
        Node<T> curr = new Node<>(item, top);
        top = curr;
    }

    public T pop() {
        T item = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return item;
    }

    @Test
    public void test() {
        LinkedStack<Object> stack = new LinkedStack<>();
        stack.push("hello");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
