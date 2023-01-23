package People;

public enum Rank {
//adding string of name allows you to reference the type at a later stage.
    CAPTAIN ("Captain"),
    LEAD ("Lead"),
    FLIGHT_ATTENDANT("Flight Attendant");

    private final String name;

    Rank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
