public class IfClass {
    public static void main(String[] args) {
        int time = 88;
        if (time > 24 ||time<0) {
            System.out.println("inncorect time");
        } else if (time > 18) {
            System.out.println("Good evening");
        } else if (time>12) {
            System.out.println("Good day");

        } else System.out.println("Good morning");



        int dayNumber=9;
        switch (dayNumber){case 1:
            System.out.println("Luni"); break;
            case 2:
                System.out.println("Marti");break;
            case 3:
                System.out.println("Miercuri");break;
            case 4:
                System.out.println("Joi");break;
            case 5:
                System.out.println("Vineri");break;
            case 6:
                System.out.println("Sambata");break;
            case 7:
                System.out.println("Duminica");break;
            default:
                System.out.println("Ziua nu este valida");}

    }
}

