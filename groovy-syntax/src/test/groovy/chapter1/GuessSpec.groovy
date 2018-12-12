package chapter1

import spock.lang.Specification
import spock.lang.Unroll

class GuessSpec extends Specification {

    @Unroll
    def 'guess number'() {
        given: "Prepare"
        def guess = new Guess(5)

        expect:
        guess.areYouThinkingAbout(x) == y

        where:
        x | y
        1 | -1
        2 | -1
        5 | 0
        6 | 1
        7 | 1
    }
}
