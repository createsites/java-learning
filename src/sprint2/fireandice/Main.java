package sprint2.fireandice;

import sprint2.fireandice.models.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // строим graph зависимости для dagger
        FireandiceComponent component = DaggerFireandiceComponent.create();
        Root root = component.getRoot();
        System.out.println(root.toString());
    }

}