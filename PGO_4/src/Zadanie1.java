public class Zadanie1 {

    Zadanie1(){
    }


    public void wypisz(String phrase){
        System.out.println(phrase.substring(0,1)+
                phrase.substring(phrase.length()-1));
    }


    public void wypisz(String phrase1, String phrase2){
        System.out.println(phrase1.substring(0,1) + phrase2.substring(phrase2.length()-1));

    }


}
