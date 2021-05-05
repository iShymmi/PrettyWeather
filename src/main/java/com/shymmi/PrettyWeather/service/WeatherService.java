package com.shymmi.PrettyWeather.service;

import com.shymmi.PrettyWeather.model.WeatherDto;
import com.shymmi.PrettyWeather.exception.LocationNotFoundException;

public interface WeatherService {

    public WeatherDto getWeather(String location) throws LocationNotFoundException;
}
