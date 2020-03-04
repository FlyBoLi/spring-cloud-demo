package libofei.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/get/order/list")
    public List<String> getOrderList(int id){
        List<String> orderList = new ArrayList<>();
        for(int i = 0; i<= 10; i++){
            if(id==i){
                continue;
            }
            orderList.add("订单" + i);
        }
        orderList.add(port);
        return orderList;
    }
}
