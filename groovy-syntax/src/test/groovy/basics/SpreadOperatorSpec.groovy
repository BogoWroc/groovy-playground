package basics

import spock.lang.Specification

class SpreadOperatorSpec extends Specification{

    def 'it should spread collection of elements'(){
        given:
        def persons = [
                new Person(name: 'Bogumil', age: 38),
                new Person(name: "Kasia", age: 36)
        ]

        expect:
        ['Bogumil', 'Kasia'].equals(persons*.name)

    }
}
