package Java240313.typecasting2;
class A {
    int m = 3;
    void abc() {
        System.out.println("A 클래스");
    }
}

class B extends A {
    int n = 4;
    void bcd() {
        System.out.println("B 클래스");
    }
}

public class Java240313typecastingEx02 {
    public static void main(String[] args) {
        // A 타입 / A 생성자
        A aa = new A();
        System.out.println(aa.m);
        aa.abc();

        // B 타입 / B 생성자
        B bb = new B();
        System.out.println(bb.m);
        System.out.println(bb.n);
        bb.abc();
        bb.bcd();

        // A 타입 / B 생성자: 다형적 표현
        A ab = new B();
        System.out.println(ab.m);
        ab.abc();
        //System.out.println(ab.n); // 객체 없음, 에러
        //ab.bcd(); // 객체 없음, 에러

    }
}
