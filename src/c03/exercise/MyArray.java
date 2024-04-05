public class MyArray {
    private int[] array;
    private int length;

    public MyArray(int[] array) {
        this.array = array;
        this.length = array.length;
    }

    public int getLength() {
        return length;
    }

    public int getElement(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    public void setElement(int index, int value) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        array[index] = value;
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);
            if (i < length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        MyArray myArray = new MyArray(data);

        System.out.println("배열의 길이: " + myArray.getLength());

        System.out.println("배열의 요소:");
        myArray.printArray();

        System.out.println("세 번째 요소: " + myArray.getElement(2));

        myArray.setElement(2, 10);
        System.out.println("세 번째 요소를 10으로 변경 후:");
        myArray.printArray();
    }
}
