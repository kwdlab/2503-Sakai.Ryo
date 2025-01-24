package com.example.sample1app;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class CustomErrorController 	implements ErrorController {

	    @RequestMapping("/error")
	    public String handleError() {
	        // カスタムエラーページのパスを返す
	        return "error";  // templates/error.html を表示
	    }
}
