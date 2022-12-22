package java101.oop.Boxing_Game;

public class Main {
    public static void main(String[] args) {
        Fighter joe = new Fighter("Joe", 15, 100, 90, 30);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 20);
        Ring r = new Ring(joe, alex, 90, 100);
        r.run();
    }
}
