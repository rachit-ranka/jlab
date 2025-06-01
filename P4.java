interface I {
    int CONST_I = 10;

    void methodI();
}

interface I1 extends I {
    int CONST_I1 = 20;
    void methodI1();
}

interface I2 extends I {
    int CONST_I2 = 30;
    void methodI2();
}

interface I12 extends I1, I2 {
    int CONST_I12 = 40;
    void methodI12();
}

class P4 implements I12 {
    public void methodI() {
        System.out.println("Inside methodI(): Constant from I = " + CONST_I);
    }

    public void methodI1() {
        System.out.println("Inside methodI1(): Constant from I1 = " + CONST_I1);
    }

    public void methodI2() {
        System.out.println("Inside methodI2(): Constant from I2 = " + CONST_I2);
    }

    public void methodI12() {
        System.out.println("Inside methodI12(): Constant from I12 = " + CONST_I12);
    }

    public static void main(String[] args) {
        P4 obj = new P4();
        obj.methodI();
        obj.methodI1();
        obj.methodI2();
        obj.methodI12();
    }
} 