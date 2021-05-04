package com.shymmi.PrettyWeather.controller;

import com.shymmi.PrettyWeather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather(@RequestParam(value="l") String location, Model model) {
        model.addAttribute("weather", weatherService.getWeather(location));
        model.addAttribute("localDate", LocalDate.now());

        return "index";
    }

    @RequestMapping({"","/"})
    public String index(Model model){
        model.addAttribute("weather", "noWeatherInit");
        return "index";
    }

}
