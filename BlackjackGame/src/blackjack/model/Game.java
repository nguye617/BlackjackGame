/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack.model;
import blackjack.model.Deck
import blackjack.model.Player;       
/**
 *
 * @Dong Nguyen  
 */
public class Game {
    private Deck deck;
    private Player player;
    private Player dealer;

    public Game() {
        deck = new Deck();
        player = new Player();
        dealer = new Player();
    }

    public void startRound() {
        player.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());
        // Implement game logic here
    }
}