package ch05.lecture.p1array;

public class C01ReferenceType {
    public static void main(String[] args) {


        int[] arr = new int[]{2, 3};

        int address = System.identityHashCode(arr);
        int address2=System.identityHashCode(new int[]{1,2,3});
        int address3=address;

        double[] brr;
        String[] crr;

        arr = new int[]{6, 7, 5};
        brr=new double[]{2.14,3.7};
        crr=new String[]{"java", "spring", "css"};



        
        System.out.println("address = " + address);
        System.out.println("address2 = " + address2);
        System.out.println("address3 = " + address3);
        System.out.println("배열:같은타입의 값을 여러개 갖는 자료형");

        
        
        
        
        
        
        
        
        
        
        
    }
}

