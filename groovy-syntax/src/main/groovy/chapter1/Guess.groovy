package chapter1

class Guess {
    final Integer number

    Guess(num) {
        this.number = num;
    }

    def areYouThinkingAbout(num){
        switch (num){
            case {it < number}: return -1
            case {it == number}: return 0
            case {it > number}: return 1;
        }
    }
}
