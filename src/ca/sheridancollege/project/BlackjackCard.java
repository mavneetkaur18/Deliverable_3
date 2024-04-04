package ca.sheridancollege.project;

public class BlackjackCard extends Card {

    public BlackjackCard(int rank, String suit) {
        super(rank, suit);
    }

    @Override
    public String toString() {
        // Construct the string representation of the card
        String rankString;
        switch (getRank()) {
            case 1:
                rankString = "Ace";
                break;
            case 11:
                rankString = "Jack";
                break;
            case 12:
                rankString = "Queen";
                break;
            case 13:
                rankString = "King";
                break;
            default:
                rankString = String.valueOf(getRank());
                break;
        }
        return rankString + " of " + getSuit();
    }
}
