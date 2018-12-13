package bowling

import spock.lang.Specification

class BowlingScoreCalculationSpec extends Specification {

    static createFrame(int no, int bowl1, int bowl2=0) {
        def frame = new Frame(no)
        frame.pinsKnockedDownWithBall1(bowl1)
        frame.pinsKnockedDownWithBall2(bowl2)
        return frame
    }

    def 'score calculation for one STRIKE'(){
        given:
        def bowlingScoreCalculation = new BowlingScoreCalculation()
        def frame1 = new Frame(1)
        def frame2 = new Frame(2)

        when:
        frame1.pinsKnockedDownWithBall1(10)
        frame2.pinsKnockedDownWithBall1(3)
        frame2.pinsKnockedDownWithBall2(6)

        then:
        bowlingScoreCalculation.oneStrike(frame1, frame2) == 28
    }

    def 'score calculation for two STRIKEs'(){
        given:
        def bowlingScoreCalculation = new BowlingScoreCalculation()
        def frame1 = new Frame(1)
        def frame2 = new Frame(2)
        def frame3 = new Frame(3)

        when:
        frame1.pinsKnockedDownWithBall1(10)
        frame2.pinsKnockedDownWithBall1(10)
        frame3.pinsKnockedDownWithBall1(4)
        frame3.pinsKnockedDownWithBall2(2)

        then:
        bowlingScoreCalculation.twoStrikes(frame1, frame2, frame3) == 46
    }

    def 'score calculation for three STRIKEs'(){
        given:
        def bowlingScoreCalculation = new BowlingScoreCalculation()
        def frame1 = new Frame(1)
        def frame2 = new Frame(2)
        def frame3 = new Frame(3)

        when:
        frame1.pinsKnockedDownWithBall1(10)
        frame2.pinsKnockedDownWithBall1(10)
        frame3.pinsKnockedDownWithBall1(10)


        then:
        bowlingScoreCalculation.twoStrikes(frame1, frame2, frame3) == 60
    }

    def 'score calculation for SPARE'(){
        given:
        def bowlingScoreCalculation = new BowlingScoreCalculation()
        def frame1 = new Frame(1)
        def frame2 = new Frame(2)

        when:
        frame1.pinsKnockedDownWithBall1(7)
        frame1.pinsKnockedDownWithBall2(3)
        frame2.pinsKnockedDownWithBall1(4)
        frame2.pinsKnockedDownWithBall2(2)


        then:
        bowlingScoreCalculation.spare(frame1, frame2) == 20
    }

}
