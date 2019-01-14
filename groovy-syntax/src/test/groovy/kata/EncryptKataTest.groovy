package kata

import spock.lang.Specification

import static kata.EncryptKata.convertFirstLetterToASCICode
import static kata.EncryptKata.encryptThis
import static kata.EncryptKata.replaceByPlaces

class EncryptKataTest extends Specification {

    def 'shouldEncrypt text'(){
        expect:
        encryptThis(text) == result
        where:
        text | result
        "A wise old owl lived in an oak" |"65 119esi 111dl 111lw 108dvei 105n 97n 111ka"
        "The more he saw the less he spoke" |"84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp"
        "The less he spoke the more he heard" | "84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare"
        "Why can we not all be like that wise old bird" | "87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri"
        "Thank you Piotr for all your help" | "84kanh 121uo 80roti 102ro 97ll 121ruo 104ple"
    }

    def 'should convert first letter to ASCI code'(){
        expect:
        convertFirstLetterToASCICode(word) == result
        where:
        word | result
        "A" | "65"
        "The" | "84he"
        "Why" | "87hy"

    }

    def 'should replace by places second letter with last letter'(){
        expect:
        replaceByPlaces(word,1, word.length()-1) == result
        where:
        word | result
        "The" | "Teh"
        "Oh" | "Oh"

    }
}
