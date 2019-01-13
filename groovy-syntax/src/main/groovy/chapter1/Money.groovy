package chapter1

import groovy.transform.Immutable

@Immutable
class Money {
    int amount
    String currency

    Money plus(Money other) {
        if (null == other) return this
        if (other.currency != currency) {
            throw new IllegalArgumentException("Cannot add $other.currency to $currency")
        }

        return new Money(amount: amount + other.amount, currency: currency)
    }

    Money plus(Integer value) {
        return new Money(amount: amount + value, currency: currency)
    }
}
