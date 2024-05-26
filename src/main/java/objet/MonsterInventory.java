package objet;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.image.Image;

public class MonsterInventory {
    private List<GameObject> items;

    public MonsterInventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(GameObject item) {
        items.add(item);
    }

    public List<GameObject> getItems() {
        return items;
    }

    public boolean removeItem(GameObject item) {
        return items.remove(item);
    }
}

