package libofei.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unchecked")
//@Component
@Service
public class UserService {

    @Value("${oderMemberAddress}")
    private String orderMemberAddress;

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "orderError")
    public List<String> getUserOrder(){
        return restTemplate.getForObject(orderMemberAddress+"?id=2", List.class);
    }


    public List<String> orderError() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("not orderUser list");
        return listUser;
    }


}
