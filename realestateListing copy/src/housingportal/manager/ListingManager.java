package housingportal.manager;

import housingportal.entity.Listing;

import java.util.ArrayList;
import java.util.List;

public class ListingManager {
    private List<Listing> listings = new ArrayList<>();

    public void addListing(Listing listing) {
        listings.add(listing);
    }

    public List<Listing> findListingsByPriceRange(double minCost, double maxCost) {
        List<Listing> results = new ArrayList<>();
        for (Listing listing : listings) {
            if (listing.getCost() >= minCost && listing.getCost() <= maxCost) {
                results.add(listing);
            }
        }
        return results;
    }

    public List<Listing> getAllListings() {
        return listings;
    }
}
