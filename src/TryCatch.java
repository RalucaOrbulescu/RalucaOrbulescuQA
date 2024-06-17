public class TryCatch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            System.out.println(numbers[9]);
        } catch (Exception e) {
            System.out.println("A aparut o eroare");
        }


        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 20; i >= 10; i--) {
            System.out.print(i+" ");}

        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);}

        String fructe[] = {"Mere", "Pere", "Capsuni", "Banane"};
        for (String c : fructe) {
            System.out.println("Imi place sa mananc " + c);}

        int monthNumber=10;
        switch (monthNumber) {case 1:

            System.out.println("Ianuarie"); break;
            case 2:
                System.out.println("Februarie");break;
            case 3:
                System.out.println("Martie");break;
            case 4:
                System.out.println("Aprilie");break;
            case 5:
                System.out.println("Mai");break;
            case 6:
                System.out.println("Iunie");break;
            case 7:
                System.out.println("Iulie");break;
            case 8:
                System.out.println("August");break;
            case 9:
                System.out.println("Septembrie");break;
            case 10:
                System.out.println("Octombrie");break;
            case 11:
                System.out.println("Noiembrie");break;
            case 12:
                System.out.println("Decembrie");break;}

        int temperature = 10;

        if (temperature < 18) {
            System.out.println("prea frig");
        } else if (temperature >= 18 && temperature <= 22) {
            System.out.println("ok");
        } else {
            System.out.println("prea cald");
        }

        char gender = 'm';
        boolean married = true;

        if (gender == 'm'){
            System.out.println("Domnul");}

        else if (gender == 'f') {
            if (married) {
                System.out.println("Doamna");
            }
            else System.out.println("Domnisoara");
        }

        int x= 20;
        int y = 10;
        int z = 3;

        if (x > y) {
            System.out.println(x + " este mai mare decat " + y);
        } else if (x < y) {
            System.out.println(y + " este mai mare decat " + x);
        } else
        {System.out.println("sunt egale");}

            int max=x;
            if (y>max){max=y;}
            if (z>max){max=z;}

            System.out.println("cel mai mare numar dintre cele 3 este " + max);

            char letter = 'm';
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                System.out.println("vocala");}
            else System.out.println("consoana");




        }

    }



