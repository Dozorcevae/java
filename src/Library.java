public class Library extends Building implements SocialHouse{

    private int booksCount;
    private boolean freeMembership;
    private int readingRooms;

    private boolean openForPublic;

    public int getBooksCount() { return booksCount; }
    public void setBooksCount(int cnt) { this.booksCount = cnt; }

    public boolean isFree() { return freeMembership; }
    public void setFreeMembership(boolean free) { this.freeMembership = free; }

    public int getReadingRooms() { return readingRooms; }
    public void setReadingRooms(int rooms) { this.readingRooms = rooms; }

    public void borrowBooks(int n) { this.booksCount = Math.max(0, this.booksCount - Math.max(0, n)); }
    public void returnBooks(int n) { this.booksCount += Math.max(0, n); }
    public String hostReading(String author) { return "Author reading hosted: " + author;}

    @Override
    public void openForPublic() {this.openForPublic = true; }

    @Override
    public void closeForPublic() { this.openForPublic = false; }

    @Override
    public boolean isOpenForPublic() { return openForPublic; }
    @Override
    public String toString(){
        return "Library{ " +
        "booksCount=" + booksCount +
        ", freeMembership=" + (freeMembership ? "YES" : "NO") + 
        ", readingRooms=" + readingRooms +
        "}" + super.toString();
    }
}
