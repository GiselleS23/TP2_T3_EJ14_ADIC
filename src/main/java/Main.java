/* 14.- Calculadora que realice las cuatro operaciones básicas (suma, resta, multiplicación y división). Al comenzar, se presentará un menú principal con cinco opciones: suma, resta, multiplicación, división y salida (para terminar la ejecución). Estas opciones se elegirán mediante un número o una letra indicada en el propio menú. Una vez elegida una de las cuatro primeras opciones, se pedirán dos números -los operandos- y el codigo presentará el resultado de la operación. Una vez realizado esto, el diagrama volverá al menú principal y se podrá realizar una nueva operación, hasta que se utilice la opción de salida. 
Sacchetti Maria Giselle C2 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion;   
    double num1, num2, resultado;
    do{
      
      System.out.println("\nCalculadora");
      System.out.println("1. Suma");
      System.out.println("2. Resta");
      System.out.println("3. Multiplicación");
      System.out.println("4. División");
      System.out.println("5. Salir");
      System.out.print("Ingrese una opción: ");
      opcion = scanner.nextInt();
      
      switch (opcion){
        case 1:
          System.out.print("Ingrese el primer número: ");
          num1 = scanner.nextDouble();
          System.out.print("Ingrese el segundo número: ");
          num2 = scanner.nextDouble();
          
          resultado = num1 + num2;
          System.out.println("El resultado de la suma es: " + resultado);
          break;
        case 2:
          System.out.print("Ingrese el primer número: ");
          num1 = scanner.nextDouble();
          System.out.print("Ingrese el segundo número: ");
          num2 = scanner.nextDouble();
          resultado = num1 - num2;
          System.out.println("El resultado de la resta es: " + resultado);
          break;
        case 3:
          System.out.print("Ingrese el primer número: ");
          num1 = scanner.nextDouble();
          System.out.print("Ingrese el segundo número: ");
          num2 = scanner.nextDouble();
          resultado = num1 * num2;
          System.out.println("El resultado de la multiplicación es: " + resultado);
          break;
        case 4:
          System.out.print("Ingrese el primer número: ");
          num1 = scanner.nextDouble();
          System.out.print("Ingrese el segundo número: ");
          num2 = scanner.nextDouble();
          if (num2 == 0){
            System.out.println("No se puede dividir entre cero");
          }else{
            resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
          }
          break;
        case 5:
          System.out.println("Saliendo de la calculadora...");
          break;
        default:
          System.out.println("Opción inválida");
          break;
          
      }//cierra el switch

    }while(opcion!=5);
    
    scanner.close();
  }
}