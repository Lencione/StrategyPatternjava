import controllers.TaxController;
import services.IcmsService;

import java.util.Scanner;

public class Routine {
  private final Scanner scanner = new Scanner(System.in);
  private TaxController taxCalculator;
  public void handle() {
    System.out.println("Running...\n\n");

    System.out.println("What's your product name?");
    String productName = scanner.nextLine();

    System.out.println("\n\nWhat's your product price?");
    double productPrice = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("\n\nWhat's your product category?");
    System.out.println("[1] - Imported");
    System.out.println("[2] - National");
    int category = scanner.nextInt();
    scanner.nextLine();

    System.out.println("\n\nProduct: " + productName + ", Price: " + productPrice + ", Category: " + category);
    System.out.println("Calculating products taxes...");

    System.out.println("\n\nCalculating ICMS...");
    taxCalculator = new TaxController(new IcmsService());
    productPrice = taxCalculator.calculate(productPrice);

    System.out.println("Product with ICMS: " + productPrice);

    System.out.println("\n\nCalculanting ISS...");
    taxCalculator.setService(new services.IssService());
    productPrice = taxCalculator.calculate(productPrice);

    System.out.println("Product with ISS: " + productPrice);

    if(category == 1){
      System.out.println("\n\nCalculanting IOF...");
      taxCalculator.setService(new services.IofService());
      productPrice = taxCalculator.calculate(productPrice);
      System.out.println("Product with IOF: " + productPrice);
    }

    System.out.println("\n\nProduct: " + productName + ", Price: " + productPrice + ", Category: " + category);
    System.out.println("Done!");
  }
}
