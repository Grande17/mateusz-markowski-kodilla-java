package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemparatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double getAverageTemperature() {
        double sum = 0;
        for (Map.Entry<String, Double> i : temperatures.getTemparatures().entrySet()) {
            double value = i.getValue();
            sum += value;
        }
        double avg = sum / temperatures.getTemparatures().size();
        return avg;

    }

    public double getMediana() {
        double mediana = 0;
        List<Double> onlyTemp = new ArrayList<>();

        for (Map.Entry<String, Double> temp : temperatures.getTemparatures().entrySet()) {
            temp.getValue();
            onlyTemp.add(temp.getValue());
        }
        Collections.sort(onlyTemp);
        if (onlyTemp.size() % 2 == 1) {
            mediana = onlyTemp.get((onlyTemp.size()+1) / 2 - 1);
        } else {
            double high = onlyTemp.get(onlyTemp.size()/2);
            double low = onlyTemp.get(onlyTemp.size()/2 - 1);
            mediana = (high+low) /2.0;
            return mediana;


        }
        return mediana;
    }
}
