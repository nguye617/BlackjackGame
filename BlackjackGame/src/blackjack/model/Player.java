/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack.model;

/**
 *
 * @author Dong Nguyen
 */
import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int calculateHandValue() {
        int value = 0;
        int aces = 0;

        for (Card card : hand) {
            int cardValue = card.getValue();
            if (cardValue > 10) cardValue = 10;
            if (cardValue == 1) aces++;
            value += cardValue;
        }

        while (aces > 0 && value <= 11) {
            value += 10;
            aces--;
        }
        return value;
    }

    public boolean isBust() {
        return calculateHandValue() > 21;
    }
}
