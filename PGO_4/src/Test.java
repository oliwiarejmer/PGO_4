import java.awt.*;

public class Test {

    public static void main(String [] args){

        Zadanie1 zadanie = new Zadanie1();


        String phrase1 = "zadanie";
        String phrase2 = "asdfghjkl";

        System.out.println("Zadanie 1");

        System.out.print("Dla 1 słowa: " + phrase1 +" -> " );
        zadanie.wypisz(phrase1);

        System.out.print("Dla 2ch słów: " + phrase1 + " i " + phrase2 + " -> " );
        zadanie.wypisz(phrase1, phrase2);


        Zadanie2 zadanie2 = new Zadanie2();
        System.out.println('\n'+"Metoda dodaj z 2 parametrami "+ " wynik -> "+zadanie2.dodaj(2,3));
        System.out.println("Metoda dodaj z 3 parametrami "+" wynik -> "+zadanie2.dodaj(4L,5L,6L));
        System.out.println("Metoda dodaj z 4 parametrami" + " wynik -> "+zadanie2.dodaj(7,9,12L,15L));

        Kubek combination1 = new Kubek();
        Kubek combination2 = new Kubek(new Color(12,123,222));
        Kubek combination3 = new Kubek("porcelana", "pgo" );
        Kubek combination4 = new Kubek(1,new Color(12,12,12),"java");

        System.out.println('\n'+"Pierwsza kombinacja kubka -> " +combination1);
        System.out.println("Druga kombinacja kubka -> " +combination2);
        System.out.println("Trzecia kombinacja kubka -> " +combination3);
        System.out.println("Czwarta kombinacja kubka -> " +combination4);

    }

}
