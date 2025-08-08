package arrays_2d;
import java.util.ArrayList;
import java.util.List;

public class ArrayList2D {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(10);
		a.add(15);
		List<Integer> b = new ArrayList<Integer>();
		b.add(20);
		b.add(25);
		List<Integer> c = new ArrayList<Integer>();
		List<Integer> d = new ArrayList<Integer>();
		d.add(30);
		
		List<List<Integer>> l = new ArrayList<>();
		l.add(a);
		l.add(b);
		l.add(c);
		l.add(d);
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println();
		
		System.out.println(l.get(1).get(1));
		System.out.println();
		
		for(int i=0;i<l.size();i++) {
			List<Integer> x = l.get(i);
			for(int j=0;j<x.size();j++) {
				System.out.print(x.get(j) + " ");
			}
			System.out.println();
		}
		
	}

}
