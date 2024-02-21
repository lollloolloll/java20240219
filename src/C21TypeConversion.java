import java.net.InterfaceAddress;

public class C21TypeConversion {


    public static void main(String[] args) {


        String a = "123";
        short b = Byte.parseByte(a);
        short c = Short.parseShort(a);
        int e = Integer.parseInt(a);
        long f = Long.parseLong(a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("c = " + c);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        String i = "가나다";
        int j=Integer.parseInt(i);
        System.out.println("j = " + j);

        기본타입-> String 변환
        int k = 365, l = 3.14;
        String o = k + "";
        String p = l + "";
        System.out.println("o = " + o);
        System.out.println("p = " + p);


    }
}
