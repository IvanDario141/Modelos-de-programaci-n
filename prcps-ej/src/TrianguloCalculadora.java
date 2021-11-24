
public class TrianguloCalculadora implements ICalculadoraFigura{
    
    private Triangulo triangulo;

    public TrianguloCalculadora(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    @Override
    public int calcularArea() {
        return 0;
    }

    @Override
    public int calcularPerimetro() {
        int perimetro = 0;
        int[] lados = triangulo.getLados();
        for(int i=0; i<lados.length; i++){
            perimetro+=lados[i];
        }
        return perimetro;
    }
    
}
