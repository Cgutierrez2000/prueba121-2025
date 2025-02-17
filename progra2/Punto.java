public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    // Método para obtener el radio (r) en coordenadas polares
    public double getRadio() {
        return Math.sqrt(x * x + y * y);
    }

    // Método para obtener el ángulo θ en radianes
    public double getAngulo() {
        return Math.atan2(y, x);
    }

    // Método para convertir de coordenadas polares a cartesianas
    public void setCoordenadasPolares(double r, double theta) {
        this.x = r * Math.cos(theta);
        this.y = r * Math.sin(theta);
    }

    public void mostrar() {
        System.out.println("Cartesianas: (" + x + ", " + y + ")");
        System.out.println("Polares: (r = " + getRadio() + ", θ = " + Math.toDegrees(getAngulo()) + "°)");
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(3, 4);
        p1.mostrar();

        Punto p2 = new Punto(0, 0);
        p2.setCoordenadasPolares(5, Math.toRadians(53.13)); // 53.13° en radianes
        p2.mostrar();
    }
}
