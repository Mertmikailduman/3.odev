
public class Main {
    public static void main(String[] args) {
        double vize1 = 60;
        double vize2 = 80;
        double final1 = 70;

        double ortalama = vize1 * 0.25 + vize2 * 0.25 + final1 * 0.50;

        System.out.println("Ortalama: " + ortalama);

        if (ortalama < 50) {
            System.out.println("Kaldin");
        } else if (ortalama >= 50 && ortalama < 75) {
            System.out.println("Gectin");
        } else if (ortalama >= 75 && ortalama < 85) {
            System.out.println("Tesekkur belgesi aldin");
        } else {
            System.out.println("Takdir belgesi aldin");
        }
    }
}
