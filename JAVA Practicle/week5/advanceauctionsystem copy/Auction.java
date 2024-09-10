package advanceauctionsystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Auction {
    private List<Observer> bidders = new ArrayList<>();

    public void registerBidder(Observer bidder) {
        bidders.add(bidder);
    }

    public void unregisterBidder(Observer bidder) {
        bidders.remove(bidder);
    }

    public void notifyBidders(String message) {
        for (Observer bidder : bidders) {
            bidder.update(message);
        }
    }

    public final void conductAuction() {
        notifyBidders("Auction started!");
        initializeAuction();
        startBidding();
        endBidding();
        announceWinner();
        notifyBidders("Auction ended!");
    }

    protected abstract void initializeAuction();
    protected abstract void startBidding();
    protected abstract void endBidding();
    protected abstract void announceWinner();
}

