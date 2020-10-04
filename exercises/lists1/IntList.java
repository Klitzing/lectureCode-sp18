public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
        int size = 0; IntList list = this;
        while (!(list == null)) {
            size = size + 1;
            list = list.rest;
        } 
        return size;    
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
		if (i == 0) {
            return this.first;
        } else {
            return this.rest.get(i - 1);
        }
	}

	public static void main(String[] args) {
		IntList N = new IntList(5, null);
        System.out.println(N.size());       
	}
} 
