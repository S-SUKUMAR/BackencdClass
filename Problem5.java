
public class Problem5 {
	    public static void main(String[] args) {
	        // Total number of packets received
	        int totalPackets = 1193;

	        // Calculate the number of dozens and extra packets
	        int dozens = totalPackets / 12;
	        int extraPackets = totalPackets % 12;

	        // Display the result
	        System.out.println("The hospital has received:");
	        System.out.println(dozens + " dozen(s) of packets");
	        System.out.println("and " + extraPackets + " extra packet(s).");
	    }
	}
