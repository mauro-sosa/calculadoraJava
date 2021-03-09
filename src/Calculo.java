
public class Calculo {
    public int a,b,c; // declaracion de variables ( atributos )
    public float d;
    
    public void Calculo ( int a, int b, int c, float d){ // constructor, lleva el mismo nombre de la clase
       
    
}
    
    public int getA(){ // metodo

     return a;
    }
    
    public void setA(int a){//  void no retorna ningun valor, es para mostrar


   this.a = a;


    }
    
     public int getB(){

     return b;
    }
    
    public void setB(int b){


   this.b = b;


    }
    
      public int getC(){

     return c;
    }
    
    public void setC(int c){


   this.c = c;


    }
    
    public int suma (int a, int b){
   c=0;
   c=a+b;
   return c;

    }
    
     public int resta (int a, int b){
   c=0;
   c=a-b;
   return c;

    }
     
        public int multiplicacion (int a, int b){
   c=0;
   c=a*b;
   return c;

    }
     
        
           public float division (int a, int b){
   d =0;
   d=(float)a/b;
   return d;

    }




















}
