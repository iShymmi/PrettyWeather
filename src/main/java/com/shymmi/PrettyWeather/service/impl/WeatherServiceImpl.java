package com.shymmi.PrettyWeather.service.impl;

import com.shymmi.PrettyWeather.model.WeatherDto;
import com.shymmi.PrettyWeather.service.WeatherService;
import com.shymmi.PrettyWeather.webclient.weather.WeatherClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final WeatherClient weatherClient;

    @Override
    public WeatherDto getWeather(String lcoation) {
        return weatherClient.getForecastWeatherForCity(lcoation);
    }
}
