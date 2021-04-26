package com.shymmi.PrettyWeather.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class WeatherDto {
    private String location;
    private String coutry;
    private double temperature;
    private double feelsLike;
    private double windSpeed;
    private double pressure;

    private List<DayDto> forecastDays;
}
