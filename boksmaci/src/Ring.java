import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight = 80;  // Minimum ağırlık 80 kg
    int maxWeight = 130; // Maksimum ağırlık 130 kg

    public Ring(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public void run() {
        if (checkWeight()) {
            boolean f1Starts = new Random().nextBoolean();
            System.out.println("İlk vuruşu yapacak: " + (f1Starts ? f1.name : f2.name));

            while (f1.health > 0 && f2.health > 0) {
                System.out.println("\n======== YENİ ROUND ===========");

                if (f1Starts) {
                    f2.health = f1.hit(f2);
                    if (isWin()) break;

                    f1.health = f2.hit(f1);
                    if (isWin()) break;
                } else {
                    f1.health = f2.hit(f1);
                    if (isWin()) break;

                    f2.health = f1.hit(f2);
                    if (isWin()) break;
                }

                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları 80-130 kg arasında değil!");
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) &&
                (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health <= 0) {
            System.out.println("\nMaçı Kazanan: " + f2.name + "!");
            return true;
        } else if (f2.health <= 0) {
            System.out.println("\nMaçı Kazanan: " + f1.name + "!");
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can: " + f1.health);
        System.out.println(f2.name + " Kalan Can: " + f2.health);
    }
}
