package pl.mjasion.groovy.examples

class Dates {
    public static void main(String[] args) {
        Date now = new Date()
        String formattedDate = now.format('YYYY-MM-dd HH:mm:ss.SSS')
        Date today = new Date().clearTime()
        Date tomorrow = now + 1
        println(now)
        println formattedDate
        println(today)
        println(tomorrow)
    }
}
