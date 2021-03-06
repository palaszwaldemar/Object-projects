package escaperoom2;

public class Key extends Item {

    public Key(int keyId) {
        super("Klucz" + keyId);
    }

    @Override
    String use(Room room, Player player, Game game) {
        player.addItem(this);
        room.removeItem(this);
        return "Podnosisz klucz";
    }
}
