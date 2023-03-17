import jdk.jshell.Snippet;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Run();
    }
    public static void Menu(){
        System.out.println("======================");
        System.out.println("=====Kalkulator=======");
        System.out.println("======================");
        System.out.println("\t\t\t1. Suma" +
                "\n\t\t\t2. Różnica" +
                "\n\t\t\t3. Iloczyn" +
                "\n\t\t\t4. Iloraz" +
                "\n\t\t\t5. Potega" +
                "\n\t\t\t6. Pierwiastek" +
                "\n\t\t\t7. Funkcje trygonometryczne(sin,cos,tg,ctg)" +
                "\n\t\t\t8. Wyjscie");
        System.out.println("\t\t\t----------------------------------------");
        System.out.println("\t\t\tWybierz operacje:");

    }

    public static void Run(){
        int wybor;
        while (true){
            Menu();
            wybor=InputInt();
            switch (wybor){
                case 1->metoda_dodawanie();
                case 2->metoda_odejmowanie();
                case 3->metoda_iloczyn();
                case 4-> metoda_iloraz();
                case 5-> metoda_potegowanie();
                case 6->metoda_pierwiastowanie();
                case 7-> metoda_funkcje_trygonometryczne();
                case 8 ->Close();

                default->Error();

            }

        }
    }
    public static void metoda_dodawanie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj dwie liczby:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = a + b;
        System.out.println("Wynik: " + result);

    }
    public static void metoda_odejmowanie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj dwie liczby:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = a - b;
        System.out.println("Wynik: " + result);

    }
    public static void metoda_iloczyn() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj dwie liczby:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = a * b;
        System.out.println("Wynik: " + result);

    }

    public static void metoda_iloraz() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj dwie liczby:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = a / b;
        System.out.println("Wynik: " + result);

    }
    public static void metoda_potegowanie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj podstawe potęgi i wykładnik potęgi:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = Math.pow(a,b);
        System.out.println("Wynik: " + result);

    }
    public static void metoda_pierwiastowanie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę którą chesz spierwiastkować:");
        double a = sc.nextDouble();


        double result = Math.sqrt(a);
        System.out.println("Wynik: " + result);

    }

    public static void metoda_funkcje_trygonometryczne() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj kąt w radianach:");
        double x = sc.nextDouble();

        double sinx = Math.sin(x);
        double cosx = Math.cos(x);
        double tanx = Math.tan(x);
        double cotx = 1 / Math.tan(x);
        double secx = 1 / Math.cos(x);
        double cscx = 1 / Math.sin(x);

        System.out.println("sin(" + x + ") = " + sinx);
        System.out.println("cos(" + x + ") = " + cosx);
        System.out.println("tan(" + x + ") = " + tanx);
        System.out.println("cot(" + x + ") = " + cotx);
        System.out.println("sec(" + x + ") = " + secx);
        System.out.println("csc(" + x + ") = " + cscx);

    }
    public static void metoda1(){

    }
    public static void Error(){
        System.out.println("Bledne dane koniec programu");
        System.exit(0);
    }

    public static int InputInt(){
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }

    public static void Close(){
        System.out.println("\t\t\tCzy na pewno chcesz wyjsc t || T");
        String znak = InputString();
        String st1="t";
        String st2="T";
        if (znak.equals(st1) || znak.equals(st2)) System.exit(0);
    }
    public static String InputString(){
        Scanner input = new Scanner(System.in);
        String znak = input.nextLine();
        return znak;
    }






}