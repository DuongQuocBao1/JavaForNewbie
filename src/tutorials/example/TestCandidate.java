package tutorials.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import tutorials.basic.Person;

public class TestCandidate {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên: ");
		while (true) {
			try {
				n = Integer.parseInt(scanner.nextLine());
				if (n < 1) {
					System.out.println("Vui lòng chỉ nhập số nguyên dương, mời bạn nhập lại: ");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("Vui lòng chỉ nhập số nguyên dương, mời bạn nhập lại: ");
			}
		}

		// xoá bộ nhớ đệm
//		scanner.nextLine();

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
			
			System.out.println("Điểm toán: ");
			float diemToan;
			diemToan = Candidate.nhapDiem();

			System.out.println("Điểm văn: ");
			float diemVan;
			diemVan = Candidate.nhapDiem();

			System.out.println("Điểm anh: ");
			float diemAnh;
			diemAnh = Candidate.nhapDiem();

			mangCand[i] = new Candidate(ma, ten, diemToan, diemVan, diemAnh);

			// xoá bộ nhớ đệm
//			scanner.nextLine();
		}
		for (Candidate ca : mangCand) {
			System.out.println("Mã: " + ca.getMa() + "| Tên: " + ca.getTen() + "| Điểm Toán: " + ca.getDiemToan()
					+ "| Điểm Văn: " + ca.getDiemVan() + "| Điểm Anh: " + ca.getDiemAnh());
			System.out.println("Tổng điểm của " + ca.ten + ": " + (ca.diemToan + ca.diemVan + ca.diemAnh));
		}
		
		

		int flag =0;
		for (Candidate ca : mangCand) {
					if (ca.diemToan + ca.diemVan + ca.diemAnh >= 15) {
						System.out.println("------------------------------------------------------------------");
						System.out.println("Thí sinh "+ca.ten+" mã "+ca.ma+" có số điểm >= 15: ");
							System.out.println("Tổng điểm là: "+ (ca.diemToan + ca.diemVan + ca.diemAnh));
						flag=1;
					}
					
				}
		if(flag==0) {
			System.out.println("-----------------------------------");
			System.out.println("Không có thí sinh nào có điểm >= 15");
			}
		}
}
