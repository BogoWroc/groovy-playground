package kata

import spock.lang.Specification

import static kata.PrinterErrors.printerError

class PrinterErrorsTest extends Specification {

    def 'it should print number of invalid letters in a string'(){
        expect:
        printerError(input) == result
        where:
        input | result
        "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz" | "3/56"
    }
}
