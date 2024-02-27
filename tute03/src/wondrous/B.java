package wondrous;

public class B {

    public static void main(String[] args) {
        B b = new C();
        if (b instanceof C) {
            C c = (C) b;
            System.out.println("Valid cast");
        } else {
            System.out.println("Its not a valid type of C");
        }
    }
}
