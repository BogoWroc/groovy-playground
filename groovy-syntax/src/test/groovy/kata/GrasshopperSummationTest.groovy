package kata

import spock.lang.Specification

import static kata.GrasshopperSummation.summation

class GrasshopperSummationTest extends Specification {

    def 'Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0'(){
        expect:
        summation(n) == result
        where:
        n | result
        1 | 1
        8 | 36
    }
}
