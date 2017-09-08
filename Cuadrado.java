    /**
 * Esta clase representa objetos Cuadrado con un lado
 * @author Carlos Liñan
 * @version 1.0(18-sep-17)
 */
public class Cuadrado extends Figura
{
  private float lado;
  
  public Cuadrado(float unLado)
  {
    lado=unLado;
  }
  @Override
  public void calcularArea()
  {
      area=lado*lado;
  }
    @Override
  public void calcularPerimetro()
  {
      perimetro=lado*4;
  }
}