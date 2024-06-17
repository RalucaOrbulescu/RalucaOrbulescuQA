import java.util.Locale;

public class Exercitii {
    public static void main(String[] args) {

        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";
        String myOtherText = "1a2b3c";

        byte myBite = 100;
        int myInt = myBite;
        System.out.println(myInt);

        float myFloat = 7.7f;
        int myInt1 = (int)myFloat;
        System.out.println(myInt1);

        String tara = "Romania";
        int lungime = tara.length();
        System.out.println(lungime);


       int[] numbers = {2,4,6,8};
        System.out.println(numbers[1]);
        System.out.println(numbers[3]);
        System.out.println(numbers.length);


        float myFloat2 = 4.4f;
        float myFloat1 = 4.5f;
        System.out.println((int)myFloat1 + (int)myFloat2);
        System.out.println((int)myFloat1 - (int) myFloat2);
        System.out.println((int)myFloat1 * (int) myFloat2);

        String myFavoriteMovie = "filmul meu preferat este 'Game of Thrones'";
        System.out.println(myFavoriteMovie);

        String mare = myFavoriteMovie.toUpperCase(Locale.ROOT);
        System.out.println(mare);
        String mic = myFavoriteMovie.toLowerCase();
        System.out.println(mic);
        int propozitie = myFavoriteMovie.length();
        System.out.println(propozitie);

        char[] myChar = {'a','b','c','d'};
        System.out.println(myChar[0]);
        System.out.println(myChar[1]);
        System.out.println(myChar[3]);

        for (int i = 0; i< myChar.length; i++){
            System.out.println(myChar[i]);
        }



    }
}

