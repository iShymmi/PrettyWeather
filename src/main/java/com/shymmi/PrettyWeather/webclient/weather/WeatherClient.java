package com.shymmi.PrettyWeather.webclient.weather;

import com.shymmi.PrettyWeather.model.DayDto;
import com.shymmi.PrettyWeather.model.WeatherDto;
import com.shymmi.PrettyWeather.webclient.weather.dto.WeatherMainDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

@Component
public class WeatherClient {

    private static final String WEATHERAPI_URL = "https://weatherapi-com.p.rapidapi.com/forecast.json";
    private static final String key = "API_KEY";
    private static final String host = "weatherapi-com.p.rapidapi.com";

    private RestTemplate restTemplate = new RestTemplate();

    public WeatherDto getForecastWeatherForCity(String city) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-key",key);
        headers.set("x-rapidapi-host", host);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        WeatherMainDto weatherMainDto = restTemplate.exchange(WEATHERAPI_URL + "?q=" +city +"&days=3",
                                        HttpMethod.GET, entity, WeatherMainDto.class).getBody();

        List<DayDto> days = new ArrayList<>();
        DayDto.builder().build();

        stream(weatherMainDto.getForecast().getForecastday()).forEach((day) -> {
            days.add(DayDto.builder()
                    .date(day.getDate())
                    .maxTemperature(day.getDay().getMaxtemp_c())
                    .minTemperature(day.getDay().getMintemp_c())
                    .sunrise(day.getAstro().getSunrise())
                    .sunset(day.getAstro().getSunset())
                    .build());
        });

        return WeatherDto.builder()
                .location(weatherMainDto.getLocation().getName())
                .coutry(weatherMainDto.getLocation().getCountry())
                .temperature(weatherMainDto.getCurrent().getTemp_c())
                .feelsLike(weatherMainDto.getCurrent().getFeelslike_c())
                .pressure(weatherMainDto.getCurrent().getPressure_mb())
                .windSpeed(weatherMainDto.getCurrent().getWind_mph())
                .forecastDays(days)
                .build();
    }
}
