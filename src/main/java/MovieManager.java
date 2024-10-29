public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) { /* добавляет фильмы*/
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() { /*показывет все сохраненное*/
        return movies;
    }

    public String[] findLast() { /*показывет 5 последних фильмов в обратном порядке*/
        int reversLength;
        if (movies.length < limit) {
            reversLength = movies.length;
        } else {
            reversLength = limit;
        }
        String[] tmp = new String[reversLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
            reversLength++;
        }
        return tmp;
    }
}
