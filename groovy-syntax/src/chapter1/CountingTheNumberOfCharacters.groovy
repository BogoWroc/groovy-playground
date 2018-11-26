package chapter1

class CountingTheNumberOfCharacters {

    static void main(String[] args) {
        print "What is the input string? > "
        def text = System.in.newReader().readLine()
        println "${text} has ${text.length()} characters."
    }

}
