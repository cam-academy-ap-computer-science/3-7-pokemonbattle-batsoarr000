/*import code to enable user interface,
 *create scanner in scope of entire project, 
 *create three seperate methods, 
 *add three methods to main,
 *allow  battlestart(); method to have the user input the name of the pokemon, battlestart(); should return name 
 *method damage should print opponents attack, damage done, ending HP
 *method statsTable(); should print out final stats of your pokemon with new HP value
 *enter the name Alakazam for testing*/
import java.util.*;
public class PokemonBattle {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		String pokename = battlestart();
		System.out.println();
		double HP = damage(pokename);
		System.out.println();
		statsTable(pokename, HP);

	}
	//user picks the pokemon and the interface applies the name where ever the string is requested//
	public static String battlestart() {
		System.out.println("Trainer Brock has appeared!!!");
		System.out.println("Zebstrika appeared!!!");
		System.out.print("Which Pokemon do you choose? ");
		String name = userInput.nextLine();
		System.out.println("You chose " + name + "!!!");
		System.out.println("It’s a Pokemon battle between " + name + " and Zebstrika! Go!");
		return name;
		}
	//opponent attack and stat table along with HP after damage//
	public static double damage(String name) {
		double  STAB = 9;
		double Modifier = (0.85 + Math.random() * 0.15) * STAB;
		double Base = 1;
		double Defense = 51;
		double Attack = 52;
		int Level = 40;
		int HP = 96;
		double damage = ((((2 * Level + 10) / 250) + (Attack / Defense) * Base + 2) * Modifier);
		System.out.println(name + " used Thenderbolt!");
		System.out.println("Triner, what are your " + name + "'s stats?");
		System.out.println("Level:");
		System.out.println("Attack:");
		System.out.println("Defense:");
		System.out.println("Base:");
		System.out.println("STAB:");
		System.out.println("HP:");
		System.out.println(name + " sustained " + (int)(damage) + " points damage.");
		System.out.println("HP, after damage, are now " + (int)(HP - damage) + ".");
		return (int)(HP - damage);
	}
	//end stats for the pokemon after attack//
	public static void statsTable(String name, double HP) {
		System.out.println("Name    " + name);
		System.out.println("Level   40");
		System.out.println("------------------------------");
		System.out.println("HP    	" + (int)HP + "/96");
		System.out.println("ATTACK	52");
		System.out.println("DEFENSE   51");
		System.out.println("SP. ATK   121");
		System.out.println("SP. DEF   81");
		System.out.println("SPEED 	107");
		System.out.println("------------------------------");
	}

}
