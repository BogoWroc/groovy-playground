package chapter1

import spock.lang.Specification

class RangeSpec extends Specification{

    def "ranges"(){
        expect:
        x in r == c

        where:
        x | r | c
        1|(1..10)|true
        10|(1..10)|true
        11|(1..10)|false
        10|(1..<10)|false

    }
}
