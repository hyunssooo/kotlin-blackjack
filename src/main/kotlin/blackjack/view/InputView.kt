package blackjack.view

import blackjack.domain.player.Name
import blackjack.domain.player.Player

fun inputPlayerNames(): List<String> {
    println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)")
    return (readLine() ?: throw IllegalStateException("입력 해주세요"))
        .split(",")
}

tailrec fun inputBetting(it: Name): Int {
    println("${it.value} 의 배팅 금액은?")
    return readLine()?.toIntOrNull() ?: inputBetting(it)
}

tailrec fun inputAnswer(player: Player): Boolean {
    println("${player.name.value}는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)")
    val answer = readLine() ?: throw IllegalStateException("입력 해주세요")
    return when (answer) {
        "y" -> true
        "n" -> false
        else -> inputAnswer(player)
    }
}
