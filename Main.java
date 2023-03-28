import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź tekst: ");
        String text = scanner.nextLine();

        System.out.print("Chcesz zamienić litery na: (u)ppercase, (l)owercase? ");
        char option = scanner.next().charAt(0);

        String convertedText = "";
        if (option == 'u') {
            convertedText = text.toUpperCase();
        } else if (option == 'l') {
            convertedText = text.toLowerCase();
        } else {
            System.out.println("Nieprawidłowa opcja.");
            System.exit(0);
        }

        System.out.println("Tekst po konwersji: " + convertedText);
  }
}