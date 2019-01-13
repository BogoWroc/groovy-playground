package kata

class PrinterErrors {
    static String printerError(String s) {
        def list = s.toCharArray().toList()
        list.removeIf {it -> it in 'a'..'m'}

        return "${list.size()}/${s.length()}"
    }
}
