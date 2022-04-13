public class Main {

	public static void main(String[] args) throws Exception {
		//reponse question 4-1
		float [][]M1 = {{2,1,4,16},{3,2,1,10},{1,3,3,16}};
		Matrice M = new Matrice(M1);
		M.gaussJordanSolveEquations();
		System.out.println("Solution de systeme d'equations:");
		M.afficher();
		
		//reponse question 4-2
		float[][]B = {{2,1},{3,1}};

		Matrice MB = new Matrice(B);
		MB.gaussJordanInverse();
		System.out.println("Inverse de B:");
		MB.afficher();
		
		float [][]A = {{2,-1,0},{-1,2,-1},{0,-1,2}};
		Matrice MA = new Matrice(A);
		MA.gaussJordanInverse();
		System.out.println("Inverse de A:");
		MA.afficher();
		
		
		//reponse question 3
		
		float [][]A2 = {{2,-1,0,10},{-1,2,-1,-4},{0,-1,2,2}};
		Matrice MA2 = new Matrice(A2);
		MA2.gaussJordanSolveEquations();
		System.out.println("Solution de A*x=b:");
		MA2.afficher();
		
		
		// Question 4
		MA = new Matrice(A);
		MB = new Matrice(B);
		Matrice x1 = MA.multiply(MA.transpose());
		Matrice x2 = MB.multiply(MB.transpose());
		System.out.println("A*A^(-1) :");
		x1.afficher();
		System.out.println("B*B^(-1) :");
		x2.afficher();
		

        
	}

}
