package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @Author zfj
 * @create 2019/7/30 17:33
 */
@Controller
@RequestMapping("/file")
public class FileController {
    @RequestMapping("/upload")
    public String upload(String username,@RequestParam CommonsMultipartFile file){
        System.out.println("用户名："+username);
        System.out.println("表单名称："+file.getName());
        System.out.println("文件名："+file.getOriginalFilename());
        System.out.println("文件的大小："+file.getSize());
        return "success";
    }
}
