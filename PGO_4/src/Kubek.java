import java.awt.*;

public class Kubek {

    private String material;
    private int pojemnosc;
    private Color color;
    private String nadruk;


    Kubek(String material){
        this.material=material;

    }
    Kubek(String material, int pojemnosc, Color color){
        this.material=material;
        this.pojemnosc=pojemnosc;
        this.color=color;
    }
    Kubek(String material, int pojemnosc, String nadruk){
        this.material=material;
        this.pojemnosc=pojemnosc;
        this.nadruk=nadruk;
    }
    Kubek(String material, int pojemnosc, Color color, String nadruk){
        this.material=material;
        this.pojemnosc=pojemnosc;
        this.color=color;
        this.nadruk=nadruk;

    }

    //ZADANIE_4 ===============================================================

    Kubek(){
        this("material z this", 3, Color.BLUE, "nadruk z this");

    }
    Kubek(Color color){
        this("kolejny_material",2,color, "nadruk123");

    }
    Kubek(String material, String nadruk){
        this(material, 1, new Color(123,23,1), nadruk);
    }
    Kubek(int pojemnosc, Color color, String nadruk){
        this("asdasd");
        this.pojemnosc=pojemnosc;
        this.color=color;
        this.nadruk=nadruk;
    }


    @Override
    public String toString(){
        return "Materiał: " + material + " ,pojemnosc: " + pojemnosc + " ,kolor: " + color + " ,nadruk: " + nadruk;
    }

}
