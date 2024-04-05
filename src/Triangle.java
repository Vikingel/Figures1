public class Triangle extends Figure{
    double ab;
    double bc;
        double ac;
    public Triangle(double ab,double bc,double ac) {
        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
    }
    public double calcArea() {
        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p*(p-ab)*(p-bc)*(p-ac));
    }
}
