package blackjack.domain.card

class Cards(vararg card: Card) {
    private var _elements = card.toMutableList()
    val elements: List<Card>
        get() = _elements.toList()
    val score: Score
        get() = _elements
            .sorted()
            .reversed()
            .fold(Score.ZERO) { score, card -> card.calculateScore(score) }

    fun add(card: Card) = _elements.add(card)

    override fun toString(): String {
        return "Cards(_elements=$_elements)"
    }
}
