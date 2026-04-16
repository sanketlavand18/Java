package Assignment_1;

import java.util.Objects;

public class Q17_Set {

	int id;
	String Name;

	public Q17_Set(int i, String name) {
		this.id = i;
		this.Name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Name, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Q17_Set other = (Q17_Set) obj;
		return Objects.equals(Name, other.Name) && id == other.id;
	}

}
