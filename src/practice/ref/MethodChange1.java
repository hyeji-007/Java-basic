package practice.ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("매소드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("매소드 호출 후: a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}

