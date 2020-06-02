package tutorials.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestCandidate {
	public static void main(String[] args) {
		    int n;
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Nhập vào số nguyên: ");
		    n = scanner.nextInt();
		    Candidate[] mangCand = new Candidate[n];
			    for (int i = 1; i <= mangCand.length; i++) {
			    	System.out.println("Nhập vào thông tin của thí sinh thứ "+i+":"); 
			    	scanner.nextLine();
			    	System.out.println("Mã: ");
			    	String ma = scanner.nextLine();
			    	System.out.println("Tên: ");
			    	String ten = scanner.nextLine();
			    	System.out.println("Điểm toán: ");
			    	String diemToan = scanner.nextLine();
			    	System.out.println("Điểm văn: ");
			    	String diemVan = scanner.nextLine();
			    	System.out.println("Điểm anh: ");
			    	String diemAnh = scanner.nextLine();
			    	scanner.nextLine();
			    	mangCand[i] = new Candidate(ma,ten,diemToan,diemVan,diemAnh);
				}
			    for (Candidate candidate : mangCand) {
					System.out.println("Mã: "+candidate.getMa()+"| Tên: "+candidate.getTen()+"| Điểm Toán: "+candidate.getDiemToan()+"| Điểm Văn: "+candidate.getDiemVan()+"| Điểm Anh: "+candidate.getDiemAnh());
			    }
	}
}
