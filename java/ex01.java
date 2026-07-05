class Parent {
    int x = 10;
    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 20;
    int getX() {
        return x;
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.x);
        System.out.println(p.getX());
    }
}