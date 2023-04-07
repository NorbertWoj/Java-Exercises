public record Person(String first) {

    public String last(String s) {
        return  first + " " + s.substring(0, s.indexOf(" "));
    }
}
