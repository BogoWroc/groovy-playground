package chapter1

import spock.lang.Specification

class MoneySpec extends Specification {

    def 'should report an error when different currencies are used'() {
        when:
        new Money(1, 'USD') + new Money(3, 'PLN')

        then:
        thrown IllegalArgumentException
    }

    def 'should be possible add two Money instances with the same currency'() {
        when:
        def money = new Money(1, 'USD') + new Money(3, 'USD')

        then:
        money == new Money(4, 'USD')
    }

    def 'should be possible to add int value to Money instance'(){
        when:
        def money = new Money(1, 'USD') + 5
        then:
        money == new Money(6,'USD')
    }
}
