public class Operators {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 30;


        System.out.println(a+ b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%c);

        System.out.println(++a);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b++);
        System.out.println(b++);
        System.out.println(b);

        System.out.println(100+50);
        System.out.println(a+b);
        System.out.println(300+50);


        int d= 10;
        int e= d;

        //d= d+2;
        d+=2;
        System.out.println(d);

        d-= 3;
        System.out.println(d);


        for (int i = 0; i<=10; i+=2){
        System.out.println(i); }

        for (int i = 10; i>=0; i--){
            System.out.println(i);
        }

        //for (int i= 600; i<=i; i+=2){
           // System.out.println(i);}

        System.out.println(a>b);

        System.out.println(5==5);
        System.out.println(a==b);
        System.out.println(a!=b);

        boolean iLoveJava = false;
        System.out.println(iLoveJava);
        System.out.println(!iLoveJava);

        if (iLoveJava){
            System.out.println("Learn Test Automation");}
        else {
            System.out.println("Still learning");
        }

        System.out.println(d);
        System.out.println(e);

        if (d<10 && e<=10){
            System.out.println("d si e mai mici sau egale cu 10");}
        System.out.println(10*6);
        System.out.println(10/5);
       int x= 1;
        System.out.println(++x);

        int g = 10;
        int h = 11;
        int sum = g+h;
        System.out.println(sum);
        if (sum<=10){
            System.out.println("suma este mai mare decat 10");}
        else System.out.println("suma este mai mica decat 10");

        if (sum %2 == 0){
            System.out.println("suma este numar par");}


        int w = 10;
        int l = 20;
        int y = 30;
        int z = 40;
        System.out.println(w+l+y+z);
        System.out.println(w*l*y*z);
        System.out.println(z/l);

        System.out.println(w++);
        System.out.println(w++);
        System.out.println(w++);
        System.out.println(w);

        System.out.println(l--);
        System.out.println(l--);
        System.out.println(l);

        System.out.println(w+l+y+z);

boolean Sumamaimaredecat100 = false;
boolean Produsulormaimare100 = true;
        System.out.println(w+l+y+z);
        if (x+l+y+z>100){
            Sumamaimaredecat100 = true;

        }
        System.out.println(Sumamaimaredecat100);

        if (x*l*y*z>1000){Produsulormaimare100 = true;}
        else {
            Produsulormaimare100 = false;
        }
        System.out.println(Produsulormaimare100);

        if (Sumamaimaredecat100 || Produsulormaimare100){
            System.out.println("Cel putin una este adevarata");}
        }



        }

