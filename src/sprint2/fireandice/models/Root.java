package sprint2.fireandice.models;

import sprint2.fireandice.RemoteRepository;

import javax.inject.Inject;

public class Root {

    private Book books;
    private Character characters;
    private House houses;

    @Inject
    // dagger позволяет избежать конструкции RemoteRepository repo = new RemoteRepository();
    public Root(RemoteRepository repo) {

        books = repo.book(1);
        characters = repo.character(583);
        houses = repo.house(378);
    }

    @Override
    public String toString() {
        return "Root {" + "\n" +
                "books : " + books + "\n" +
                "characters : " + characters + "\n" +
                "houses : " + houses + "\n" +
                '}';
    }
}
