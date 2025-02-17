public class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getRadio() {
        return Math.sqrt(x * x + y * y);
    }

    public double getAngulo() {
        return Math.atan2(y, x); // En radianes
    }

    public void setCoordenadasPolares(double r, double theta) {
        this.x = r * Math.cos(theta);
        this.y = r * Math.sin(theta);
    }

    public void mostrar() {
        System.out.println("Cartesianas: (" + x + ", " + y + ")");
        System.out.println("Polares: (r = " + getRadio() + ", θ = " + Math.toDegrees(getAngulo()) + "°)");
    }

    public static void main(String[] args) {
        Punto p = new Punto(3, 4);
        p.mostrar();
    }
}
