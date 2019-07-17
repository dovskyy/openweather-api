import Model.Current;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    private final static String BASE_CURRENT_WEATHER_API_URL = "https://api.openweathermap.org/data/2.5/weather?q={city_name}&mode=xml&appid=653569218f1415319d188004f271a76e";
    private final static String BASE_5DAY_WEATHER_API_URL = "http://api.openweathermap.org/data/2.5/forecast?q={city_name}&mode=xml&appid=653569218f1415319d188004f271a76e";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w aplikacji do odczytu pogody.");
        String weatherForecastTypeCommand = getCommandFromUser(scanner);
        String city = getCityFromUser(scanner);
        String finalURL = null;


        if (weatherForecastTypeCommand.equalsIgnoreCase("current")){
            finalURL = BASE_CURRENT_WEATHER_API_URL
                    .replace("{city_name}", city);

        }

        if (weatherForecastTypeCommand.equalsIgnoreCase("5day")){
            finalURL = BASE_5DAY_WEATHER_API_URL
                    .replace("{city_name}", city);
        }


        System.out.println("Jakie parametry Cię interesują? [WIND, TEMPERATURE, HUMIDITY, CLOUDS, PRESSURE]. Wpisz  'quit' aby zamknąć.");
        String command;
        Current current = readContentFromURL(finalURL);

        do {
            command = scanner.nextLine().toLowerCase();

            switch (command){
                case "wind":
                    String windSpeed = current.getWind().getSpeed().toString();
                    System.out.println(windSpeed);
                    break;
                case "temperature":
                    BigDecimal bdTemperature = current.getTemperature().getValue();
                    double temperature = bdTemperature.doubleValue() - 273.15;
                    System.out.println(temperature + " stopni Celsjusza");
                    break;
                case "humidity":
                    short humidity = current.getHumidity().getValue();
                    System.out.println("Wilgotność wynosi " + humidity + "%");
                    break;
                case "pressure":
                    int pressure = current.getPressure().getValue();
                    System.out.println("Ciśnienie wynosi " + pressure + "hPa");
                    break;
                case "clouds":
                    String cloudsName = current.getClouds().getName();
                    short cloudsValue = current.getClouds().getValue();
                    System.out.println("Zachmurzenie wynosi " + cloudsValue + "%. Nazwa zachmurzenia: " + cloudsName);
            }

        }while (!command.equalsIgnoreCase("quit"));






    }

    private static Current readContentFromURL(String requestURL) {
        Current current = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Current.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            current = (Current) unmarshaller.unmarshal(new URL(requestURL));
        } catch (JAXBException | MalformedURLException e) {
            e.printStackTrace();
        }
        return current;
    }

    private static String loadContentFromURL (String requestURL) {
        String apiContent = null;
        try {
            URL url = new URL(requestURL);
            InputStream inputStream = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            String lineOfTextFromTheBuilder;

            while ((lineOfTextFromTheBuilder = bufferedReader.readLine()) != null){
                stringBuilder.append(lineOfTextFromTheBuilder);
            }

            bufferedReader.close();
            apiContent = stringBuilder.toString();
            System.out.println(apiContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return apiContent;
    }

    private static String getCityFromUser(Scanner scanner) {
        String chosenCity;
        System.out.println("Wpisz wybrane przez siebie miasto:");

        chosenCity = scanner.nextLine();
        return chosenCity;
    }

    private static String getCommandFromUser (Scanner scanner){
        String chosenOption = null;
        System.out.println("Opcje do wyboru [CURRENT, 5DAY]");

        do {
            System.out.println("Wybierz opcję");
            chosenOption = scanner.nextLine();

            if (!chosenOption.equalsIgnoreCase("CURRENT") && !chosenOption.equalsIgnoreCase("5DAY")){
                chosenOption = null;
                System.err.println("Niepoprawna opcja. Wybierz ponownie opcję.");
            }

        }while (chosenOption == null);
        return chosenOption.toLowerCase();
    }
}
