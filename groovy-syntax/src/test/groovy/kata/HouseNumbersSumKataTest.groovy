package kata

import spock.lang.Specification

class HouseNumbersSumKataTest extends Specification {
    def 'it should sum numbers to reach 0'(){
        expect:
        HouseNumbersSumKata.houseNumbersSum(inputs) == result
        where:
        inputs | result
        [0]    |    0
        [1,0]    |    1
        [5, 1, 2, 3, 0, 1, 5, 0, 2] | 11
        [4, 2, 1, 6, 0] | 13
        [4, 1, 2, 3, 0, 10, 2] | 10
        [0, 1, 2, 3, 4, 5] | 0
    }

}
