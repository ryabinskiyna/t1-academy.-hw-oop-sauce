public class Sauce {

    public enum Spiciness {
        VERY_SPICY("очень острый"), SPICY("острый"), NOT_SPICY("не острый");

        private final String description;

        Spiciness(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    private final String name;
    private final Spiciness spiciness;

    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness;
    }

    public static void main(String[] args) {
        Sauce s1 = new Sauce("Табаско", Spiciness.VERY_SPICY);
        Sauce s2 = new Sauce("Барбекю", Spiciness.NOT_SPICY);

        System.out.println(s1);
        System.out.println(s2);
    }
}
