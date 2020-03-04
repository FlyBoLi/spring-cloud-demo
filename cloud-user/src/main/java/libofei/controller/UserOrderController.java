package libofei.controller;

import libofei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserOrderController {


    @Autowired
    private UserService userService;

    @RequestMapping("/get/user/order")
    public List<String> getUserOrderList(){
        return userService.getUserOrder();
    }
}
