package cleancode.minesweeper.tobe.position;

import java.util.List;

public class RelativePosition {

    public static final List<RelativePosition> SURROUNDED_POSITIONS = List.of(
        RelativePosition.of(-1, -1),
        RelativePosition.of(-1, 0),
        RelativePosition.of(-1, 1),
        RelativePosition.of(0, -1),
        RelativePosition.of(0, -1),
        RelativePosition.of(1, -1),
        RelativePosition.of(1, 0),
        RelativePosition.of(1, 1)
    );
    private final int deltaRow;
    private final int deltaCol;

    private RelativePosition(int deltaRow, int deltaCol) {
        this.deltaRow = deltaRow;
        this.deltaCol = deltaCol;
    }

    public static RelativePosition of(int deltaRow, int deltaCol) {
        return new RelativePosition(deltaRow, deltaCol);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RelativePosition that)) {
            return false;
        }

        return deltaRow == that.deltaRow && deltaCol == that.deltaCol;
    }

    @Override
    public int hashCode() {
        int result = deltaRow;
        result = 31 * result + deltaCol;
        return result;
    }

    public int getDeltaRow() {
        return deltaRow;
    }

    public int getDeltaCol() {
        return deltaCol;
    }
}
