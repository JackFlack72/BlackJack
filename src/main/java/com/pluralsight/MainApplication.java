package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainApplication {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand = new Hand();
        // shuffles the deck
        deck.shuffle();
        // deal 5 cards
        for (int i = 0; i < 5; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand.dealCard(card);
            // shuffles the deck for a new user
            deck.shuffle();
        }

        ArrayList<String> playerNames = new ArrayList<>();
        playerNames.add("Lucas");
        playerNames.add("Finn");
        playerNames.add("Jake");
        playerNames.add("BMO");
        playerNames.add("Princess Bubblegum");
        playerNames.add("Marceline");
        playerNames.add("Ricardio");
        playerNames.add("Ice King");
        for (String playerName : playerNames) {
            int handValue = hand.getValue();

            System.out.println(playerName + "'s hand is worth " + handValue);
        }
    }
}
