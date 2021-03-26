package blackjack.domain.card.state

import blackjack.domain.card.Card
import blackjack.domain.card.Cards

abstract class Running(cards: Cards) : AbstractState(cards) {

    override fun draw(card: Card): State {
        cards.add(card)
        if (cards.score == BlackJack.SCORE) {
            return BlackJack(cards)
        }
        if (cards.score > BlackJack.SCORE) {
            return Bust(cards)
        }
        return Hit(cards)
    }

    override fun isFinished() = false
}
