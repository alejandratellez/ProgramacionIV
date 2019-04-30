package TiempoLlenado;

public class TiempoDeLlenado {
    public static boolean isNumeric(String cadena) {

       boolean resultado;

       try {
           Double.parseDouble(cadena);
           resultado = true;
       } catch (NumberFormatException excepcion) {
           resultado = false;
       }

       return resultado;
   }
    
    public static Double formatearDecimales(Double numero, Integer numeroDecimales) 
    {
       return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
       }    
   public static void main(String[] args) {
       double ladoA = 0;
       double ladoL = 0;
       double anguloTeta = 0;
       double ladoB = 0;
       double radio = 0;
       double alturaTanque = 0;
       double lluvia = 0;
       if (args.length != 7) {
           System.out.println("Numero Invalido de Argumentos, por favor Ingrese los 7 datos correspondientes");
       }
       else  {
           int cont =0;
           for (int i=0;i<args.length;i++){
               
               if (isNumeric(args[i]) == true )
               { if(Double.parseDouble(args[i])>=0){
                   cont=cont+1;
               }
               }            
                          
          }
           if(cont!=args.length){
               System.out.println( "Ingreso letras o numeros negativos por favor ingresar solo NUMEROS POSITIVOS");
           }
           else{ 
               
               ladoA = Double.parseDouble(args[0]);
               System.out.println( "El Lado a = " + ladoA + " mt");
               ladoL = Double.parseDouble(args[1]);
               System.out.println( "El Lado L = " + ladoL + " mt" );
               anguloTeta = Double.parseDouble(args[2]);
               System.out.println( "El angulo Teta = " + anguloTeta + "°" );
               ladoB = Double.parseDouble(args[3]);
               System.out.println( "El Lado b = " + ladoB + " mt" );
               radio = Double.parseDouble(args[4]);
               System.out.println( "El radio del tanque es= " + radio + " mt" );
               alturaTanque = Double.parseDouble(args[5]);
               System.out.println( "la altura del tanque es= " + alturaTanque + " mt");
               lluvia = Double.parseDouble(args[6]);
               System.out.println( "La lluvia cae a relacion de  " + lluvia + " ml/dm^2 \n" );
             double aTotal=0;
             double aTejado=(ladoA*Math.cos(anguloTeta)*ladoL);
             double aCanal=(ladoB*ladoL);
             double aTanque=(Math.PI* Math.pow(radio, 2));                             
             aTotal=aTejado+aCanal+aTanque;              
             aTotal=aTotal*100;
             double vLluvia=aTotal*lluvia;
             vLluvia=vLluvia/1000000;
             double vTanque=0;
             vTanque=(Math.PI* Math.pow(radio, 2)*alturaTanque);
             double tiempo=0;
             tiempo=vTanque/vLluvia;
             tiempo=tiempo*60;
             tiempo=tiempo*60;
            
             System.out.println("LA RESPUESTA ES:");
             System.out.println( "El tanque se llena en " +  formatearDecimales(tiempo,2)  + " segundos" );
             
                        
               
           
           }

        }
       
   }
   
}