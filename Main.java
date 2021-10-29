class Main {
  public static void main(String[] args) {
  Circulo cir = new Circulo();
  System.out.println(cir);

  cir.setRadio(5.6f);
  System.out.println(cir);//Primera solucion

  cir.setRadio((float) 7.33);
  System.out.println(cir);//Segunda solucion
  
  float var = -8.66f;
  cir.setRadio(var);
  System.out.println(cir);//imprime negativos

  System.out.println("* Composicion *");
  Persona persona1 = new Persona("Carlos","Rodriguez",18,03,1998);
  System.out.println(persona1);

  System.out.println("* Composicion *");
  Persona persona2 = new Persona("victor","Rodriguez",15,02,2001);
  System.out.println(persona2);

  System.out.println("* Extra *");
  Persona personaExtra1 = new Persona("Ruben","Escobar",10,01,2004);
  Persona personaExtra2 = new Persona("Adelin","Perez",16,10,2005);
  Persona personaExtra3 = new Persona("Tereza","Toriz",18,02,1995);
  Persona personaExtra4 = new Persona("Jesus","Cervantes",28,11,2001);
  Coche coche1 = new Coche("Red","Bugatti Veyron",9,2005,1001 );
  System.out.println(coche1);
  System.out.println("chofer = "+personaExtra1);
  System.out.println("copiloto = "+personaExtra2);
  System.out.println("pasajero1 = "+personaExtra3);
  System.out.println("pasajero2 = "+personaExtra4);
  }
}