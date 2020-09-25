//package com.atguigu.crowd.mvc.handler;
//
//import com.atguigu.crowd.service.apl.AdminService;
//import com.atguigu.crowd.entity.Admin;
//import com.atguigu.crowd.entity.notrequired.ParamData;
//import com.atguigu.crowd.entity.notrequired.Student;
//import com.atguigu.crowd.util.CrowdUtil;
//import com.atguigu.crowd.util.ResultEntity;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.List;
//
//@Controller
//public class TestHandler {
//    private Logger logger = LoggerFactory.getLogger(TestHandler.class);
//
//    @ResponseBody
//    @RequestMapping("/send/compose/object.json")
//    public ResultEntity<Student> testReceiveComposeObject(@RequestBody Student student,HttpServletRequest request) {
//        boolean judgeRequest = CrowdUtil.judgeRequestType(request);
//        logger.info("judgeRequest="+judgeRequest);
//        logger.info(student.toString());
//        ResultEntity<Student> resultEntity = ResultEntity.successWithData(student);
//        return resultEntity;
//    }
//
//    @ResponseBody
//    @RequestMapping("send/array/Three.html")
//    public String testReceiveArrayThree(@RequestBody List<Integer> array) {
//
//        for (Integer number : array
//        ) {
//            logger.info("number=" + number);
//
//        }
//        return "success";
//    }
//
//    @ResponseBody
//    @RequestMapping("send/array/one.html")
//    public String testReceiveArrayOne(@RequestParam("array[]") List<Integer> array) {
//        for (Integer number : array
//        ) {
//            System.out.println("number=" + number);
//        }
//        return "success";
//    }
//
//    @ResponseBody
//    @RequestMapping("send/array/two.html")
//    public String testReceiveArrayTwo(ParamData paramData) {
//        List<Integer> array = paramData.getArray();
//        for (Integer number : array
//        ) {
//            System.out.println("number=" + number);
//        }
//        return "success";
//    }
//
//    @Autowired
//    private AdminService adminService;
//
//    @RequestMapping("/test/ssm.html")
//    public String testSSM(ModelMap modelMap, HttpServletRequest request) {
//        boolean judgeRequest=CrowdUtil.judgeRequestType(request);
//        logger.info("judgeRequest="+judgeRequest);
//        List<Admin> adminList = adminService.getAll();
//        modelMap.addAttribute("adminList", adminList);
////        System.out.println(10/0);
////        String a=null;
////        System.out.println(a.length());
//        return "target";
//    }
//
//}
