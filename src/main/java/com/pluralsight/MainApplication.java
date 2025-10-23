package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainApplication {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle(); // initial deck shuffle

        ArrayList<String> playerNames = new ArrayList<>();
        playerNames.add("Lucas");
        playerNames.add("Finn");
        playerNames.add("Jake");
        playerNames.add("BMO");
        playerNames.add("Princess Bubblegum");
        playerNames.add("Marceline");
        playerNames.add("Ricardio");
        playerNames.add("Ice King");

        // deal a hand for each player
        for (String playerName : playerNames) {
            Hand hand = new Hand(); // creates a new hand for each player
            // deal 2 cards
            for (int i = 0; i < 2; i++) {
                Card card = deck.deal(); // get a card from the deck
                hand.dealCard(card); // deal that card to the hand
            }
            int handValue = hand.getValue(); // get the value for the player's hand

            System.out.println(playerName + "'s hand is worth " + handValue);
        }
    }
}
