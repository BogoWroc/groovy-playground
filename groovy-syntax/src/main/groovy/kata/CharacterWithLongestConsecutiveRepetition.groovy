package kata

class CharacterWithLongestConsecutiveRepetition {
    def static longestRepetition(String chars) {

        def counted = [:]
        chars.each { it -> counted[it] = chars.count(it)}
        def sorted = counted.sort { -it.value }
        if(sorted.size()>0) {
            def key = sorted.keySet().toArray()[0]
            return [key, sorted[key]]
        }
        return ['',0]
    }
}
