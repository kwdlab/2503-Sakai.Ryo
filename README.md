# Overview
This is a Java web application built using Spring. Running the application and searching for “http://localhost:8080/secret” in a browser will access a web page approximately 2 MB in size.

# Description
・This web application is used to measure the difference in performance of SpringSecurity's CSRF protection.
・By adding “http.csrf().disable();” to the SecuritytestConfig file located in securitytest\src\main\java\com\example\sample1app, the application is executed with the CSRF countermeasure stopped, The measurement can be performed with and without the CSRF countermeasure.
・A large number of characters are displayed on the “http://localhost:8080/secret” page, but this is to reduce the page size to approximately 2 MB.

# Requirements
jdk-17
org.springframework.boot' version '3.3.4'
io.spring.dependency-management' version '1.1.6'

# Install/Usage
プログラムのインストール法や使い方を書く。
After installation, you can go to /securitytest on the command prompt and run it by “gradlew bootRun”.

# Author
Ryo Sakai

# References
・土岐孝平.プロになるためのSpring入門―ゼロからの開発力養成講座.技術評論社出版,2023,384p.
・掌田津耶乃.SpringBoot3プログラミング入門.秀和システム出版,2023,402p.

# License
MIT
