import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Merge_2List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> list1 = Arrays.asList(1,3,4,5,6,77,88,99);
    List<Integer> list2 =Arrays.asList(1,2,3,4,5,67,77,76,78);
    List<Integer> list = Stream.concat(list1.stream(), list2.stream()).distinct().toList();
    System.out.println(list);
	}

}
