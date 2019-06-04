package com.lxx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch523Application {

	@Value("${book.name}")
	private String bookName;

	@Value("${book.author}")
	private String author;

	@RequestMapping(value = "/")
	String index(){
		return "bookName: "+bookName+"，author："+author;
	}

	public static void main(String[] args) {
		// 更新启动图标信息，
		// 1.在resources目录下新建banner.txt
		// 2.访问http://www.patorjk.com/software/taag生成需要的启动图标信息
		// 3.复制上述生成的信息到banner.txt文件中
		// 4.重启，启动图标更新
		SpringApplication.run(Ch523Application.class, args);

		// 关闭banner图标
		// 方法1
//		 new SpringApplicationBuilder(Ch523Application.class)
//				 .bannerMode(Banner.Mode.OFF).run(args);

		 // 方法2
//		SpringApplication application = new SpringApplication(Ch523Application.class);
//		application.setBannerMode(Banner.Mode.OFF);
//		application.run(args);
	}

}
