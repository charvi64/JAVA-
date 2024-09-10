package advanceauctionsystem;

public class Client {
    public static void main(String[] args) {
        // Creating a Standard Auction
        Auction standardAuction = new StandardAuction();

        // Creating Bidders
        Observer bidder1 = new Bidder("Bidder 1");
        Observer bidder2 = new Bidder("Bidder 2");
        Observer bidder3 = new Bidder("Bidder 3");

        // Registering Bidders to the Auction
        standardAuction.registerBidder(bidder1);
        standardAuction.registerBidder(bidder2);
        standardAuction.registerBidder(bidder3);

        // Conducting the Auction
        standardAuction.conductAuction();

        // Creating a Reserve Auction
        Auction reserveAuction = new ReserveAuction();

        // Registering Bidders to the Auction
        reserveAuction.registerBidder(bidder1);
        reserveAuction.registerBidder(bidder3);

        // Conducting the Auction
        reserveAuction.conductAuction();
    }
}

