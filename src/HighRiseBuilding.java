public class HighRiseBuilding extends Building implements SocialHouse, LivingHouse{

    private int floorCount;
    private boolean hasElevator;
    private int occupiedFloors;

    private boolean openForPublic;
    private int residents;

    public int getFloorCount() { return floorCount; }
    public void setFloorCount(int floors) { this.floorCount = floors; }

    public boolean hasElevator() { return hasElevator; }
    public void setHasElevator(boolean elevator) { this.hasElevator = elevator; }

    public int getOccupiedFloors() { return occupiedFloors; }
    public void setOccupiedFloors(int n) { this.occupiedFloors = n; }

    public int getResidents() { return this.residents; }
    public int setResidents(int n) { return this.residents = Math.max(0, n); }

    public String callElevator(int floor){

        if(!hasElevator) return "Building has no elevator.";

        if (floor < 1 || floor > floorCount) return "Invalid floor.";

        return "Elevator is coming on floor " + floor;

    }

    public String performFireDrill() { return "Fire drill perfomed for all floors"; }
    public String openObservationDeck() { return "Observation desk opend"; }

    @Override
    public void openForPublic() { this.openForPublic = true;}

    @Override
    public void closeForPublic() { this.openForPublic = false;}

    @Override
    public boolean isOpenForPublic() { return openForPublic; }

    @Override
    public void moveIn(int n) { this.residents += Math.max(0, n); }

    @Override
    public void moveOut(int n) { this.residents = Math.max(0, this.residents - Math.max(0, n));}
    @Override
    public String toString() {
        return "HighRiseBuilding{" +
                "floorCount=" + floorCount +
                ", hasElevator=" + hasElevator +
                ", occupiedFloors=" + occupiedFloors +
                "} " + super.toString();
    }
}