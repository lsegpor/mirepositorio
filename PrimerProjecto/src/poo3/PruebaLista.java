package poo3;

public class PruebaLista {

	public static void main(String[] args) {
		Lista l1=new Lista();
		System.out.println(l1);
		l1.add(8);
		l1.add(-1);
		System.out.println(l1);
//		l1.remove(0);
//		System.out.println(l1);
		
		Lista l2= new Lista(10);
		l2.add(9);
		l2.add(24);
		l2.add(-6);
		
		l1.add(l2);
		System.out.println(l1);
		
		System.out.println(l2.get(2));
		
		System.out.println(l2.getIndexOf(24));
		System.out.println(l2.getIndexOf(100));
		
		System.out.println(l1.getIndexOf(24));
		
		l1.add(100, 2);
		System.out.println(l1);
		
		l1.remove(0);
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		
		
	}

}