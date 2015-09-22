package q4;

import java.util.Scanner;

public class UPCScanner {
	private Scanner scanner;

	public UPCScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public int scanUPC() {
		return scanner.nextInt();
	}

	public Boolean lastItemScanned() {
		return !scanner.hasNext();
	}
}
