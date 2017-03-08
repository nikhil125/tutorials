import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	/**
	 * List of Cards in the deck
	 */
	private List<Card> cards;

	public Deck() {
		cards = new ArrayList(52);
		for (Suit suit : Suit.values())
			for (int i = 1; i <= 13; i++) {
				cards.add(new Card(i, suit));
			}
	}

	/**
	 * Shuffle the card on the deck
	 */
	public void shuffle() {
		Collections.shuffle(cards, new Random());
	}

	/**
	 * Deal a card from the given index
	 *
	 * @param index
	 * @return Card from the index
	 */
	public Card dealACard(int index) {
		if (index < 0 || index > getDeckSize() - 1)
			throw new IllegalArgumentException("Index is not in the range.");
		return cards.remove(index);
	}

	/**
	 * Deal a card from the top.
	 *
	 * @return Card
	 */
	public Card dealACard() {
		return cards.remove(getDeckSize() - 1);
	}

	public int getDeckSize() {
		return cards.size();
	}
}
