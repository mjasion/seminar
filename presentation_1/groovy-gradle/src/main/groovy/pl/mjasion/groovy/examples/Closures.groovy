package pl.mjasion.groovy.examples

class Closures {
    public static void main(String[] args) {
        badCode()
        goodCode()
    }

    static void badCode() {
        try {
            step1()
        } catch (Exception e) {
            e.printStackTrace()
        }

        try {
            step2()
        } catch (Exception e) {
            e.printStackTrace()
        }
    }

    static void goodCode() {
        logIfError { step1() }
        logIfError { step2() }
    }

    static void logIfError(Closure closure) {
        try {
            closure()
        } catch (Exception e) {
            e.printStackTrace()
        }
    }

    static void step1() {
        println 'Successful step 1'
    }

    static void step2() {
        throw new Exception()
    }
}
