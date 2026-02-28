	import java.util.*;

	public class Zero_complex  {
	    
	    public static List<List<Integer>> findNodesWithZeroAndOneParents(List<int[]> pairs) {
	        Map<Integer, Integer> parentCount = new HashMap<>();
	        Set<Integer> individuals = new HashSet<>();
	        
	        // Process pairs
	        for (int[] pair : pairs) {
	            int parent = pair[0];
	            int child = pair[1];
	            
	            individuals.add(parent);
	            individuals.add(child);
	            
	            parentCount.put(child, parentCount.getOrDefault(child, 0) + 1);
	        }
	        
	        List<Integer> zeroParents = new ArrayList<>();
	        List<Integer> oneParent = new ArrayList<>();
	        
	        for (int person : individuals) {
	            if (!parentCount.containsKey(person)) {
	                zeroParents.add(person);
	            } else if (parentCount.get(person) == 1) {
	                oneParent.add(person);
	            }
	        }
	        
	        return Arrays.asList(zeroParents, oneParent);
	    }
	    
	    public static void main(String[] args) {
	        List<int[]> pairs = Arrays.asList(
	            new int[]{5, 6}, new int[]{1, 3}, new int[]{2, 3}, new int[]{3, 6}, new int[]{15, 12},
	            new int[]{5, 7}, new int[]{4, 5}, new int[]{4, 9}, new int[]{9, 12}, new int[]{30, 16}
	        );
	        
	        List<List<Integer>> result = findNodesWithZeroAndOneParents(pairs);
	        System.out.println("Zero parents: " + result.get(0));
	        System.out.println("One parent: " + result.get(1));
	    }
	}