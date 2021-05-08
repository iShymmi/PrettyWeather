package com.shymmi.PrettyWeather.controller;

import com.shymmi.PrettyWeather.model.WeatherDto;
import com.shymmi.PrettyWeather.service.WeatherService;
import com.shymmi.PrettyWeather.exception.LocationNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@Slf4j
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping({"","/","/weather"})
    public String getWeather(@RequestParam(value="l") Optional<String> location, Model model) throws LocationNotFoundException {
        WeatherDto weather = new WeatherDto();

        if(!location.isPresent()) {
            return noWeatherInitIndex(model);
        }

        weather = weatherService.getWeather(location.get());

        model.addAttribute("weather", weather);
        model.addAttribute("localDate", LocalDate.now());

        return "index";
    }

    private String noWeatherInitIndex(Model model) {
        model.addAttribute("weather", "noWeatherInit");
        return "index";
    }

}
