
public class App {

    public static void main(String[] args) {
        // TODO code application logic here}
        Figura triangulo1 = new Triangulo(10, 12, 20);
        Figura cuadrado1 = new Cuadrado(2, 2, 2, 2);
        
        CuadradoCalculadora cuadradoCalculo = new CuadradoCalculadora((Cuadrado) cuadrado1);
        TrianguloCalculadora trianguloCalculo = new TrianguloCalculadora((Triangulo) triangulo1);
        System.out.println(cuadradoCalculo.calcularArea());
        System.out.println(cuadradoCalculo.calcularPerimetro());
        System.out.println(trianguloCalculo.calcularArea());
        System.out.println(trianguloCalculo.calcularPerimetro());
    }
    
}
