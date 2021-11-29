public class PoliginoCalculadora implements ICalculadoraFigura{
    
    private Poligono poligono;

    public PoliginoCalculadora(Poligono cuadrado) {
        this.poligono = cuadrado;
    }

    @Override
    public double calcularArea() {
        double[] lados = poligono.getLados();
        double area = 0;
        double angulo;
        angulo = (double)360/(double)(2*lados.length);
        double anguloRadianes = Math.toRadians(angulo);
        double resultado = Math.tan(anguloRadianes);
        double apotema = (lados[1])/ (resultado*2);
        area = ((lados.length*lados[1])*apotema)/2;
        
        return area;
        
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        double[] lados = poligono.getLados();
        perimetro = lados[1]*lados.length;
        
        return perimetro;
    }

}
