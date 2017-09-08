/**
 * Esta clase es una super clase para representar las caracteristicas 
 * comunes de muchas figuras
 * @author Carlos Liñan
 * @version 1.0(8-sep-17)
 */
public class Figura
{
  protected float area;//area de cada figura
  protected float perimetro;
  /**
   * constructor de la clase figura
   */
  public Figura()
  {
   area=0;
   perimetro=0;
  }
  public void calcularArea()
  {
     System.out.println("no se como calcular area porque no se de que figura se trata");
  }
  public void imprimirArea()
  {
    System.out.println("El area de la figura es:"+ area);
  }
  public void calcularPerimetro()
  {
      System.out.println("no se como calcular el perimetro porque no se de que figura");
  }
  public void imprimirPerimetro()
  {
      System.out.println("El perimetro de la figura es:"+ perimetro);
    }
}