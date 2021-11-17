package db;

public class ReportBuilder {
    private БазаДаних db;
    public ReportBuilder(БазаДаних db) {
        this.db = db;
    }

    public static class Авторизація {
        public boolean авторизуватися(БазаДаних db) {
            db.отриматиДаніКористувача();
            return true;
        }
    }
}
