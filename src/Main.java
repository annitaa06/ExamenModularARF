import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        char valorU = 0;
        menu(valorU);
    }

    public static void menu(char valorU) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a) Mayores de edad ");
        System.out.println("b) Calculadora de ingresos de Youtube");
        System.out.println("c) Calculo horario");
        System.out.println("d) Salir");
        valorU = sc.next().charAt(0);
        do {
            switch (valorU) {
                case 'a': {
                    System.out.println("MAYORES DE EDAD");

                    ejer2();


                }
                break;
                case 'b': {
                    System.out.println("CALCULADORA DE INGRESOS");
                    ingresosvideo();
                }
                break;
                case 'c': {
                    System.out.println("CALCULO HORARIO");
                    System.out.println("introduce la hora");
                    int horas = sc.nextInt();
                    System.out.println("introduce los minutos");
                    int minutos = sc.nextInt();
                    System.out.println("introduce AM o PM");
                    String tiempo = sc.next();
                    System.out.println("introduce un huso (numero entero entre el -11 y + 12) ");
                    int huso = sc.nextInt();

                    if (horaCierta(horas, minutos, tiempo, huso)) {
                        System.out.println("La hora esta bien escrita");
                    } else {
                        System.out.println("la hora no esta bien escrita");
                    }
                }
                break;
                case 'd': {
                    System.out.println("SALIENDO");
                }
                break;
                default:
                    System.out.println("No es un caracter valido ");

            }
        } while (valorU == 3);

    }

    public static void ejer2() {
        int miembros = 0;
        int contMayorEdad = 0;
        int contMenorEdad = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce cuantos años vas a añadir");
        miembros = sc.nextInt();
        for (int i = 1; i <= miembros; i++) {
            System.out.println("introduce tu año de nacimiento ");
            int ano = sc.nextInt();

            if (ano <= 2005) {
                contMayorEdad++;
            } else {
                contMenorEdad++;
            }
        }

        System.out.println("Hay " + contMayorEdad + " mayores de edad");
    }

    public static void ingresosvideo() {
        int tematica;
        Scanner sc = new Scanner(System.in);
        double ingVideos;
        System.out.println("introduce tus visitas");
        double visitas = sc.nextDouble();
        double porcentaje = 0;
        System.out.println("INTRODUCE TEMATICA, 1. ASMR,2. DEPORTES 3.  ANIMALES 4. TECNOLOGIA 5. BEBES");
        tematica = sc.nextInt();

        switch (tematica) {
            case 1: {
                porcentaje = 0.1;
            }
            case 2: {
                porcentaje = 1.0;
            }
            case 3: {
                porcentaje = 0.2;
            }
            case 4: {
                porcentaje = 0.5;
            }
            case 5: {
                porcentaje = 0.5;
            }
        }
        ingVideos = (tematica * visitas) / 1000;
        System.out.println("tus ingresos de videos son " + ingVideos);


    }

    //public static void ingresosCanal() {

    //}

    public static boolean horaCierta(int horas, int minutos, String tiempo, int huso) {
        return (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60);
    }
//public static int calculoHora() {

        /*if (tiempo == "AM") {
            horas = horas + 3;

        } else {
            if (tiempo == "PM") {
                horas = horas - 3;

            }
        } }*/


}

