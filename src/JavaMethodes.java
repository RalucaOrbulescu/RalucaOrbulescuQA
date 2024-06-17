public class JavaMethodes {
    public static void main(String[] args) {
        afiseazaCeva();
        calculeazasuma(10, 5);
        calculeazadiferenta(4, 3);
        metoda1();
        metoda1("Un nume");
        metoda1("Doua nume");
        learningJava();
        learningJava();
        learningJava();
        learning2Code("Java");
        learning2Code("C++");
        aflaNumarulMaiMare(10, 30);
        aflaNumarulMaiMare(40, 20);
        lungimeaCuvantului("Romania");
        lungimeaCuvantului("Laptop");
        VocalasauConsoana("Raluca");
        VocalasauConsoana("Alexandra");
        verificaVarsta(45);
        verificaVarsta(80);
        verificaVarsta(12);
        System.out.println(sum(5, 10));
        System.out.println(concatenateTwoStrings("String A", "String B"));
        System.out.println(aDoualitera("Java"));
        System.out.println(inversulNumarului(35));
        System.out.println(maxim(2, 10));
        System.out.println(nrIntregi(10, 10, 9));
        System.out.println(lungimeaTextului("hello"));
        System.out.println(lungimeaTextului("laptop"));
        System.out.println(inversareString("abcd"));
        afiseazaMesaj();
        System.out.println(estePar(8));
        System.out.println(estePar(-18));
        System.out.println(estePar(9));
        System.out.println(getAnotimp("Martie"));
        System.out.println(getAnotimp("Rodica"));
        System.out.println(nrMaimare(14, 14));
        System.out.println(esteLungimePara("Clas"));
        System.out.println(returneazacaracteledinmijloc("Cascada"));
        System.out.println(returneazacaracteledinmijloc("Muzeul"));
        System.out.println(sumaCifrelor(2134));
        System.out.println(sumaCifrelor(456891011));
        System.out.println(25%5);

        String[] cifre = {"unu", "doi", "trei"};
        System.out.println(cifre[1]);
        for (String c : cifre)
        { System.out.println(c); };

        int a = 5;
        int b = 10;
        int c = 8;
        boolean abc = a>b || c>b || c>a;
        System.out.println(abc);

        int x = 5;
        while (x<10){
            System.out.println(x);
            x+=2; }

    }

    private static void afiseazaCeva() {
        System.out.println("Hello World!");
    }

    private static void calculeazasuma(int x, int y) {
        System.out.println(x + y);
    }

    private static void calculeazadiferenta(int x, int y) {
        System.out.println(x * y);
    }

    private static void metoda1() {
        System.out.println("metoda1");
    }

    private static void metoda1(String nume) {
        System.out.println("metoda1 cu nume");
    }

    private static void metoda1(String nume1, String nume2) {
        System.out.println("Metoda cu doua nume");
    }

    private static void learningJava() {
        System.out.println("It`s easy to learn Java");
    }

    private static void learning2Code(String limbajProgramare) {
        System.out.println("It’s easy to learn " + limbajProgramare);
    }

    private static void aflaNumarulMaiMare(int x, int y) {
        if (x > y) {
            System.out.println("Numarul mai mare este: " + x);
        } else {
            System.out.println("Numarul mai mare este: " + y);
        }
    }

    private static void lungimeaCuvantului(String cuvant) {
        int lungime = cuvant.length();
        System.out.println("Lungimea cuvantului este " + lungime);
    }

    public static void VocalasauConsoana(String cuvant) {
        char primaLitera = cuvant.toLowerCase().charAt(0);

        if (primaLitera == 'a' || primaLitera == 'e' || primaLitera == 'i' || primaLitera == 'o' || primaLitera == 'u') {
            System.out.println(cuvant + " incepe cu vocala");
        } else {
            System.out.println(cuvant + " incepe cu consoana");
        }
    }

    public static void verificaVarsta(int varsta) {
        if (varsta < 18) {
            System.out.println("too young");
        } else if (varsta >= 18 && varsta <= 60) {
            System.out.println("just fine");
        } else if (varsta > 60) {
            System.out.println("too old");
        }
    }

    // metode cu return
    private static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    private static String concatenateTwoStrings(String a, String b) {
        //String concat = a + b;
        return a + b;
    }

    private static char aDoualitera(String cuvant) {
        return cuvant.charAt(1);
    }

    private static int inversulNumarului(int numar) {
        return -numar;
    }

    private static int maxim(int nr1, int nr2) {
        if (nr1 > nr2) {
            return nr1;
        } else {
            return nr2;
        }
    }

    private static double nrIntregi(int a, int b, int c) {
        double medie = (a + b + c) / 3.0;
        return medie;

    }

    private static int lungimeaTextului(String text) {
        return text.length();
    }

    public static String inversareString(String text) {
        StringBuilder invers = new StringBuilder(text);
        invers.reverse();
        return invers.toString();

    }

    public static void afiseazaMesaj() {
        System.out.println("In sfarsit e vreme buna");
    }

    public static boolean estePar(int numar) {
        if (numar % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String getAnotimp(String luna) {
        switch (luna.toLowerCase()) {
            case "martie":
            case "aprilie":
            case "mai":
                return "primavara";
            case "iunie":
            case "iulie":
            case "august":
                return "vara";
            case "septembrie":
            case "octombrie":
            case "noiembrie":
                return "toamna";
            case "decembrie":
            case "ianuarie":
            case "februarie":
                return "iarna";
            default:
                return "unknown";
        }
    }

    public static int nrMaimare(int numar1, int numar2) {
        if (numar1 >= numar2) {
            return numar1;
        } else {
            return numar2;
        }
    }

    public static boolean esteLungimePara(String cuvant) {
        return cuvant.length() % 2 == 0;
    }

    public static String returneazacaracteledinmijloc(String cuvant){
        String mijloc;
        int lungime = cuvant.length();
        //nr litere impart
        if (lungime%2!=0){
           mijloc = cuvant.substring(lungime/2, lungime/2 +1);}
        else mijloc = cuvant.substring(lungime/2-1 ,lungime/2+1);
        return mijloc;
    }
   public static int sumaCifrelor(int numar) {
       int suma = 0;
       while (numar != 0) {
           suma += numar % 10; // Adaugăm ultima cifră la suma
           numar /= 10; // Eliminăm ultima cifră
       }
       return suma;


   }
    }







