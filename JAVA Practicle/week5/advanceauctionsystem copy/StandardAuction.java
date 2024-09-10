package advanceauctionsystem;

public class StandardAuction extends Auction {
    @Override
    protected void initializeAuction() {
        System.out.println("Initializing Standard Auction...");
    }

    @Override
    protected void startBidding() {
        System.out.println("Bidding started for Standard Auction...");
    }

    @Override
    protected void endBidding() {
        System.out.println("Bidding ended for Standard Auction...");
    }

    @Override
    protected void announceWinner() {
        System.out.println("Announcing winner for Standard Auction...");
    }
}
