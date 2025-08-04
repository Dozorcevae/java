public class House extends Building implements LivingHouse {

    private int bathroomsCount;
    private boolean gasSupply;
    private int residents;

    public int getBathroomsCount() { return bathroomsCount; }
    public void setBathroomsCount(int cnt) { this.bathroomsCount = Math.max(0, cnt); }

    public boolean isGasSupply() { return gasSupply; }
    public void setGasSupply(boolean gasSupply) { this.gasSupply = gasSupply; }

    @Override
    public int getResidents() { return residents; }
    public void setResidents(int cnt) { this.residents = Math.max(0, cnt); }

    @Override
    public void moveIn(int n) { this.residents += Math.max(0, n); }

    @Override
    public void moveOut(int n) { this.residents = Math.max(0, this.residents - Math.max(0, n)); }
    public void toggleGas(boolean on) { this.gasSupply = on; }



    @Override
    public String toString() {
        return "House{" +
                "bathroomsCount=" + bathroomsCount +
                ", gasSupply=" + gasSupply +
                ", residents=" + residents +
                "} " + super.toString();
    }

}   
