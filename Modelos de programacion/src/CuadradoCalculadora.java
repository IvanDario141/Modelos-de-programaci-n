
public class CuadradoCalculadora implements ICalculadoraFigura{
    
    private Cuadrado cuadrado;

    public CuadradoCalculadora(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }

    @Override
    public double calcularArea() {
        double[] lados = cuadrado.getLados();
        double mayor= 0;
        for (int i = 1; i < lados.length; i++) {
            if (lados[i] > mayor) {
		mayor = lados[i];
            }
	}
        double menor = 1000;
        for (int i = 1; i < lados.length; i++) {
            if (lados[i] < menor) {
		menor = lados[i];
            }
	}
        return mayor*menor;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        double[] lados = cuadrado.getLados();
        for(int i=0; i<lados.length; i++){
            perimetro+=lados[i];
        }
        return perimetro;
    }

    
}
