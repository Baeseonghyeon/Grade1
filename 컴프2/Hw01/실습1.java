package Hw01;
import java.util.*;
class Matrix{
	int row;
	int col;
	double[][] matrix;
	int row1=0;
	int col2=0;
	
	public Matrix(int row,int col) {
		matrix=new double[row][col];
		this.row=row;
		this.col=col;
	}
	public void setMatrix(double... d) {
		for(double i:d) {//col2 와 row1 은 카운트 세기위함. for문이 돌아갈때마다 ++함.
			matrix[row1][col2]=i;
			col2++;
		}
		row1++;col2=0;
	}
	public Matrix addMatrix(Matrix otherMatrix) {
		Matrix m=new Matrix(this.row,this.col);//반환값을 만들기 위해 매트릭스 객체 m을 생성
		m.matrix=new double[this.row][this.col];//객체 m의 행과 열을 생성
		for(int i=0;i<this.row;i++) {//같은 행 같은 열을 더합
			for(int j=0;j<col;j++) {
				m.matrix[i][j]=this.matrix[i][j]+otherMatrix.matrix[i][j];
			}
		}
		return m;
	}
	public Matrix multiMatrix(Matrix otherMatrix) {
		Matrix m=new Matrix(this.row,otherMatrix.col);
		for(int i=0;i<this.row;i++) {//첫번째행렬의 행 
			for(int k=0;k<otherMatrix.col;k++) {//두번째 행렬의 열
				for(int j=0;j<this.col;j++) {//세번째 행렬의 행을 곱
					m.matrix[i][k]+=this.matrix[i][j]*otherMatrix.matrix[j][k];
				}
			}
		}
		return m;
		
	}
	public Matrix transposed() {
		Matrix m=new Matrix(this.col,this.row);
		for(int i=0;i<this.col;i++) {
			for(int j=0;j<this.row;j++) {//행렬의 행과 열을 교환
				m.matrix[i][j]=this.matrix[j][i];
			}
		}
		return m;
	}
	public void print() {
		System.out.print("[");
		for(int i=0;i<this.row;i++) {
		System.out.print(Arrays.toString(this.matrix[i]));
		if(i!=this.row-1) {
			System.out.println();
		}
		}
		System.out.println("]");
	}
}
public class 실습1 {

	public static void main(String[] args) {
		Matrix mat1 =new Matrix(3,2);
		mat1.setMatrix(1,-2);
		mat1.setMatrix(3,4);
		mat1.setMatrix(5,6);
		Matrix mat2=new Matrix(2,3);
		mat2.setMatrix(1,2,3);
		mat2.setMatrix(4,5,6);
		System.out.println("첫번쨰 행렬");
		mat1.print();
		System.out.println();
		System.out.println("두번째 행렬");
		mat2.print();
		System.out.println();
		System.out.println("두 행렬의 곱셈");
		mat1.multiMatrix(mat2).print();
		System.out.println();
		System.out.println("첫번째 행렬 + 첫 번째 행렬");
		mat1.addMatrix(mat1).print();
		
		System.out.println();
		System.out.println("두번째 행렬의 전치행렬");
		mat2.transposed().print();

	}

}
