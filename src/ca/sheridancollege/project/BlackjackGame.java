package ca.sheridancollege.project;

import java.util.Scanner;

public class BlackjackGame extends Game {

    private final GroupOfCards deck;
    private final Player dealer;

    public BlackjackGame(String name) {
        super(name);
        deck = new GroupOfCards(52);
        initializeDeck();
        dealer = new Player("Dealer") {
            @Override
            public void play() {
                throw new UnsupportedOperationException("Dealer's turn not implemented yet.");
            }
        };
    }

    private void initializeDeck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                Card card;
                card = new BlackjackCard(j,
                        "Spades");
                deck.getCards().add(card);
            }
        }
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Blackjack!");

        // Prompt for number of players
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Register players
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter player " + (i + 1) + " name: ");
            String playerName = scanner.nextLine();
            getPlayers().add(new BlackjackPlayer(playerName));
        }

        // Shuffle deck
        deck.shuffle();

        // Deal initial cards
        for (Player player : getPlayers()) {
            dealCard(player);
            dealCard(player);
        }
        dealCard(dealer);
        dealCard(dealer);

        // Players' turn
        for (Player player : getPlayers()) {
            player.play();
        }

        // Dealer's turn
        dealer.play();

        declareWinner();
    }

    private void dealCard(Player player) {
        Card card = deck.getCards().remove(0);
        ((BlackjackPlayer) player).receiveCard(card);
    }

    /**
     *
     */
    @Override
    public void declareWinner() {
        System.out.println("Game over! Determining winner...");
        // Implement logic to determine winner and display result
    }
}
