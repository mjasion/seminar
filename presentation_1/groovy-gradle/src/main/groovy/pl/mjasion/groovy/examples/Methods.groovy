package pl.mjasion.groovy.examples

class Methods {
    static void defaultValueMethod(String param = 'default') {
        println param
    }

    public static void main(String[] args) {
        defaultValueMethod()
        defaultValueMethod('Hello World')
    }
}
