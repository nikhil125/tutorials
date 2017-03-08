import java.util.Objects;

public class Card {
	/**
	 * Value of the Card
	 */
	private final int value;

	/**
	 * Card suit
	 */
	private final Suit suit;

	public Card(int value, Suit suit) {
		if (value < 1 || value > 13)
			throw new IllegalArgumentException("Card values can be from 1 to 13.");
		if (Objects.isNull(suit)) {
			throw new IllegalArgumentException("Card suit cannot be null");
		}
		this.value = value;
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public Suit getSuit() {
		return suit;
	}
}
