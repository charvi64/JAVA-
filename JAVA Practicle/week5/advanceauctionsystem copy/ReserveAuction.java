package advanceauctionsystem;

public class ReserveAuction extends Auction {
    @Override
    protected void initializeAuction() {
        System.out.println("Initializing Reserve Auction...");
    }

    @Override
    protected void startBidding() {
        System.out.println("Bidding started for Reserve Auction...");
    }

    @Override
    protected void endBidding() {
        System.out.println("Bidding ended for Reserve Auction...");
    }

    @Override
    protected void announceWinner() {
        System.out.println("Announcing winner for Reserve Auction...");
    }
}
