package chapter1

class SayingHello {

    static void main(String[] args) {
        println "What is your name?"
        def name = System.in.newReader().readLine()
        println "Hello, ${name}, nice to meet you!"
    }
}
