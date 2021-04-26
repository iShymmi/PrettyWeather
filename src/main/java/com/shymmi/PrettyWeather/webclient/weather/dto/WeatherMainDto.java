package com.shymmi.PrettyWeather.webclient.weather.dto;

import lombok.Getter;

@Getter
public class WeatherMainDto {

    private LocationDto location;
    private CurrentDto current;
    private ForecastDto forecast;
}
