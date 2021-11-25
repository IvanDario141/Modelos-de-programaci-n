
public class CuadradoCalculadora implements ICalculadoraFigura{
    
    private Cuadrado cuadrado;

    public CuadradoCalculadora(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }

    @Override
    public float calcularArea() {
        float[] lados = cuadrado.getLados();
        float mayor= 0;
        for (int i = 1; i < lados.length; i++) {
            if (lados[i] > mayor) {
		mayor = lados[i];
            }
	}
        float menor= 1000;
        for (int i = 1; i < lados.length; i++) {
            if (lados[i] < menor) {
		menor = lados[i];
            }
	}
        return mayor*menor;
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = 0;
        float[] lados = cuadrado.getLados();
        for(int i=0; i<lados.length; i++){
            perimetro+=lados[i];
        }
        return perimetro;
    }
    
}
