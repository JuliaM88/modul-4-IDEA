import java.util.Objects;

class Point {
    private int x;
    private int y;
    private int z;


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y &&
                z ==point.z;
    }

    @Override
    public int hashCode(){
        return Objects.hash(x,y,z);
    }
}
class PointTest {

    public static void main(String[] args) {
            Point p1 = new Point();
            p1.setX(1);
            p1.setY(1);
            p1.setZ(1);

            Point p2 = new Point();
            p2.setX(1);
            p2.setY(1);
            p2.setZ(1);

            System.out.println(p1.equals(p2)); //Will be false
        }

}
