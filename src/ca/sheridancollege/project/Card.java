package ca.sheridancollege.project;

public class Card {
    
     int rank;
   String suit;
    
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public int getRank() {
        return rank;
    }
    
    public String getSuit() {
        return suit;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
