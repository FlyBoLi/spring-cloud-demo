package libofei.controler;

import java.util.List;

import libofei.service.UserOrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FeignUserController {

	@Autowired
	private UserOrderFeign userOrderFeign;

	@RequestMapping("/getUserOrderList")
	public List<String> getUserOrderList() {
		return userOrderFeign.getUserOrderList();
	}

	@RequestMapping("/getOrderFeign")
	public String getOrderFeign() {
		return "getOrderFeign";
	}

}
