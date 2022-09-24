public class Square extends Shape {
    // square extends from shape without modification
    private int side;

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Square");
    }

}
