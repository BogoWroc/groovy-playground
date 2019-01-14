package kata

import spock.lang.Specification

import static kata.CharacterWithLongestConsecutiveRepetition.longestRepetition

class CharacterWithLongestConsecutiveRepetitionTest extends Specification {

    def 'logngestRepetation'() {
        expect:
        longestRepetition(str) == result
        where:
        str | result
        "aaaabb" | ['a', 4]
        "bbbaaabaaaa" | ['a', 7]
        "cbdeuuu900" | ['u', 3]
        "abbbbb" | ['b', 5]
        "aabb" | ['a', 2]
        "xxyyzz" | ['x', 2]
        "ba" | ['b', 1]
        "" | ['', 0]

    }
}
