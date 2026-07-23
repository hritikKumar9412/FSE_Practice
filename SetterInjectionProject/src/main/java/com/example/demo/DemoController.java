package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
//    public DemoController(Coach myCoach){
//        this.myCoach = myCoach;
//    }
//    @GetMapping("/dailyWorkout")
//    public String getDailyWorkout(){
//        return myCoach.getDailyWorkout();
//    }

    @Autowired
    public void setMyCoach(Coach myCoach) {

        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyworkout()
    {
        return myCoach.getDailyWorkout();
    }

}
