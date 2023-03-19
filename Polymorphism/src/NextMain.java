public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

//        Adventure jaws2 = (Adventure) Movie.getMovie("C", "Jaws");
//        jaws2.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
//        comedy.watchMovie();
//        comedy.watchComedy();

        Movie comedyMovie = (Movie) comedy;
        comedyMovie.watchMovie();
//        comedyMovie.watchComedy();

        Comedy comedyMovie2 = (Comedy) comedy;
        comedyMovie2.watchComedy();
        comedyMovie2.watchMovie();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();
//        airplane.watchComedy();

        var plane = new Comedy("Airplane");
        plane.watchMovie();
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("C", "Airplane");
        if (unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure)unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
