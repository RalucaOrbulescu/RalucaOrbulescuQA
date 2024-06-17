public class MyString {
    public static void main(String[] args) {
        String text = "Hello";
        System.out.println(text
        );
        String nume = " Raluca";
        System.out.println(text + nume);

        String numeMare = nume.toUpperCase();
        System.out.println(numeMare);
         String numeMic = nume.toLowerCase();
        System.out.println(numeMic);

        String propozitie = "Ana are mere";
        int lungime = propozitie.length();
        System.out.println(lungime);
        System.out.println(propozitie.length());

        char primalitera = propozitie.charAt(0);
        System.out.println(primalitera);
        char a6alitera = propozitie.charAt(5);
        System.out.println(a6alitera);
        System.out.println(a6alitera+ primalitera);

        String filmulPreferat = "Filmul meu preferat este \n'Game of thrones'";
        System.out.println(filmulPreferat);


    }
}
