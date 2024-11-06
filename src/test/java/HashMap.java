public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, String> capitalCities = new java.util.HashMap<>();


        capitalCities.put("USA", "Washington D.C.");
        capitalCities.put("France", "Paris");
        capitalCities.put("Japan", "Tokyo");


        System.out.println("Capital of France: " + capitalCities.get("France"));


        capitalCities.remove("USA");


        System.out.println("\nRemaining countries and their capitals:");
        for (String country : capitalCities.keySet()) {
            System.out.println(country + ": " + capitalCities.get(country));
        }
    }
}
