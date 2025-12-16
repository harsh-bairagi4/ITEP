import java.util.Scanner; 

 class TemperatureConverter {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); 

    System.out.println("Enter 'C' to convert Fahrenheit to Celsius, or 'F' to convert Celsius to Fahrenheit: ");
    char choice = scanner.next().toLowerCase().charAt(0); 

    System.out.println("Enter the temperature value: ");
    double temperature = scanner.nextDouble(); 

    if (choice == 'c') { 
      double celsius = (temperature - 32) * 5 / 9.0;
      System.out.printf("%.2f°F is equal to %.2f°C.%n", temperature, celsius);
    } else if (choice == 'f') { 
      double fahrenheit = (temperature * 9 / 5.0) + 32;
      System.out.printf("%.2f°C is equal to %.2f°F.%n", temperature, fahrenheit);
    } else {
      System.out.println("Invalid choice. Please enter 'C' or 'F'.");
    }

 
  }
}
