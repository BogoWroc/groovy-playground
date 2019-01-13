package chapter1

import spock.lang.Specification

class SpaceshipOperatorSpec extends Specification {

    /*
     The spaceship is a relational operator that performs like Java’s compareTo() comparing two objects
     and returning -1, 0, or +1 depending on the value of the left argument as compared to the right.
     If the left argument is greater than the right, the operator returns 1.
     If the left argument is less than the right, the operator returns −1. If the arguments are equal, 0 is returned.
     */

    def "spaceship operator"() {
        expect:
        a <=> b == c

        where:
        a|b|c
        3|4|-1
        4|4|0
        5|4|1
    }
}
