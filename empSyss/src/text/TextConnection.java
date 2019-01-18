package text;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.junit.Test;
import com_zyze.mpSys.dao.Empdao;
import com_zyze.mpSys.domain.Emp;
import com_zyze.mpSys.utils.DBUtils;
public class TextConnection {
	@Test
	public void tesdd() throws SQLException, PropertyVetoException {
		Connection connection = DBUtils.getConnection();
		System.out.println(connection);
		connection.close();
	}	
	@Test
	public void testFindAll() {
		Empdao dao = new Empdao();
		List<Emp> all = dao.findAll();
		for (Emp emp : all) {
			System.out.println(emp);
		}
	}
}
