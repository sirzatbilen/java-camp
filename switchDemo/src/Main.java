public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("mükemmel : geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");

        }

    }
}