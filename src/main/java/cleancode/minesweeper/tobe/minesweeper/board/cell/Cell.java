package cleancode.minesweeper.tobe.minesweeper.board.cell;

public interface Cell {

    boolean isLandMine();

    CellSnapshot getSnapShot();

    boolean hasLandMineCount();

    void flag();

    boolean isChecked();

    void open();

    boolean isOpened();

}
