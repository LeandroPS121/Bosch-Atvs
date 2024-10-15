package Models;

import java.time.LocalDateTime;
import java.util.UUID;

public class WeatherQuery {

    private final String id; // Final: nao permite alterações
    private LocalDateTime date;
    private Double latitude;
    private Double longitude;
    private WeatherResponse weatherResponse;


    public WeatherQuery(LocalDateTime date, Double latitude, Double longitude, WeatherResponse weatherResponse) {
        this.id = UUID.randomUUID().toString(); // Gera um ID único
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
        this.weatherResponse = weatherResponse;
    }

    // Get e set
    public String getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return date;
    }

    public void setDateTime(LocalDateTime date) {
        this.date = date;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public WeatherResponse getWeatherResponse() {
        return weatherResponse;
    }

    public void setWeatherResponse(WeatherResponse weatherResponse) {
        this.weatherResponse = weatherResponse;
    }
}