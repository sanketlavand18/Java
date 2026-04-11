package Assignment_1;

import java.util.Comparator;

public class Q11_DesgComparator implements Comparator<Q11_EmpCollection> {
	@Override
	public int compare(Q11_EmpCollection o1, Q11_EmpCollection o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
