package exam3;
import java.util.ArrayList;
public class CountriesMain {
	
		public static void main(String[] args) {

			Countries countries = new Countries();

			ArrayList<String> indianStates = new ArrayList<>();
			indianStates.add("Maharashtra");
			indianStates.add("Delhi");
			indianStates.add("punjab");

			ArrayList<String> usStates = new ArrayList<>();
			usStates.add("California");
			usStates.add("Alska");
			usStates.add("Colorado");
			

			countries.listingCountry("India", indianStates);
			countries.listingCountry("US", usStates);

			System.out.println("-------Calling getCountry Method with Valid Country-------");
			System.out.println(countries.getCountry("India"));

			System.out.println("\n-------Calling getCountry Method with Invalid Country-------");
			System.out.println(countries.getCountry("Srilanka"));

			System.out.println("\n-------Calling listCountryBefore Method with Country India-------");
			countries.listCountryBefore("India");

			System.out.println("\n-------Calling listCountryAfter Method with Country US-------");
			countries.listCountryAfter("US");

		}
}
