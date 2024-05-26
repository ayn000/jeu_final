package personnages;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;

public class SpeedSensitiveEnemy extends Enemy {

    public SpeedSensitiveEnemy(int x, int y, int tileSize, String imagePath, int health, int attack) {
        super(x, y, tileSize, imagePath, health, attack);
    }

    @Override
    public void decreaseHealth(int amount, Player player) {
        if (player.getSpeed() > 0.1) {
            super.decreaseHealth(amount, player);
        } else {
            System.out.println("Your speed is too low to damage this enemy!");
        }
    }
}

