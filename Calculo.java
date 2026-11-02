class calculadora {

    private int a;
    private int b;
    private int c;

    public calculadora(int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int calculartotal(){

         return a+b+c;
    }
    public int Calculartotoal(){

        return getB()+getA()+getC();

    }

}
    class calculo {

        public static void main(String[] args) {

           calculadora  cl = new calculadora(10, 50, 80);

           cl.Calculartotoal();

       ;

          if (cl.Calculartotoal() == 100){

              System.out.println("Limite atingido");
          }
          else if (cl.Calculartotoal() < 100){

              System.out.println("Compra dentro do limite");

          }
           else {

              System.out.println("Limite estourado");

          }
        }
    }

