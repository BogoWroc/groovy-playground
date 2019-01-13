package basics


import spock.lang.Specification

class SafeNavigationOperatorSpec extends Specification{

    def 'it should return null when variable has no value'(){
        given:
        def person = null
        when:
        def result = person?.name
        then:
        assert result == null
    }
}
