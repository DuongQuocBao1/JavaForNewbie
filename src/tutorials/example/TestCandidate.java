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
		// xoá bộ nhớ đệm
		scanner.nextLine();
		Candidate[] mangCand = new Candidate[n];
		for (int i = 0; i < mangCand.length; i++) {
			System.out.println("Nhập vào thông tin của thí sinh thứ " + (i + 1) + ":");
			System.out.println("Mã: ");
			int ma = 0;
			while (true) {
				try {
					ma = Integer.parseInt(scanner.nextLine());
					if (ma < 1) {
						System.out.println("Vui lòng nhập số nguyên dương lớn hơn 0");
						continue;
					}
					break;
				} catch (Exception e) {
					System.out.println("Vui lòng chỉ nhập số, mời bạn nhập lại: ");
				}
			}

			System.out.println("Tên: ");
			String ten = scanner.nextLine();

			int diemToan = 0;
			System.out.println("Điểm toán: ");
			Candidate.verifyDiem(diemToan);
			int diemVan = 0;
			System.out.println("Điểm văn: ");
			Candidate.verifyDiem(diemVan);
			int diemAnh = 0;
			System.out.println("Điểm anh: ");
			Candidate.verifyDiem(diemAnh);

			mangCand[i] = new Candidate(ma, ten, diemToan, diemVan, diemAnh);
			// xoá bộ nhớ đệm
//			scanner.nextLine();
		}
		for (Candidate ca : mangCand) {
			System.out.println("Mã: " + ca.getMa() + "| Tên: " + ca.getTen() + "| Điểm Toán: " + ca.getDiemToan()
					+ "| Điểm Văn: " + ca.getDiemVan() + "| Điểm Anh: " + ca.getDiemAnh());
			System.out.println("Tổng điểm của " + ca.ten + ": " + (ca.diemToan + ca.diemVan + ca.diemAnh));

		}
		for (Candidate ca : mangCand) {
			if (ca.diemToan + ca.diemVan + ca.diemAnh >= 15) {
				System.out.println("Đây là các thí sinh có số điểm lớn hơn hoặc bằng 15: ");
				System.out.println("Mã: " + ca.ma + " và Tên: " + ca.ten);
			}
		}
		for (Candidate ca : mangCand) {
			if (ca.diemToan + ca.diemVan + ca.diemAnh < 15) {
				System.out.println("Không có thí sinh nào có điểm >= 15");
			}
		}
	}
}
