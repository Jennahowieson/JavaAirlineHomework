package People;

public class Pilot {
    private String name;
    private Rank rank;
    private String licence;

    public Pilot(String name, Rank rank, String licence){
        this.name = name;
        this.rank = rank;
        this.licence = licence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String flyPlane (){
        return "We're in the air!";
    }
}
