public class Main {
    public static void main(String[] args) {
        Figure c = new Circle(10);
        System.out.println(c.calcArea());
        Figure t = new Triangle(3, 5, 7);
        System.out.println(t.calcArea());
        Figure rec1 = new Rectangle(6, 5);
        System.out.println(rec1.calcArea());
        Figure rec2 = new Rectangle(5, 6);
        System.out.println(rec2.calcArea());
        System.out.println(Figure.compare(c,rec2));
    }
}