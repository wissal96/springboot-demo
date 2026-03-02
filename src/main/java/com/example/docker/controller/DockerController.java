package com.example.docker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/docker")
    public String dockerDemo(){
        return "Dockerizing spring boot application";
    }
}
#git init
#git add README.md
#git commit -m "first commit"
#git branch -M main
#git remote add origin https://github.com/wissal96/springboot-demo.git
#git push -u origin main