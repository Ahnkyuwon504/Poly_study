package newprj0407;

abstract class Animal {
    public String sName;
    public void move() {
        System.out.println("��� ���");
    }
    abstract void howl();
}

class Dog extends Animal {
    public void move() {
        System.out.println("��¦ ��¦");
    }

    void howl() {
            System.out.println("�۸�");
    }
}

class Cat extends Animal {
    void howl() {
            System.out.println("�Ŀ�");
    }
}

public class k20_abstract {

    public static void main(String[] args) {
        Dog happy = new Dog();
        Cat julia = new Cat();
        happy.move(); // �������̵�� ����Լ� ȣ��
        happy.howl(); // ������ ����Լ� ȣ��
        julia.move(); // ������ ����Լ� ȣ��
        julia.howl(); // ������ ����Լ� ȣ��
    }
}


