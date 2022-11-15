package Main;

import Database.DatabaseConnection;
import Database.DatabaseQueries;
import Scraping.ScrapingFromOzone;

import javax.swing.text.Document;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.SQLException;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, UTF_8));
		String link = sc.nextLine();
		ScrapingFromOzone sfo = new ScrapingFromOzone();
		DatabaseConnection dbc = new DatabaseConnection();
		DatabaseQueries dbq = new DatabaseQueries();
		Document doc;
		dbc.open();
		sfo.connectToWebSite(link);
		DatabaseConnection.close();
	}
}