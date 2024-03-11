package Repository;

import Model.FoodOrder;

public interface Repository<T> {

	void Save(FoodOrder o);

}
