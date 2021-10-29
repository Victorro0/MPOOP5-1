public class Circulo{
  private float radio;

  public Circulo(){}

  public float perimetro(){
    return 2 * (float)Math.PI * radio;
  }
  public float area(){
    return (float)Math.PI * radio * radio;
  }

  //Cosntruimos para acceder a ellos ya que son privados
  public float getRadio(){
    return radio;
  }

  //Ahora creamos para modificar radio
  public void setRadio(float radio){
    if(radio<0){
      this.radio = Math.abs(radio);//Valor absoluto
    } else {
      this.radio = radio;
    }
    this.radio = radio;
  }

  @Override
  public String toString(){
  return "Circulo (radio = "+radio+")";
  }
}