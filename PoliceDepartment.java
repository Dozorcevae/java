public class PoliceDepartment extends Building implements SocialHouse {
    
    private String precinctName;
    private int officers;
    private int openCases;

    private boolean openForPublic;
    
    public String getPrecinctName(){ return precinctName; }
    public void setPrecinctName(String name){this.precinctName = name;}

    public int getOfficers() { return officers; }
    public void setOfficers(int officers) { this.officers = Math.max(0, officers); }

    public int getOpenCases() { return openCases; }
    public void setOpenCases(int openCases) { this.openCases = Math.max(0, openCases); }

    public void fileReport() { this.openCases++; }
    public String dispatchPatrol(String location) {
        return "Patrol dispatched to " + location + ".";
    }
    public void closeCase(){this.openCases = Math.max(0, this.openCases - 1); }

    @Override
    public void openForPublic() { this.openForPublic = true; }

    @Override
    public void closeForPublic() { this.openForPublic = false; }

    @Override
    public boolean isOpenForPublic() { return openForPublic; }

    @Override
    public String toString() {
        return "PoliceDepartment{" +
                "precinctName='" + precinctName + '\'' +
                ", officers=" + officers +
                ", openCases=" + openCases +
                ", openToPublic=" + openForPublic +
                "} " + super.toString();
    }

}
