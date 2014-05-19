package pl.mjasion.groovy.performance

import groovy.transform.CompileStatic

/**
 * Original source: https://github.com/jakubnabrdalik/wgug-01-meeting/blob/master/src/test/groovy/eu/solidcraft/staticcompilation/ShowMeTheSpeedSpec.groovy
 */
class PerformanceGroovy {
    public static void main(String[] args) {
        def performanceGroovy = new PerformanceGroovy()
        def repeat = 10
        println "DynamicGroovy - StaticGroovy avg: ${performanceGroovy.staticVsDynamic(repeat, 40) / repeat}"
    }

    long staticVsDynamic(int times, int i) {
        long dynamicLength = (1..times).collect {
            measure(i, "dynamic") {
                fibDynamic(i)
            }
        }.sum()
        println "DynamicGroovy avg: ${dynamicLength / times}"
        long staticLength = (1..times).collect {
            measure(i, "static") {
                fibStatic(i)
            }
        }.sum()
        println "StaticGroovy avg: ${staticLength / times}"
        return dynamicLength - staticLength
    }

    private long measure(int i, String name, Closure closure) {
        long start = milis()
        closure.call(i)
        long length = calculateTheEnd(start)
        println("$name took: $length")
        return length
    }

    private long calculateTheEnd(long start) {
        return milis() - start
    }

    private long milis() {
        return System.currentTimeMillis()
    }

    int fibDynamic(int i) {
        i < 2 ? 1 : fibDynamic(i - 2) + fibDynamic(i - 1)
    }

    @CompileStatic
    int fibStatic(int i) {
        i < 2 ? 1 : fibStatic(i - 2) + fibStatic(i - 1)
    }

}
