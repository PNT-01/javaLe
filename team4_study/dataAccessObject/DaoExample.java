package dataAccessObject;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.selct();
		dao.insert();
		dao.update();
		dao.delete();
	}

	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}
