package tutorials.example;

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
	String ma;
	String ten;
	String diemToan;
	String diemVan;
	String diemAnh;
	public static void main(String[] args) {
		
	}
	public Candidate() {
	}
	public Candidate(String ma, String ten, String diemToan, String diemVan, String diemAnh) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemAnh = diemAnh;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(String diemToan) {
		this.diemToan = diemToan;
	}
	public String getDiemVan() {
		return diemVan;
	}
	public void setDiemVan(String diemVan) {
		this.diemVan = diemVan;
	}
	public String getDiemAnh() {
		return diemAnh;
	}
	public void setDiemAnh(String diemAnh) {
		this.diemAnh = diemAnh;
	}
	
}
