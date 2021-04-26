package com.shymmi.PrettyWeather.webclient.weather.dto;


import lombok.Getter;

import java.util.Date;

@Getter
public class CurrentDto {

    private String last_updated;

    private double temp_c;
    private double feelslike_c;
    private double wind_mph;
    private double pressure_mb;
}
