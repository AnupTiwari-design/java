package composition;

public class Human {
    private Heart heart; // Composition (Strong Association)

    Human() {
        heart = new Heart(); // Heart is created only when Human is created
    }

    void live() {
        heart.beat();
    }
}
