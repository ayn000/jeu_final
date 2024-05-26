package objet;

import personnages.Player;

public class Feather extends GameObject {
    private double speedBoost;

    public Feather(int x, int y, int tileSize, String imagePath, double speedBoost) {
        super(x, y, tileSize, imagePath, 20);
        this.speedBoost = speedBoost;
    }

    @Override
    public void onPlayerContact(Player player) {
        player.getInventory().addItem(this);
    }

    @Override
    public void applyEffect(Player player) {
        player.setSpeed(player.getSpeed() + speedBoost);
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public double getSpeedBoost() {
        return speedBoost;
    }
}