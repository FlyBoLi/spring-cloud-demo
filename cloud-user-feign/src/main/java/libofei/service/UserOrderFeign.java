package libofei.service;

import java.util.List;

import libofei.error.UserOrderErrorService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


//fallback = MemberFeignService.class
@FeignClient(value = "service-order",fallback= UserOrderErrorService.class)
public interface UserOrderFeign {


	@RequestMapping("/get/order/list?id=2")
	public List<String> getUserOrderList();
}
