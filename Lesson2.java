class Lesson2 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 0xC;
        byte b4 = 014;
        System.out.println("1. byte: " + b1 + " " + b2 + " " + b3 + " " + b4);
        short sh1 = 1300;
        short sh2 = 0b10100010100;
        short sh3 = 0x514;
        short sh4 = 02424;
        System.out.println("short: " + sh1 + " " + sh2 + " " + sh3 + " " + sh4);
        int int1 = 0;
        int int2 = 00;
        int int3 = 0x0;
        int int4 = 0b0;
        System.out.println("int: " + int1 + " " + int2 + " " + int3 + " " + int4);
        long long1 = 123456789;
        long long2 = 123456789L;
        long long3 = 0x75BCD15;
        long long4 = 0726746425;
        System.out.println("long: " + long1 + " " + long2 + " " + long3 + " " + long4);
        float f1 = 2.28f;
        float f2 = 13.37f;
        double d1 = 2.28;
        double d2 = 13.37;
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("2. float: " + f1 + " " + f2 + "\n" +
                "double: " + d1 + " " + d2 + "\n" +
                "boolean: " + bool1 + " " + bool2);
        char char1 = 500;
        char char2 = '\u0500';
        char char3 = 'a';
        System.out.println("3. char: " + char1 + " " + char2 + " " + char3);
    }
}
