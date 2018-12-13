package bowling

class Frame {
    public static final int MAX_PIN_NUMBER = 10
    final int round
    int bowl1
    int bowl2
    private FrameStatus status = FrameStatus.MISS

    Frame(int round) {
        this.round = round
    }

    int score() {
        bowl1 + bowl2
    }

    def pinsKnockedDownWithBall1(int pins) {
        this.bowl1 = pins
        setStatus(FrameStatus.STRIKE, pins)
    }

    def pinsKnockedDownWithBall2(int pins) {
        if (this.status != FrameStatus.STRIKE) {
            this.bowl2 = pins
            setStatus(FrameStatus.SPARE, pins)
        }
    }

    private void setStatus(FrameStatus status, int pins) {
        if (score() == MAX_PIN_NUMBER) {
            this.status = status
        } else if (pins != 0) {
            this.status = FrameStatus.OPEN_FRAME
        }
    }

    @Override
    String toString() {
        "Frame<${round}>: bowl1: ${bowl1} pins knocked down, bowl2: ${bowl2} knocked down"
    }
}
