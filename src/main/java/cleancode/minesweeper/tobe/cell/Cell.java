package cleancode.minesweeper.tobe.cell;

public interface Cell {

    boolean isLandMine();

    CellSnapshot getSnapShot();

    boolean hasLandMineCount();

    void flag();

    boolean isChecked();

    void open();

    boolean isOpened();

}
