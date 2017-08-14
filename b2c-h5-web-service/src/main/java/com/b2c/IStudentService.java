package com.b2c;

import com.b2c.tests.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by Administrator on 2017/7/20 0020.
 */
@FeignClient(name ="b2c-member-service")
public interface IStudentService {

    @RequestMapping("/aaa")
    public Student selectByName(@RequestParam(value = "name") String name);

}
