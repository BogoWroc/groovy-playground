package chapter1

class MadLib {


    static void main(String[] args) {
        def noun = fetchUserData("Enter a noun:")
        def verb = fetchUserData("Enter a verb:")
        def adjective = fetchUserData("Enter a adjective:")
        def adverb = fetchUserData("Enter a adverb:")

        println "Do you ${verb} your ${adjective} ${noun} ${adverb}? That's hilarious!"
    }

    static def fetchUserData(text="n/a") {
        print "${text}"
        return System.in.newReader().readLine()
    }
}
