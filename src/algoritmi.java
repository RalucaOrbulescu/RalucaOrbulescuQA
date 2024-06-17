public class algoritmi {
    public static void main(String[] args) {
        int[] numbers = {1, -25, 24, -2, 67, 5};
        for (int n : numbers) {
            System.out.println((n - 1) + " " + (n + 1));
        }

        for (int n : numbers) {
            if (n < 0) {
                System.out.println(n);
            }
        }



        String[] tari = {"Anglia", "România", "Albania", "Franța", "Elveția", "China", "SUA", "Australia"};

        System.out.println("Inițialele țărilor sunt:");
        for (String t : tari) {
            char initial = t.charAt(0);
            System.out.println(initial);
        }


        for (String t : tari) {
            if (t.charAt(0) == 'A') {
                System.out.println(t);
            }
        }

        for (String t : tari){
            System.out.println(t +" Are numar de litere:" + t.length());}

        int maxletters = tari[0].length();
        String taraCuCelMaiLungNume = tari[0];
        for (String t:tari) {
            if (t.length() > maxletters) {
                maxletters = t.length();
                taraCuCelMaiLungNume = t;
               // System.out.println( " Tara cu cel mai lung nume este " + taraCuCelMaiLungNume);
            }

        }
        System.out.println( " Tara cu cel mai lung nume este " + taraCuCelMaiLungNume);
    }
}