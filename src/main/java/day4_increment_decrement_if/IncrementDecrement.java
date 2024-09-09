package day4_increment_decrement_if;

public class IncrementDecrement {

    public static void main(String[] args) {

        // ----- Increment
        int a = 5;
        a += 2;
        System.out.println("a = " + a);
        a++;
        System.out.println(a);

        // -------Decrement
        int c = 10;
        c -= 3;
        System.out.println(c);

        // --------carpma
        int d = 6;
        d *= 2;
        System.out.println(d);
        d--;
        System.out.println(d);

        // --------Post Increment (i++), Pre Increment (++i)
        int i = 10;
        int k = i++;
        System.out.println(k);
        System.out.println(i);

        int m = 15;
        int n = ++m;
        System.out.println(n); // print out 16
        System.out.println(m); // print out 16
    }
}

