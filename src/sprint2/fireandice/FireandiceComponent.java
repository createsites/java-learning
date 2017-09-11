package sprint2.fireandice;

import dagger.Component;
import sprint2.fireandice.models.Root;

@Component
public interface FireandiceComponent {

    Root getRoot();
}
