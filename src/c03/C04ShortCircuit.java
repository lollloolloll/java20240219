package c03;

public class C04ShortCircuit {
    public static void main(String[] args) {
        
        int i=10;


        boolean b1 = (i++) == 10;
        System.out.println("b1 = " + b1);
        
        i=10;
        boolean b2=(i++)==10&&(i++)==11;
        System.out.println("b2 = " + b2);
        System.out.println("i = " + i);
        
        i=10;
        boolean b3=(i++)==20;
        System.out.println("b3 = " + b3);
        
        i=20;
        boolean b4=(i++)== 20 &&(i++)==30;
        System.out.println("b4 = " + b4);
        System.out.println("b4 = " + i);
        
        i=10;
        boolean b5=(i++)==20&(i++)==30;
        System.out.println("b5 = " + b5);
        System.out.println("i = " + i);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
