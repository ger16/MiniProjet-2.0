package test.java;

import main.java.TriCherche;

import org.junit.*;

public class TestTriCherche {

	/*public static void main(String[] args) {
	TriCherche un = new TriCherche();
	//un.remplirTab();
	System.out.println(un);
	un.triTab();
	System.out.println(un);
	}*/
	@Test
	public void testMethodes(){
		TriCherche un = new TriCherche();
		assertEquals(10,un.getTab().length);
		assertEquals(un.getValeurCherchee(),un.getTab()[0]);
		
	}
}