import java.util.*;
import java.io.*;

class Product {
	int productCode;
	double cost;
	int quantity;

	Product(int productCode, double cost, int quantity) {
		this.productCode = productCode;
		this.cost = cost;
		this.quantity = quantity;
	}

	double getValue() {
		return cost * quantity;
	}
}

public class MainClass5 {
	public static void main(String[] args) throws IOException {
		Product[] p = new Product[5];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter details of  Product " + (i+1) + ":");
			System.out.print("Product Code: ");
			int code = scanner.nextInt();
			System.out.print("Cost in Rupees: ");
			double cost = scanner.nextDouble();
			System.out.print("Quantity: ");
			int quantity = scanner.nextInt();

			p[i] = new Product(code, cost, quantity);
		}

		    PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("output2.txt")));
			double totalValue = 0;

			for (Product product : p) {
				writer.println("Product Code: " + product.productCode);
				writer.println("Cost: Rs " + String.format("%.2f", product.cost));
				writer.println("Quantity: " + product.quantity);
				double productTotalValue = product.getValue();
				totalValue += productTotalValue;
				writer.println("Total Value: Rs " + String.format("%.2f", productTotalValue));
				writer.println();
			}

			writer.println("Total Value of All Products: Rs " + String.format("%.2f", totalValue));

			System.out.println("Data Copied successfully.");

            writer.close();
        
	} 
}