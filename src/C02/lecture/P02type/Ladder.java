package C02.lecture.P02type;

public class Ladder {


    private int bottom;
    private int top;
    private int height;
    private int extent;

    public Ladder(int bottom, int top, int height) {
        this.bottom = bottom;
        this.top = top;
        this.height = height;
    }

    public int getExtent() {
        extent = (bottom + top) * height / 2;
        return extent;
    }

    public static void main(String[] args) {
        Ladder a = new Ladder(13,15,25);
//        a.Ladder(13, 15, 25);
        int result = a.getExtent();
        System.out.println(result);
    }
}
