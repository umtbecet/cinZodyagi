import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int year;
        String horoscope="";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Tarihiniz :");
        year = input.nextInt();

        if (0<year){

            switch (year % 12){
                case 0:
                    horoscope = "Maymun";
                    break;
                case 1:
                    horoscope = "Horoz";
                    break;
                case 2:
                    horoscope = "Köpek";
                    break;
                case 3:
                    horoscope = "Domuz";
                    break;
                case 4:
                    horoscope = "Fare";
                    break;
                case 5:
                    horoscope = "Öküz";
                    break;
                case 6:
                    horoscope = "Kaplan";
                    break;
                case 7:
                    horoscope = "Tavşan";
                    break;
                case 8:
                    horoscope = "Ejderha";
                    break;
                case 9:
                    horoscope = "Yılan";
                    break;
                case 10:
                    horoscope = "At";
                    break;
                case 11:
                    horoscope = "Koyun";
                    break;
            }

        }else{
            isError = true;
        }
        if (isError){
            System.out.println("Hatalı Giriş Yaptınız");
        }else{
            System.out.println("Çin Zodyağı Burcunuz :" + horoscope);
        }

    }
}




















