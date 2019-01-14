package kata

class EncryptKata {
    static def encryptThis(String text) {
        def arr = text.split(' ')
        def encrypted = []
        arr.each {
            it -> encrypted.add(encryptWord(it))
        }
        return encrypted.join(" ")
    }

    static def encryptWord(word) {
        if (word.length() > 1) {
            def replaced = replaceByPlaces(word, 1, word.length() - 1)
            return convertFirstLetterToASCICode(replaced)
        } else
            return convertFirstLetterToASCICode(word)
    }

    static def convertFirstLetterToASCICode(String word) {
        (int) word[0] + word.substring(1, word.length())
    }


    static def replaceByPlaces(String word, int fromIndex, int toIndex) {
        if (word.length() <= toIndex)
            return word

        def arr = word.toCharArray()
        def to = word[toIndex]
        arr[toIndex] = arr[fromIndex]
        arr[fromIndex] = to

        return arr.join()

    }
}
