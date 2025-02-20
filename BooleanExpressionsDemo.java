public class BooleanExpressionsDemo {
    public static void main(String[] args) {
        
      
        boolean isSunny = true;  
        boolean hasClouds = false; 

        int temperature = 25; 
        int windSpeed = 15; 
        boolean isHot = temperature > 30; 
        boolean isBreezy = windSpeed <= 20; 
        boolean goodWeather = isSunny && !hasClouds; 
        boolean okWeather = isSunny || isBreezy; 
        boolean isCloudy = !isSunny; 
        boolean variableWeather = isSunny ^ hasClouds; 

     
        System.out.println("Is it sunny? " + isSunny);
        System.out.println("Are there clouds? " + hasClouds);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Wind Speed: " + windSpeed + " km/h");
        System.out.println("Is it hot outside? " + isHot);
        System.out.println("Is it breezy? " + isBreezy);
        System.out.println("Good weather (sunny and no clouds)? " + goodWeather);
        System.out.println("Is the weather okay (sunny or breezy)? " + okWeather);
        System.out.println("Is it cloudy? " + isCloudy);
        System.out.println("Exclusive OR (sunny XOR clouds)? " + variableWeather);
    }
}
