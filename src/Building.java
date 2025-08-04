public abstract class Building{

    private String name;
    private String address;
    private int yearOfConstruction;
    private String architect;
    private boolean culturalMonument;

    Building() { }

    Building(String name, String address, int year, String architect, boolean culturalMonument){
        this.name = name;
        this.address = address;
        this.yearOfConstruction = year;
        this.architect = architect;
        this.culturalMonument = culturalMonument;
    }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public String getAddress(){ return address; }
    public void setAddress(String adress){ this.address = adress; }

    public int getYearOfConstruction(){ return yearOfConstruction; }
    public void setYearOfConstruction(int year){ this.yearOfConstruction = year; }

    public String getArchitect(){ return architect; }
    public void setArchitect(String architect){ this.architect = architect; }

    public boolean isCulturalMonument(){ return culturalMonument; }
    public void setCulturalMonument(boolean culturalMonument){ this.culturalMonument = culturalMonument; }

    @Override
    public String toString(){
        return "Building{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", yearOfConstruction=" + yearOfConstruction +
                ", architect='" + architect + '\'' +
                ", culturalMonument=" + culturalMonument +
                '}';
    }
}