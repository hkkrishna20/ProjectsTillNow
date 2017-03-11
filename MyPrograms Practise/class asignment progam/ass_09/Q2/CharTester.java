public class CharTester
{
	public static void main(String args[])
		{
			CharSet s=new CharSet();
			System.out.println("Character Set--");
			s.addAtLast('z');
			System.out.println(s.set);
			s.addAtLast('f');
			System.out.println(s.set);
			s.addAtLast('n');
			System.out.println(s.set);
			s.addAtLast('z');
			System.out.println(s.set);
			s.addAtLast('f');
			System.out.println(s.set);
			s.addAtLast('f');
			System.out.println(s.set);
			s.addAtLast('z');
			System.out.println(s.set);
			
			s.remove('z');
			System.out.println(s.set);			

			/*System.out.println("Sorted Character Set--");
			CharSortedSet sset=new CharSortedSet();
			sset.addAtLast('b');
			System.out.println(sset.set);
			sset.addAtLast('z');
			System.out.println(sset.set);
			sset.addAtLast('n');
			System.out.println(sset.set);
			sset.addAtLast('y');
			System.out.println(sset.set);*/
			
			
		}
}