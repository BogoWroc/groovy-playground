package kata

import spock.lang.Specification

import static kata.StringDrillsRepeater.repeater

class StringDrillsRepeaterTest extends Specification {
    def 'string repeater'(){
        expect:
        repeater(str, n) == result
        where:
        str | n | result
        'a' | 5 | 'aaaaa'
        'Na' | 16 | 'NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa'
        'Wub ' | 6 | 'Wub Wub Wub Wub Wub Wub '
    }
}
