//import code to enable user interface,create scanner in scope of entire project, create three seperate methods, add three methods to main, allow  battlestart(); method to have the user input the name of the pokemon, 
import java.util.*;
public class PokemonBattle {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		String Pokemon = battlestart();
		damage();
		statsTable();

	}
	public static String battlestart() {
		System.out.println("Trainer Brock has appeared!!!");
		System.out.println("Zebstrika appeared!!!");
		System.out.print("Which Pokemon do you choose? ");
		String name = userInput.nextLine();
		System.out.println("You chose " + name + "!!!");
		System.out.println("It’s a Pokemon battle between Arcanine and Zebstrika! Go!");
		return name;
		}
	public static void damage() {
		
	}
	public static void statsTable() {
		
	}

}
