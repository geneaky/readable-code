package cleancode.minesweeper.tobe.minesweeper.user;

public enum UserAction {
    FLAG("깃발 꽂기"),
    OPEN("셀 열기"),
    UNKNOWN("알수없음");

    private final String description;

    UserAction(String description) {
        this.description = description;
    }
}
