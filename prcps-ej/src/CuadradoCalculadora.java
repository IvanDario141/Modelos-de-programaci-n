
public class CuadradoCalculadora implements ICalculadoraFigura{
    
    private Cuadrado cuadrado;

    public CuadradoCalculadora(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }

    @Override
    public int calcularArea() {
        int[] lados = cuadrado.getLados();
        int mayor= 0;
        for (int i = 1; i < lados.length; i++) {
            if (lados[i] > mayor) {
		mayor = lados[i];
            }
	}
        int menor= 1000;
        for (int i = 1; i < lados.length; i++) {
            if (lados[i] < menor) {
		menor = lados[i];
            }
	}
        return mayor*menor;
    }

    @Override
    public int calcularPerimetro() {
        int perimetro = 0;
        int[] lados = cuadrado.getLados();
        for(int i=0; i<lados.length; i++){
            perimetro+=lados[i];
        }
        return perimetro;
    }
    
}
