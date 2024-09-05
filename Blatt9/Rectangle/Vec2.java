public class Vec2 {
    // Aufgabe 1
    private double x;
    private double y;

    public Vec2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Aufgabe 2
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Aufgabe 3
    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vec2)) {
            return false;
        }
        Vec2 v = (Vec2) o;
        return v.getX() == getX() && v.getY() == getY();
    }

    // Aufgabe 4
    public static void main(String[] args) {
        Vec2 v = new Vec2(1.0, 2.0);
        System.out.println(v);
        // Test Aufgabe5
        test();
        // Test Aufgabe 6
        test2();
        // Test Aufgabe 7
        Vec2 v2 = new Vec2(v);
        if (v.equals(v2)) {
            System.out.println("Correct. The clone is equal");
        } else {
            System.out.println("Wrong. Object is unequal");
        }
    }

    // Aufgabe 5
    public void addAssign(double scalar) {
        this.x += scalar;
        this.y += scalar;
    }

    public void addAssign(final Vec2 point) {
        this.x += point.x;
        this.y += point.y;
    }

    public void mulAssign(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
    }

    public void mulAssign(final Vec2 point) {
        this.x *= point.x;
        this.y *= point.y;
    }

    public static void test() {
        Vec2 v1 = new Vec2(2.3, 1.1);
        Vec2 v2 = new Vec2(2.1, 0.6);
        v1.addAssign(v2);
        v1.mulAssign(3.0);
        System.out.println(v1);
    }

    // Aufgabe 6
    public Vec2 addAssign2(double scalar) {
        this.x += scalar;
        this.y += scalar;
        return this;
    }

    public Vec2 addAssign2(final Vec2 point) {
        this.x += point.x;
        this.y += point.y;
        return this;
    }

    public Vec2 mulAssign2(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
        return this;
    }

    public Vec2 mulAssign2(final Vec2 point) {
        this.x *= point.x;
        this.y *= point.y;
        return this;
    }

    public static void test2() {
        Vec2 v = new Vec2(2.3, 1.1);
        Vec2 w = new Vec2(2.1, 0.6);
        System.out.println(v.addAssign2(w).mulAssign2(3.0));
    }

    // Aufgabe 7
    public Vec2(Vec2 v) {
        this(v.x, v.y);
    }

    //Static method 9.9
    public static Vec2 add(final Vec2 v, final Vec2 w){
        return new Vec2(v.x + w.x, v.y + w.y);
    }
    public static Vec2 add(final Vec2 v, final double scalar){
        return new Vec2(v.x + scalar, v.y + scalar);
    }
    public static Vec2 mul(final Vec2 v, final Vec2 w){
        return new Vec2(v.x * w.x, v.y * w.y);
    }
    public static Vec2 mul(final Vec2 v, final double scalar){
        return new Vec2(v.x * scalar, v.y * scalar);
    }
    public static Vec2 mod(final Vec2 v, final double scalar){
        return new Vec2(v.x % scalar, v.y % scalar);
    }

    public static Vec2 rotate(final Vec2 v, double a){
        double x = v.x * Math.cos(a) - v.y * Math.sin(a);
        double y = v.x * Math.sin(a) - v.y * Math.cos(a);
        return new Vec2(x,y);
    }
}
