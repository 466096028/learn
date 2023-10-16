package cn.huanzi.qch.springbootencrpt;

import cn.shuibo.annotation.Decrypt;
import cn.shuibo.annotation.Encrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springBoot-master
 * @description:
 * @author: jiangtaohou
 * @create: 2023-10-16 11:36
 **/
@Controller
public class IndexController {

    @Encrypt
    @GetMapping("/encryption")
    @ResponseBody
    public User encryption(){
        User user = new User();
        user.setName("shuibo.cn");
        user.setAge(18);
        user.setPassword("11111");
        return user;
    }

    @Decrypt
    @PostMapping("/decryption")
    @ResponseBody
    public String Decryption(@RequestBody User user){
        return user.toString();
    }
}
