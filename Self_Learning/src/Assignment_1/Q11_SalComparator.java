package Assignment_1;

import java.util.Comparator;

public class Q11_SalComparator implements Comparator<Q11_EmpCollection> {

	@Override
	public int compare(Q11_EmpCollection o1, Q11_EmpCollection o2) {
		return o1.getSal().compareTo(o2.getSal());
	}
}
