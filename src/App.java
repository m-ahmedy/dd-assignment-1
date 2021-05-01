public class App {
    public static void main(String[] args) {
        System.out.println("Normal Card Deck");
        Deck deck = new Deck();
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n", Card.rankToString(card.getRank()), Card.suitToString(card.getSuit()));
            }
        }

        System.out.println("Enum Card Deck");
        DeckEnum deckEnum = new DeckEnum();
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                CardEnum card = deckEnum.getCard(suit, rank);
                System.out.format("%s of %s%n", CardEnum.rankToString(card.getRank()),
                        CardEnum.suitToString(card.getSuit()));
            }
        }

    }
}
