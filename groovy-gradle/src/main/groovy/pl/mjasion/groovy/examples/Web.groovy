package pl.mjasion.groovy.examples

class Web {
    public static void main(String[] args) {
        String html = getUrl('http://volt.iem.pw.edu.pl/~ksiwek/')
        printGoogleIps()
    }

    static String getUrl(String url) {
        url?.toURL().text
    }

    static void printGoogleIps() {
        InetAddress.getAllByName("www.google.com").each {
            println it
        }
    }
}
