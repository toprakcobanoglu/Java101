import java.util.Scanner;

public class Pass_Fail {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        Scanner imp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz");
        mat = imp.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fizik = imp.nextInt();

        System.out.println("Turkce notunuzu giriniz : ");
        turkce = imp.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        kimya = imp.nextInt();

        System.out.println("Muzik notunuzu giriniz : ");
        muzik = imp.nextInt();

        if (mat < 0 || mat >100)
        {
            System.out.println("Lutfen gecerli bir not giriniz (0-100)");
        } else if (fizik < 0 || fizik >100) {
            System.out.println("Lutfen gecerli bir not giriniz (0-100)");
        } else if (turkce < 0 || turkce >100) {
            System.out.println("Lutfen gecerli bir not giriniz (0-100)");
        } else if (kimya < 0 || kimya >100) {
            System.out.println("Lutfen gecerli bir not giriniz (0-100)");
        } else if (muzik < 0 || muzik >100) {
            System.out.println("Lutfen gecerli bir not giriniz");
        }


        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55)
        {
            System.out.println("Sinifta kaldiniz !");
        }
        else
        {
            System.out.println("TEBRIKLER sinifi gectiniz !");
        }

        System.out.println("Ortalamaniz : "+avarage);





    }

}
