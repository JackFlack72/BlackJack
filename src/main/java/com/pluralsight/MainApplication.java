package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        final int CARDS_PER_HAND = 2; // sets cards per hand to whatever necessary number
        Hand hand = new Hand();

        Deck deck = new Deck();
        deck.shuffle(); // initial deck shuffle

/* //Tests to see player names are actually being input
        List<String> playerNames = getPlayerNames();
        for (String playerName : playerNames) {
            System.out.println(playerName);
        }
 */

        Hand hand = dealHand(CARDS_PER_HAND);
        System.out.println(hand);
        int handValue = hand.getValue();
        System.out.println("This hand is worth " + handValue);

        for (int i = 0; i < CARDS_PER_HAND; i++) {
            Card card = deck.deal(); // get a card from the deck
            hand.dealCard(card); // deal that card to the hand
        }

/*
        ArrayList<String> playerNames = new ArrayList<>();
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
            // deals CARDS_PER_HAND(2 cards)
            for (int i = 0; i < CARDS_PER_HAND; i++) {
                Card card = deck.deal(); // get a card from the deck
                hand.dealCard(card); // deal that card to the hand
            }
            int handValue = hand.getValue(); // get the value for the player's hand

            System.out.println(playerName + "'s hand is worth " + handValue);
        }
 */

    }

    public static Hand dealHand(int numberOfCards, Deck deck) {
        Hand hand = new Hand();

        for (int i = 0; i < numberOfCards; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand.deal(card);
        }
        return hand;
    }

    public static List<String> getPlayerNames() {
        Scanner scanner = new Scanner(System.in);
        List<String> playerList = new ArrayList<>();

        System.out.println("Enter number of players: ");
        int playerCount = scanner.nextInt();
        scanner.nextLine(); // eats carriage return

        for (int i = 0; i < playerCount; i++) {
            System.out.println("Enter name for player " + (i + 1) + ": ");
            String playerName = scanner.nextLine();
            playerList.add(playerName);
        }
        return playerList;
    }
}
