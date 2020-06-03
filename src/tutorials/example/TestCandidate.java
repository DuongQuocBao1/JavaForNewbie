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
			while (true) {
				try {
					diemToan = Integer.parseInt(scanner.nextLine());
					if (diemToan < 1 || diemToan > 10) {
						System.out.println("Vui lòng nhập số từ 1 đến 10: ");
						continue;
					}
					break;
				} catch (Exception e) {
					System.out.println("Vui lòng chỉ nhập số 1-10, mời bạn nhập lại: ");
				}
			}
			int diemVan = 0;
			System.out.println("Điểm văn: ");
			while (true) {
				try {
					diemVan = Integer.parseInt(scanner.nextLine());
					if (diemVan < 1 || diemVan > 10) {
						System.out.println("Vui lòng nhập số từ 1 đến 10: ");
						continue;
					}
					break;
				} catch (Exception e) {
					System.out.println("Vui lòng chỉ nhập số 1-10, mời bạn nhập lại: ");
				}
			}

			int diemAnh = 0;
			System.out.println("Điểm anh: ");
			while (true) {
				try {
					diemAnh = Integer.parseInt(scanner.nextLine());
					if (diemAnh < 1 || diemAnh > 10) {
						System.out.println("Vui lòng nhập số từ 1 đến 10: ");
						continue;
					}
					break;
				} catch (Exception e) {
					System.out.println("Vui lòng chỉ nhập số 1-10, mời bạn nhập lại: ");
				}
			}

			mangCand[i] = new Candidate(ma, ten, diemToan, diemVan, diemAnh);
			// xoá bộ nhớ đệm
//			scanner.nextLine();
		}
		for (Candidate ca : mangCand) {
			System.out.println("Mã: " + ca.getMa() + "| Tên: " + ca.getTen() + "| Điểm Toán: " + ca.getDiemToan()
					+ "| Điểm Văn: " + ca.getDiemVan() + "| Điểm Anh: " + ca.getDiemAnh());
			System.out.println("Tổng điểm của " + ca.ten + ": " + (ca.diemToan + ca.diemVan + ca.diemAnh));

		}
		System.out.println("Đây là các thí sinh có số điểm lớn hơn 15: ");
		// To do something ...
		for (Candidate ca : mangCand) {
			if (ca.diemToan + ca.diemVan + ca.diemAnh > 15) {
				System.out.println("Mã: " + ca.ma + " và Tên: " + ca.ten);
			} else {
				System.out.println("Không có");
			}
		}
	}
}
