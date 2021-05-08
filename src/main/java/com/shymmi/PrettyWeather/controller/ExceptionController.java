package com.shymmi.PrettyWeather.controller;

import com.shymmi.PrettyWeather.exception.LocationNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@Slf4j
public class ExceptionController {

    @ExceptionHandler(LocationNotFoundException.class)
    ModelAndView handleLocationNotFoundException() {

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("exception", true);
        mav.addObject("weather", "noWeatherInit");

        return mav;
    }
}
