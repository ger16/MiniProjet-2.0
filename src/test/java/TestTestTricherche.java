import org.junit.*;
import static org.junit.Assert.*;
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
		
		
	}
	@Test
	public void testMethodes2(){
		TriCherche un = new TriCherche();
		
		assertEquals(un.getValeurCherchee(),un.getTab()[0]);
		
	}
	@Test
	public void testMethodes3(){
		int t[]= {1,2,3,4,5,6,7,8,9,10};
		TestTricherche un = new TestTricherche(t,1);
		assertTrue(un.verifTri(t));
		
	}
	@Test
	public void testMethodes4(){
		int t[]= {1,2,3,4,5,6,7,8,9,10};
		TestTricherche un = new TestTricherche(t,1);
		assertTrue(un.verifEntier());
		
	}
	@Test
	public void testMethodes5(){
		int t[]= {1,2,3,4,5,6,7,8,9,10};
		TestTricherche un = new TestTricherche(t,1);
		assertFalse(un.verifValNull(t));
		
	}
	@Test
	public void testMethodes6(){
		int t[]= {1,2,3,4,5,6,7,8,9,10};
		TestTricherche un = new TestTricherche(t,1);
		assertTrue(un.elementExist(t,5));
		
	}
	@Test
	public void testMethodes7(){
		int t[]= {1,2,3,4,5,6,7,8,9,10};
		TestTricherche un = new TestTricherche(t,1);
		assertTrue(un.verifTailleTab(t));
		
	}
}