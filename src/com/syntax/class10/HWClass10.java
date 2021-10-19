package com.syntax.class10;

public class HWClass10 {

	public static void main(String[] args) {
		
	// HW 10 TASK1	

	String [][] cars= {
			
			{"Tesla","Chevrolet","GMC","Ford"},
			{"Mercedes","BMW","Porsche","Audi"},
			{"Hyundai","Kia","GM","Asia"},
			{"Fiat","Ferrari","Lamborghini","Maserati"}

	};
		
		System.out.println("American cars are "+ cars[0][0]+" "+ cars[0][1]+" "+cars[0][2]+" "+ cars[0][3]);
		System.out.println("German cars are "+ cars[1][0]+" "+ cars[1][1]+" "+cars[1][2]+" "+ cars[1][3]);
		System.out.println("Korean cars are "+ cars[2][0]+" "+ cars[2][1]+" "+cars[2][2]+" "+ cars[2][3]);
		System.out.println("Italian cars are "+ cars[3][0]+" "+ cars[3][1]+" "+cars[3][2]+" "+ cars[3][3]);
		
		System.out.println("---------REGULAR FOR LOOP----------------");
		
		for(int i=0; i<cars.length;i++) {
		for(int j=0;j<cars[i].length;j++) {
			
			System.out.print(cars[i][j]+" ");
				
		}
		System.out.println();
		}
		
		System.out.println("---------ENHANCE FOR LOOP---------------");
		
		for(String [] car:cars) {
			
			for(String brand:car) {
				System.out.print(brand+" ");
			}
			
			System.out.println();
			
		}
		
		
		

		
		//TASK2
		
		
		
	String [][]grocery= {
			
		 {"Cucumber", "Potato", "Pepper","Garlic" },
			{"Banana","Apple", "Watermelon", "Orange"},
			{"Milk","Yoghurt", "Egss","Cheese"},
			{"Chocolate", "Snicker","Cake","Candy"}
				
			
	};
		
		System.out.println("--------REGULAR FOR LOOP---------");
		
		for(int a=0;a<grocery.length;a++) {
			
			for(int b=0;b<grocery[a].length;b++) {
				
				System.out.print(grocery[a][b]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------ENHANCE FOR LOOP----------");
		
		
		for(String []shop :grocery) {
			for(String list:shop) {
				System.out.print(list+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
