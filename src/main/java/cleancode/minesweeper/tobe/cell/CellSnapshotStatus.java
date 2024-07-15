package cleancode.minesweeper.tobe.cell;

public enum CellSnapshotStatus {

    EMPTY("빈 셀"),
    FLAG("깃발"),
    UNCHECKED("확인 전"),
    NUMBER("숫자"),
    MINE("지뢰");

    private final String description;

    CellSnapshotStatus(String description) {
        this.description = description;
    }
}
