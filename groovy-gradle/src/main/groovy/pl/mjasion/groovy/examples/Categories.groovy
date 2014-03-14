package pl.mjasion.groovy.examples

import groovy.time.TimeCategory

class Categories {
    public static void main(String[] args) {
        Date today = new Date().clearTime()
        use(TimeCategory) {
            Date modified = today + 2.years + 1.day - 10.milliseconds + 1.second

            println modified.format('YYYY-MM-dd HH:mm:ss.SSS')
        }
    }
}
