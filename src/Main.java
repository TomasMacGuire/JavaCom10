import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Alt+Intro with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.

public class Main {
    static Scanner ingreso = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = -1;
        Scanner ingreso = new Scanner(System.in);

        while (opcion!=0){
            menu();
            System.out.println("Ingrese una opcion ... ");
            opcion = ingreso.nextInt();
            System.out.printf("\n");
            switch (opcion){
                case 1:
                    ej1();
                    break;
                case 2:
                    ej2();
                    break;
                case 3:
                    ej3();
                    break;
                case 4:
                    ej4();
                    break;
                case 5:
                    ej5();
                    break;
                case 6:
                    ej6();
                    break;
                case 7:
                    ej7();
                    break;
                case 8:
                    ej8();
                    break;
                case 9:
                    ej9();
                    break;
                case 10:
                    ej10();
                    break;
                case 11:
                    ej11();
                    break;
                case 12:
                    ej12();
                    break;
                case 13:
                    ej13();
                    break;
                case 14:
                    ej14();
                    break;
                case 15:
                    ej15();
                    break;
                case 16:
                    ej16();
                    break;
                case 17:
                    ej17();
                    break;
                case 18:
                    ej18();
                    break;
                case 20:
                    string();
                    break;
            }

        }

    }

    private static void menu(){
        System.out.println("\n------MENU DE OPCIONES------\n");
        System.out.println("1 - Ejercicio 1");
        System.out.println("2 - Ejercicio 2");
        System.out.println("3 - Ejercicio 3");
        System.out.println("4 - Ejercicio 4");
        System.out.println("5 - Ejercicio 5");
        System.out.println("6 - Ejercicio 6");
        System.out.println("7 - Ejercicio 7");
        System.out.println("8 - Ejercicio 8");
        System.out.println("9 - Ejercicio 9");
        System.out.println("10 - Ejercicio 10");
        System.out.println("12 - Ejercicio 12");
        System.out.println("13 - Ejercicio 13");
        System.out.println("14 - Ejercicio 14");
        System.out.println("15 - Ejercicio 15");
        System.out.println("16 - Ejercicio 16");
        System.out.println("17 - Ejercicio 17");
        System.out.println("18 - Ejercicio 18");
        System.out.println("20 - Practica String");
        System.out.println("");
        System.out.println("0 para salir");
        System.out.println("----------------------------");
    }

    private static void ej1(){

        int numN;
        double numA;
        char numC;
        double suma;
        double resta;
        int caracter;

        System.out.println("---EJERCICIO 1 ---");


        System.out.println("Ingrese un numero entero: ");
        numN = ingreso.nextInt();
        System.out.println("Ingrese un numero decimal: ");
        numA = ingreso.nextDouble();
        System.out.println("Ingrese un caracter: ");
        numC = ingreso.next().charAt(0);

        System.out.println("El entero ingresado es: " + numN);
        System.out.println("El decimal ingresado es: " + numA);
        System.out.println("El caracter ingresado es: " + numC);

        suma = numA+numN;
        resta = numA-numN;
        caracter = numC;

        System.out.println("La sumatoria de el numero entero y el numero decimal es de: " + suma);
        System.out.println("La resta del numero decimal y el numero entero es de: " + resta);
        System.out.printf("El codigo ASCII del caracter es %d\n", caracter);

    }
    private static void ej2(){
        int nroX = 5;
        int nroY = 3;
        double nroN = 2.5;
        double nroM = 1.2;

        double operacion;
        int contador;

        System.out.println("---EJERCICIO 2---");

        for(contador = 0 ; contador<4; contador++){
            if(contador == 0){
                operacion = nroX +nroY;
                System.out.println("OPERACION: 5 + 3 = " + operacion);
            }
            if(contador == 1){
                operacion = nroX - nroM;
                System.out.println("OPERACION: 5 - 1.2 = " + operacion);
            }
            if(contador == 2){
                operacion = nroX / nroN;
                System.out.println("OPERACION: 5 / 2.5 = " + operacion);
            }
            if(contador == 3){
                operacion = nroN * nroY;
                System.out.println("OPERACION: 2.5 x 3 = " + operacion );
            }

        }
    }

    private static void ej3(){
        int numN;
        int suma;
        int resta;
        int doble;

        System.out.println("---EJERCICIO 3---");

        System.out.println("Ingrese un numero: ");
        numN = ingreso.nextInt();
        suma = numN + 77;
        resta = numN - 3;
        doble = numN * 2;

        System.out.printf("El numero %d + 77 da un total de = %d\n", numN,suma);
        System.out.printf("El numero %d - 3 da un total de = %d\n", numN,resta);
        System.out.printf("El numero %d multiplicado por 2 da un total de = %d\n", numN,doble);

    }

    private static void ej4(){
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux1;


        System.out.println("---EJERCICIO 4---");
        System.out.printf("VALORES INICIALES:\nA : %d\nB : %d\nC : %d\nD : %d\n",A,B,C,D);

        aux1 = B;
        B = C;
        C = A;
        A = D;
        D = aux1;

        System.out.printf("VALORES LUEGO DEL CAMBIO:\nA : %d\nB : %d\nC : %d\nD : %d\n",A,B,C,D);

    }

    private static void ej5(){
        int a;

        System.out.println("---EJERCICIO 5---");
        System.out.println("Ingrese un numero: ");
        a = ingreso.nextInt();

        if(a%2 == 0){
            System.out.println("El numero ingresado es par");
        }else {
            System.out.println("El numero ingresado es impar");
        }

    }

    private  static void ej6(){
        int b;

        System.out.println("---EJERCICIO 6---");
        System.out.println("Ingrese un numero: ");
        b = ingreso.nextInt();
        if(b>0){
            System.out.println("El numero ingresado es positivo");
        } else if (b<0) {
            System.out.println("El numero ingresado es negativo");
        }else {
            System.out.println("El numero es 0");
        }

    }
    private  static void ej7(){
        char c;
        int caracter;

        System.out.println("---EJERCICIO 7---");
        System.out.println("Ingrese un caracter: ");
        c = ingreso.next().charAt(0);
        caracter = c;
        System.out.println("El codigo ASCII del caracter ingresado es : " + caracter);
    }

    private  static void string(){
        String name = "Pepe"; // con CTRL se ve lo que hace la clase -- name. para funciones de String
        int[] arreglo = new int[20]; // el arreglo se asinga al momento de declarar la variable , luego el malloc para crear la dimension del arreglo
        char[] string = new char[30];
        arreglo[5] = 48956;

        for (int i=0; i<arreglo.length ; i++){
            System.out.println(arreglo[i]);
        }
        System.out.printf("\n");
        Arrays.sort(arreglo); // para ordenar el arreglo

        for (int i : arreglo){ // funciona igual que el for normal
            System.out.println(i);
        }

        System.out.println(Arrays.toString(arreglo)); // convierte el array en un string y lo muestra en pantalla
    }

    private  static void ej8(){
        int b;

        System.out.println("---EJERCICIO 8---");
        System.out.println("Ingrese un numero: ");
        b = ingreso.nextInt();

        System.out.println("El numero ingresado es: ");
        if(b>0){
            System.out.println("- POSITIVO");
        } else if (b<0) {
            System.out.println("- NEGATIVO");
        }else {
            System.out.println("- NULO");
        }

        if (b%2 == 0){
            System.out.println("- PAR");
        }else {
            System.out.println("- IMPAR");
        }

        if (b%5 == 0){
            System.out.println("- MULTIPLO DE 5");
        }else {
            System.out.println("- NO ES MULTIPLO DE 5");
        }

        if (b%10 == 0){
            System.out.println("- MULTIPLO DE 10");
        }else {
            System.out.println("- NO ES MULTIPLO DE 10");
        }

        if(b<100){
            System.out.println("- MENOR QUE 100");
        }else {
            System.out.println("- MAYOR QUE 100");
        }

    }

    private static void ej9(){
        String name;

        System.out.println("Ingrese un nombre: ");
        name = ingreso.nextLine();
        System.out.println("Buenos dias, " + name);

    }
    private static void  ej10(){
        double radio;
        double longitud;
        double area;

        System.out.println("Ingrese el radio de una circunferencia: ");
        radio = ingreso.nextDouble();

        longitud = 2 * 3.14 * radio;
        area = 3.14 * (radio * radio);

        System.out.printf("La longitud de la circunferencia es de %.2f y el area es de %.2f", longitud,area);

    }

    private  static void ej11(){
        double vel;
        double pasoVel;

        System.out.println("Ingrese una velocidad en Km/h");
        vel = ingreso.nextDouble();

        pasoVel = (vel * 1000) / 3600;

        System.out.println("La velocidad ingresada en metros por segundo es de " + pasoVel);

    }

    private static void ej12(){
        double cat1;
        double cat2;
        double hip;

        System.out.println("Ingrese la longitud de un cateto de un triangulo:");
        cat1 = ingreso.nextDouble();
        System.out.println("Ingrese la longitud del otro cateto:");
        cat2 = ingreso.nextDouble();

        hip = sqrt((cat1*cat1) + (cat2*cat2));

        System.out.println("La hipotenusa del triangulo es de: " + hip);


    }

    private  static void ej13(){
        double radio;
        double vol;

        System.out.println("Ingrese el radio de una esfera: ");
        radio = ingreso.nextDouble();

        vol = 4/3 * 3.14 * pow(radio,3);

        System.out.println("El volumen de la esfera es: " + vol);
    }

    private static void ej14(){
        int num;
        int primerCifra;
        double segCifra;
        double terCifra;

        System.out.println("Ingrese un entero de 3 cifras: ");
        num = ingreso.nextInt();

        primerCifra = num/100;
        segCifra = (num/10)%10;
        terCifra = num%10;

        System.out.println(""+primerCifra);
        System.out.println(""+segCifra);
        System.out.println(""+terCifra);
    }

    private static void ej15(){
        int num;
        System.out.println("Ingrese un entero de 5 cifras: ");

        num = ingreso.nextInt();
        String numStr = Integer.toString(num);

        for (int i = 0; i < numStr.length(); i++) {
            if (i % 2 == 0) {
                System.out.println(numStr.charAt(i));
            }
        }
    }

    private static  void ej16(){
        int H;
        int M;
        int S;

        System.out.println("Ingrese una hora:");
        H = ingreso.nextInt();
        while (H>23 || H<0){
            System.out.println("ERROR: Hora ingresada invalida");
            H = ingreso.nextInt();
        }
        System.out.println("Ingrese los minutos: ");
        M = ingreso.nextInt();
        while (M<0 || M>59){
            System.out.println("ERROR: Minutos ingresados invalidos");
            M = ingreso.nextInt();
        }
        System.out.println("Ingrese los segundos");
        S = ingreso.nextInt();
        while (S<0 || S>59){
            System.out.println("ERROR: Segundos ingresados invalidos:");
            S= ingreso.nextInt();
        }

        System.out.printf("HORA INGRESADA: %d : %d : %d", H,M,S);

        }
        private static void ej17(){
            String name;
            int age;
            double sal;

            System.out.println("Ingrese el nombre del trabajador: ");
            name = ingreso.nextLine();
            System.out.println("Ingrese la edad: ");
            age = ingreso.nextInt();
            System.out.println("Ingrese el salario: ");
            sal = ingreso.nextDouble();

            if (age > 15){
                if (age > 18 && age <51){
                    sal = sal + (sal * 0.05);
                }
                if (age>50 && age<61){
                    sal = sal +(sal * 0.1);
                }
                if (age>60){
                    sal = sal + ( sal*0.15);
                }
                System.out.println("El salario del trabajador es de : " + sal);
            }else{
                System.out.println("ERROR: El trabajador no tiene edad para trabajar");
            }

        }

        private static void ej18(){
            double peso;
            double altura;
            double rango;

            System.out.println("Ingrese su peso: ");
            peso = ingreso.nextDouble();
            System.out.println("Ingrese su altura: ");
            altura = ingreso.nextDouble();

            rango = peso / pow(altura,2);

            System.out.println("El rango saludable de la persona es de: "+rango);

        }
        
}
