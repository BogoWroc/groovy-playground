package bowling

class BowlingScoreCalculation {
    def twoStrikes(Frame frame1, Frame frame2, Frame frame3) {
        return (frame1.bowl1 + frame2.bowl1 + frame3.bowl1) + (frame2.bowl1 + frame3.bowl1 + frame3.bowl2) + frame3.score()
    }

    def oneStrike(Frame frame1, Frame frame2) {
        return (frame1.bowl1 + frame2.bowl1 + frame2.bowl2) + frame2.score()

    }

    def spare(Frame frame1, Frame frame2) {
        return (frame1.score() + frame2.bowl1) + frame2.score()
    }


}
