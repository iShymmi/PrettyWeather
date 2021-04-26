package com.shymmi.PrettyWeather.webclient.weather.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class ForecastDayDto {
    private String date;

    private DayDto day;
    private AstroDto astro;
}
