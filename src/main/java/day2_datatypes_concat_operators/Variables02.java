package day2_datatypes_concat_operators;

public class Variables02 {

    public static void main(String[] args) {
        // non-primitive data types
        // this type of data also class
        // classes are also data type
        // String is a non-primitve data type and also a class
        /*
            Non-primitive Data types:
            Ornegin String class non-primitive bir data type'dir.
            Not 1: Uretilen her bir class ayni zamanda bir "non-primitive" data type dir.
             Bu yuzden "non-primitive" data type'lar sinirsiz sayidadir denilebilir.
            Not 2: Non-primitive data type'larin isimleri buyuk harf ile baslar
            Not 3: Non-primitive'ler icin Java memory'de buyuklugune gore degisen boyutlarda yer ayirir
             */
        String studentName = "Alican";

        /*
        Soru: primitive ve non-primitive data type'lari arasindaki farklar nelerdir? (İnterview sorusu)

        1) "primitive" ler sadece bizim atadigimiz degeri icerir
            "non-primitive" ler bizim atadigimiz degeri ve methodlari icerir
        2) "primitive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar
        3) "primitive" leri Java uretmistir ve 8 tanedir
           "non-primitive" leri Java ve kod yazanlar uretebilir, sinirsiz sayidadir.
        4) "primitive" ler memory'de data type'larina gore sabit boyutta bellek kullanir
           "non-primitive" ler icin Java memory'de buyuklugune gore degisen boyutlarda bellek kullanabilir
        */

        String cityName = "İstanbul";
        System.out.println(cityName);

        cityName = "İzmir";
        System.out.println(cityName);
    }
}
