package escaperoom2;

import java.util.ArrayList;
import java.util.List;

public class RoomsFactory {

    List<Room> createRooms() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(createFirstRoom());
        rooms.add(createSecondRoom());
        return rooms;
    }

    private Room createFirstRoom() {
        List<Item> itemsOfFirstRoom = new ArrayList<>();
        Key key1 = new Key(1);
        itemsOfFirstRoom.add(key1);
        itemsOfFirstRoom.add(new Door(key1));
        itemsOfFirstRoom.add(new Window());
        return new Room(itemsOfFirstRoom);
    }

    private Room createSecondRoom() {
        List<Item> itemsOfSecondRoom = new ArrayList<>();
        Code code = new Code();
        Key key2 = new Key(2);
        Key key3 = new Key(3);
        itemsOfSecondRoom.add(new Desk(key2, key3));
        itemsOfSecondRoom.add(new Door(key3));
        itemsOfSecondRoom.add(new Wardrobe(code, key2));
        itemsOfSecondRoom.add(new Window());
        itemsOfSecondRoom.add(code);
        return new Room(itemsOfSecondRoom);
    }
}
