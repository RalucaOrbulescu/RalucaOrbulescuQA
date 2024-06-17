public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            if (i==4){continue;}
            System.out.println("i= " + 1);
        }

        String cars[] = {"BMW", "Elbons 4zen", "Dacia", "Fiat"};
        for (String c : cars) {
            System.out.println("Azi vreau sa conduc un " + c);

            if (c == "Elbons 4zen") {
                continue;
                // System.out.println("Azi vreau sa conduc un " + c);
                //  System.out.println("dar mai bine conduce Catalin"); break;
            }
            System.out.println("Azi vreau sa conduc "+ c); }



        int i=0;
        while (i<5){
            if (i==3){break;}
            System.out.println("i = "+i);
            i++;
        }

        int j = 6;
        do {
            System.out.println("j="+j);
            j++;
        }
        while (j<5);
        }
    }
