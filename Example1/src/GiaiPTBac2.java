
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Huy
 */
public class GiaiPTBac2 {
   double[] giaipt(double a, double b, double c){
		double[] ketqua = new double[2];
		
		if(a == 0 && b== 0 && c==0){
			System.out.println("Phuong trinh co vo so nghiem");
			ketqua[0] = 111;
			ketqua[1] = 111;
		}
		else if(a == 0 && b!= 0){
			System.out.println("Phuong trinh co mot nghiem");
			ketqua[0] = -c/b;
			ketqua[1] = -111;
		}
			
		// a!= 0
		else {
			double delta = (b*b - 4*a*c)/2;
			if(delta <0){
				System.out.println("Phuong trinh vo nghiem");
				ketqua[0] = -111;
				ketqua[1] = ketqua[0];
			}
			else if(delta == 0) {
				System.out.println("Phuong trinh co nghiem kep");
				ketqua[0] = -b/(2*a);
				ketqua[1] = -111;
			}
			// delta > 0
			else{
				System.out.println("Phuong trinh co hai nghiem phan biet");
				double s = Math.sqrt(delta);
				ketqua[0] = (-b + s)/(2*a);
				ketqua[1] = (-b - s)/(2*a);			}
		}
		
		return ketqua;
	}

}
