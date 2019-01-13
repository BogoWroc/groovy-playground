package kata

class HouseNumbersSumKata {
    static def houseNumbersSum(List<Integer> inputArray) {
        inputArray.takeWhile {it}.sum(0)
    }
}
