
public class DeckEnum {

    public static int numSuits = CardEnum.Suit.values().length;
    public static int numRanks = CardEnum.Rank.values().length;
    public static int numCards = numSuits * numRanks;

    private CardEnum[][] cards;
    private CardEnum.Suit[] suits;
    private CardEnum.Rank[] ranks;

    public DeckEnum() {
        cards = new CardEnum[numSuits][numRanks];
        suits = CardEnum.Suit.values();
        ranks = CardEnum.Rank.values();

        for (int suit = 1; suit <= numSuits; suit++) {
            for (int rank = 1; rank <= numRanks; rank++) {
                cards[suit - 1][rank - 1] = new CardEnum(ranks[rank - 1], suits[suit - 1]);
            }
        }
    }

    public CardEnum getCard(int suit, int rank) {
        return cards[suit - 1][rank - 1];
    }
}