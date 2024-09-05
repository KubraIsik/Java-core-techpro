package day2_datatypes_concat_operators;

public class Variables01 {

    public static void main(String[] args) {

        long numberOfCells = 12344320394L;
        System.out.println(numberOfCells);

        float sockPrice1 = 12.99f, shirtPrice1 = 25.99f;
        System.out.println("Total Price1: " + (sockPrice1 + shirtPrice1));

        double cellWeight = 0.000000000028;
        System.out.println("cellWeight = " + cellWeight);

        char firstLetterofName = 'K';
        boolean isFirstLetter = false;

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = true;

        System.out.println("--------------------");
        System.out.println(b1 && b2);
        System.out.println(b2 || b4);
        System.out.println(b2 || b3);
        System.out.println(b2 && b3);

        System.out.print("no new line after this line");
        System.out.print(" yes");





    }
}
