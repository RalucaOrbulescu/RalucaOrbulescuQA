public class DataTypes {

    public static void main(String[] args) {
        boolean myBoolean = true;
        boolean myBoolean2 = myBoolean;
        myBoolean = false;

        System.out.println(myBoolean);
        System.out.println(myBoolean2);

        char myChar = 'a';
        System.out.println(myChar);

        byte myByte = 100;
        System.out.println(myByte);

        short myShort = 10000;
        System.out.println(myShort);

        System.out.println(myShort + myByte);

        int myInt = 1000000;
        System.out.println(myInt);

        float myFloat = 5.5f;
        System.out.println(myFloat);

        double myDouble = 23.547655466584;
        System.out.println(myDouble);
        System.out.println(myDouble+myFloat);

        //casting implicit
        int x = 5;
        double y = x;
        System.out.println(y);

        int z = 5;
        System.out.println(z);


    }


}
