package com.shymmi.PrettyWeather.webclient.weather.dto;

import lombok.Getter;

import static java.util.Arrays.stream;

@Getter
public class ForecastDto {
    private ForecastDayDto[] forecastday;
}
