package seminar3;

public class Band {
    private String bandName;
    private int formedDate;

    public Band(String bandName, int date) {
        this.bandName = bandName;
        this.formedDate = date;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getFormedDate() {
        return formedDate;
    }

    public void setFormedDate(int formedDate) {
        this.formedDate = formedDate;
    }

    @Override
    public String toString() {
        return "Band{" +
                "bandName='" + bandName + '\'' +
                ", formedDate=" + formedDate +
                '}';
    }
}
