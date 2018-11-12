package com.itheima.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NQ
 * @create 2018-11-09 9:35
 */
@RestController
public class IndexController {



//    @RequestMapping(value = "index", method = RequestMethod.POST)
//    @GetMapping("index")      // 查询
//    @PostMapping  ("index")    // 增加
//    @DeleteMapping  ("index")  // 删除
//    @PutMapping  ("index")     // 修改

   /* @Value("${name}")
    private String name;

    @Value("${address}")
    private String address;


    @Value("${person.name}")
    private String username;

    @Autowired
    Environment environment;

    @Autowired
    private Person person;*/

    @GetMapping("index")
    public String index() {

//        String name1 = environment.getProperty("name");
//        System.out.println(name1);
//
//        String username = environment.getProperty("person.name");
//        System.out.println(username);
//
//        System.out.println(person);
//
//        System.out.println(address);
//
//        return "Hello Wolrd !!!!  " + name   + "   " + username;

        return "ssda";
    }


}
