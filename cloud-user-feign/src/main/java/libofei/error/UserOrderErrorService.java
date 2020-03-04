package libofei.error;

import java.util.ArrayList;
import java.util.List;

import libofei.service.UserOrderFeign;
import org.springframework.stereotype.Component;


@Component
public class UserOrderErrorService implements UserOrderFeign {

	public List<String> getUserOrderList() {
		List<String> listUser = new ArrayList<String>();
		listUser.add("not orderUser list");
		return listUser;
	}

}
