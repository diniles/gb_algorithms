package seminar3;

public class Band {
    private final String bandName;
    private final int formedDate;

    public Band(String bandName, int date) {
        this.bandName = bandName;
        this.formedDate = date;
    }

    @Override
    public String toString() {
        return "{" +
                "bandName='" + bandName + '\'' +
                ", formedDate=" + formedDate +
                '}';
    }
}
