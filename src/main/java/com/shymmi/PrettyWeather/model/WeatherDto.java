package com.shymmi.PrettyWeather.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class WeatherDto {
    private String location;
    private String coutry;
    private double temperature;
    private double feelsLike;
    private double windSpeed;
    private double pressure;

    private List<DayDto> forecastDays;
}
