package pacman.game;

import pacman.util.Direction;
import pacman.util.Position;

public interface Moveable {
    void setPosition​(Position position);

    Position getPosition();

    void setDirection​(Direction direction);

    Direction getDirection();
}
