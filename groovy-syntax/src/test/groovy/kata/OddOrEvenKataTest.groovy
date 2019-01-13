package kata

import spock.lang.Specification

import static kata.OddOrEvenKata.oddOrEven

class OddOrEvenKataTest extends Specification {

    def 'Given an array of numbers (a list in groovy), determine whether the sum of all of the numbers is odd or even.'(){
        expect:
        oddOrEven(input) == expected
        where:
        input | expected
        [] | "even"
        [0] | "even"
        [1] | "odd"
        [0, 1, 5] | 'even'
        [0, 1, 3] | 'even'
        [1023, 1, 2] | 'even'
    }
}
