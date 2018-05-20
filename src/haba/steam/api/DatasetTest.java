package haba.steam.api;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DatasetTest {

	
	@Test
	public void testTorstenHorn1(){
		List<String> meineStringListe = new ArrayList<String>();
		meineStringListe.add( "abc");
		meineStringListe.add( "");
		meineStringListe.add( "  def  ");
		meineStringListe.add( null);
		meineStringListe.add( "ghi");
		meineStringListe.add( "  ");
		meineStringListe.add( "xyz");
		meineStringListe.removeIf( s -> s == null );
		meineStringListe.replaceAll( String::trim );
		meineStringListe.removeIf( String::isEmpty );
		meineStringListe
		.stream()
		.map(xxx -> "["+xxx+"]")
		.forEach( System.out::println );		
	}
		
	@Test
	public void testSYSO(){
		 char[] suffix = new char[] {'.','t','x','t'};

		 Arrays.stream(new String[] {"readme", "releasenotes"})
		       .map( StringBuilder::new )
		       .map(s->s.append(suffix))
		       .forEach(System.out::println); 		
	}
	
	@Test
	public void test2() {
        Dataset.of(Arrays.asList("шла", "саша", "по", "шоссе"))
        .union(Arrays.asList("и", "сосала", "сушку"))
        .filter(s -> s.length() > 4)
        .map(s -> s + ", length=" + s.length())
        .forEach(System.out::println);
	}
	
	@Test
	public void test() {
		
		 Dataset.of(Arrays.asList("foo", "bar")).forEach(System.out::println);

	}

}
