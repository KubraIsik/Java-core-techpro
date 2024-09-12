package day4_increment_decrement_if;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {
        /*Ornek 6: Yeni Satir Karakteri ('\n') Hatasi:
        Ardışık olarak birden fazla Scanner objesiyle bilgi
        toplarken bazı girdilerin atlanması, genellikle Scanner'ın girdi akışını nasıl işlediğiyle ilgilidir.
        Bu durum, özellikle nextInt(), nextDouble() gibi sayısal girdi alan metodlardan sonra nextLine() metodunu
        kullanırken yaygın olarak karşılaşılır.*/

        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı giriniz: ");
        int age = input.nextInt();

        input.nextLine(); // Kullanılmayan yeni satır karakterini okuyup atar.

        System.out.print("Adınızı giriniz: ");
        String name = input.nextLine();

        // 18. satırda neden böyle boş bir line okuma ekledik?
        //Aciklama: Bu kodda, nextInt() çağrısından sonra nextLine() hemen çağrılır.
        // Ancak, kullanıcının yaşını girdikten sonra Enter tuşuna basmasıyla oluşan
        // yeni satır karakteri (\n) girdi akışında kalır. nextInt() yalnızca sayısal değeri okur
        // ve yeni satır karakterini okumaz(akista kalir). Bu yüzden, program nextLine()’a ulaştığında,
        // hâlâ okunmamış bir yeni satır karakteri bulur ve bunu boş bir satır olarak yorumlar,
        // böylece kullanıcıdan adını almak için beklemeksizin hemen ilerler.

        /*Bu sorunu çözmenin yaygın bir yolu, sayısal girdi aldıktan sonra bir nextLine() çağrısı
        ekleyerek kalan yeni satır karakterini temizlemektir*/

    }
}
