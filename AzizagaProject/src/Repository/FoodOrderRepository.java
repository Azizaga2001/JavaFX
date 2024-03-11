package Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import Model.FoodOrder;
import Model.User;

public class FoodOrderRepository extends DataManager implements Repository<FoodOrder>{
	
	@Override
	public void Save(FoodOrder o) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void Update(FoodOrder o) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public List<FoodOrder> find(Map<String, String> fieldList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<FoodOrder> findAll() {

		return null;
	}
	
	@Override
	public List<FoodOrder> findAll(User u) {
		String query = "SELECT * FROM groupd_project.order"
				+ "INNER JOIN groupd_project.categories ON order.category_id = categories.id"
				+ "INNER JOIN groupd_project.work ON order.user_id = work.id;"
				+ "WHERE order.active = 1";
		
		List<FoodOrder> orders = new ArrayList<>();
		try {
			connect();
			preparedStatement = connection.prepareStatement(query);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private void connect() {
		// TODO Auto-generated method stub
		
	}

	public boolean Delete(FoodOrder o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
