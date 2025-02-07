package dp;

import java.util.PriorityQueue;

public class ConnectRope {
	//greedy
	public static void connectRope(int[] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i =0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		int res = 0;
		while(pq.size() > 1) {
			int firstRope = pq.poll();
			int secondRope = pq.poll();
			res = res + firstRope + secondRope;
			pq.add(firstRope + secondRope);
//			pq.add(firstRope + secondRope);
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		int[] arr = {4,3,2,6};
		connectRope(arr);

	}

}
