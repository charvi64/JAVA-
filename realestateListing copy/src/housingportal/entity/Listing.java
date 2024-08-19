package housingportal.entity;
public class Listing {
    private int listingId;
    private String location;
    private double cost;
    private String details;

    public Listing(int listingId, String location, double cost, String details) {
        this.listingId = listingId;
        this.location = location;
        this.cost = cost;
        this.details = details;
    }

    public int getListingId() {
        return listingId;
    }

    public String getLocation() {
        return location;
    }

    public double getCost() {
        return cost;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Listing [ID=" + listingId + ", Location=" + location + ", Cost=" + cost + ", Details=" + details + "]";
    }
}