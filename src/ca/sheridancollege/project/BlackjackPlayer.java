package ca.sheridancollege.project;

import java.util.ArrayList;

public class BlackjackPlayer extends Player {

    private ArrayList<Card> hand;

    public BlackjackPlayer(String name) {
        super(name);
        hand = new ArrayList<>();
    }

    @Override
    public void play() {
        // Implement player's turn logic here
    }

    public void receiveCard(Card card) {
        hand.add(card);
    }
}
