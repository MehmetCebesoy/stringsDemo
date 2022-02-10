public class Main {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı :" + mesaj.length());
        System.out.println("5. eleman :" + mesaj.charAt(4));
        // concat: birleştirmek
        System.out.println(mesaj.concat(" Yaşasın"));
        System.out.println(mesaj.startsWith("B")); // başlayanın doğru yada yanlış olduğunu kontrol eder
        System.out.println(mesaj.endsWith("l"));  // bitenin ne ile bittiğini kontrol ederek doğruluğunu kontrol eder.
        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
        //(srcBegin: 0, srcEnd:5,karakterler, dstBegin:0); burada sadece rakamları yazarız diğeerlerini default getirir.
        System.out.println(karakterler);
        //indexOf() ilk kaçıncıda olduğunu gösterir '.' veya ".." şeklinde kullanılabiliir.
        System.out.println(mesaj.indexOf('a'));
        // aramaya sağdan başlatmak için aşağıdaki ile bulunur.yine baştan sayar
        System.out.println(mesaj.lastIndexOf('a'));




    }
}
