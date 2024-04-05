package ch05.lecture.p1array;

public class C17Matrix {
    public static void main(String[] args) {
        int[][] mat1 = new int[3][2];

        System.out.println("mat1의 원소의 개수3개, 타입은int");
        System.out.println("mat1의 우너소의 원소의 개수 2개 타입은 int");

        System.out.println(mat1.length);
        System.out.println(mat1[0].length);
        System.out.println(mat1[1].length);
        System.out.println(mat1[2].length);

        mat1[1][0]=5;
        mat1[1][1]=13;
        mat1[2][1]=19;

        for (int i = 0; i < mat1.length; i++) {
            System.out.print("[");
            for (int j = 0; j < mat1[i].length; j++) {
                if(j!=0){
                    System.out.print(", ");
                }
                System.out.print(mat1[i][j]);
            }
            System.out.println("]");
        }





























    }
}
