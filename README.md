# PrettyWeather

## Overview

Java-based web application built with Spring MVC to display weather for given location.

This application is using data from [WeatherAPI](https://rapidapi.com/weatherapi/api/weatherapi-com)

## Purpose of creation

Application was built to 

   - learn how to develop simple web applications with Spring Web MVC
   - retrieve and process data from external API
   - serve data to user as Web Content

## How to run
   ### Preparation
   1. At first you need to get your API Key from [WeatherAPI](https://rapidapi.com/weatherapi/api/weatherapi-com)
   2. Past your API key in config file  
      ```(src/main/java/com/shymmi/PrettyWeather/webclient/weather/WeatherClient.java)```  
    
    ...
    
    private static final String key = "YOUR_API_KEY;
     
    ...
    
   ### Run application with maven
   
   
   ``` mvn spring-boot:run```
   
## Endpoints
   
   1) localhost:8080 and localhost:8080/weather - index page
   2) localhost:8080/weather?l={location} - weather for given location 

## Preview

Index page:

![image](https://user-images.githubusercontent.com/15768915/117686767-78474400-b1b7-11eb-939d-d9dd30d81372.png)

Weather display:

![image](https://user-images.githubusercontent.com/15768915/117687182-d3793680-b1b7-11eb-980a-d23a3e2362ea.png)

Location not found:

![image](https://user-images.githubusercontent.com/15768915/117687251-e7249d00-b1b7-11eb-822f-6b1a17f908cc.png)
