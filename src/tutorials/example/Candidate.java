package tutorials.example;

import java.util.Scanner;

//Xây dựng lớp Candidate (Thí sinh) gồm các thuộc tính: mã, tên, ngày tháng năm sinh, điểm thi Toán, Văn, Anh và các phương thức cần thiết.
//Xây dựng lớp TestCandidate để kiểm tra lớp trên:
//tức là người dùng nhập vào 5
//thì tiếp tục nhập 5 dòng thông tin
//cho đến khi nhập xong 5 dòng
//thì xuất ra các thí sinh có điểm >15
//
//List<Candidate> aaa = new List<Candidate>
//for(i=1;i<=n,i++) {
//aaa.add(candidate)
//}

public class Candidate {
	int ma;
	String ten;
	float diemToan;
	float diemVan;
	float diemAnh;
	public static void main(String[] args) {
		
	}
	
	public Candidate() {
	}
	
	public Candidate(int ma, String ten, float diemToan, float diemVan, float diemAnh) {
		this.ma = ma;
		this.ten = ten;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemAnh = diemAnh;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}
	public float getDiemVan() {
		return diemVan;
	}
	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}
	public float getDiemAnh() {
		return diemAnh;
	}
	public void setDiemAnh(float diemAnh) {
		this.diemAnh = diemAnh;
	}

	public static float nhapDiem() {
		float diem;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
			diem =Float.parseFloat(scanner.nextLine());
				if (diem < 1 || diem > 10) {
					System.out.println("Vui lòng nhập số từ 1 đến 10: ");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("Vui lòng chỉ nhập số 1-10, mời bạn nhập lại: ");
			}
		}
		return diem;
	}
	
}
