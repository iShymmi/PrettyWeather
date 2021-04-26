package com.shymmi.PrettyWeather.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class DayDto {

    private String date;
    private double maxTemperature;
    private double minTemperature;
    private String sunrise;
    private String sunset;
}
