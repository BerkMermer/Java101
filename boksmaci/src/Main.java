public class Main {
    public static void main(String[] args) {
        Fighter Berk = new Fighter("Berk", 15, 100, 85, 20);  // 85 kg (80-130 arası)
        Fighter Mert = new Fighter("Mert", 10, 95, 100, 30);  // 100 kg (80-130 arası)

        Ring ring = new Ring(Berk, Mert);
        ring.run();
    }
}

