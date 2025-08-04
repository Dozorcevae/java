public class ShoppingCenter extends Building implements SocialHouse{
    
    private boolean foodCourt;
    private int parkingPlaces;
    private int shopCount;

    private boolean openForPublic;
    
    public boolean isFoodcourt() { return foodCourt; }
    public void setFoodCourt(boolean food) { this.foodCourt = food; }

    public int getParkingPlaces() { return parkingPlaces; }
    public void setParkingSpaces(int parking) { this.parkingPlaces = parking; }

    public int getShopCount() { return shopCount;}
    public void setShopCount(int cnt) { this.shopCount = cnt; }

    public void openShop(){ this.shopCount++; }
    public void closeShop() {this.shopCount = Math.max(0, this.shopCount - 1);}
    public boolean canPark(int cars) {return cars <= parkingPlaces;}

    @Override
    public void openForPublic() { this.openForPublic = true; }

    @Override
    public void closeForPublic() { this.openForPublic = false; }

    @Override
    public boolean isOpenForPublic() { return openForPublic; }

    @Override
    public String toString(){
        return "ShoppingCenter{ " +
        "foodCourt=" + (foodCourt ? "YES" : "NO") + 
        ", parkingPlaces=" + parkingPlaces +
        ", shopCount=" + shopCount +
        "}" + super.toString();
    }


}
