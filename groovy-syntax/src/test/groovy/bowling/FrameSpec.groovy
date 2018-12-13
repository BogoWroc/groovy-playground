package bowling

import spock.lang.Specification

class FrameSpec extends Specification {

    def 'frame should has status depends on pins knocked down'() {
        given:
        def frame = new Frame(1)

        when:
        frame.pinsKnockedDownWithBall1(ball1)
        frame.pinsKnockedDownWithBall2(ball2)

        then:
        frame.status == status
        frame.score() == score

        where:
        ball1 | ball2 | score | status
        0     | 0     | 0     | FrameStatus.MISS
        10    | 0     | 10    | FrameStatus.STRIKE
        2     | 0     | 2     | FrameStatus.OPEN_FRAME
        0     | 3     | 3     | FrameStatus.OPEN_FRAME
        5     | 3     | 8     | FrameStatus.OPEN_FRAME
        6     | 4     | 10    | FrameStatus.SPARE
    }

}
