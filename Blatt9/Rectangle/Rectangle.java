public class Rectangle {
    private Vec2 topLeft;
    private Vec2 botRight;

    public Rectangle(Vec2 topLeft, Vec2 botRight) {
        this.topLeft = new Vec2(topLeft);
        this.botRight = new Vec2(botRight);
    }

    public Vec2 getTopLeft() {
        // clone the Vec2 so no one can modify the rectangle
        return new Vec2(topLeft);
    }

    public Vec2 getBotRight() {
        // clone the Vec2 so no one can modify the rectangle
        return new Vec2(botRight);
    }

    public static void main(String[] args) {
        Vec2 v = new Vec2(1.0, 2.0);
        Vec2 w = new Vec2(3.0, 4.0);
        Rectangle r = new Rectangle(v, w);
        System.out.println(r);
        v.setX(10.0);
        System.out.println(r);
        r.getTopLeft().setX(10.0);
        System.out.println(r);
    }

    @Override
    public String toString() {
        return "Rectangle: " + this.topLeft + " to " + this.botRight;
    }
}
