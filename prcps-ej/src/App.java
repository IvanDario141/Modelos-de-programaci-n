
public class App {

    public static void main(String[] args) {
        // TODO code application logic here}
        Figura triangulo1 = new Triangulo(1, 2, 4);
        Figura cuadrado1 = new Cuadrado(2, 2, 2, 2);
        
        CuadradoCalculadora cuadradoCalculo = new CuadradoCalculadora((Cuadrado) cuadrado1);
        System.out.println(cuadradoCalculo.calcularArea());
        System.out.println(cuadradoCalculo.calcularPerimetro());
        
    }
    
}
