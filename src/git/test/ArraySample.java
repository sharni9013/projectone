package git.test;


	public class ArraySample {
		public static void main(String[] args) {
			int a[] = new int[5];
			a[1]=50;
			a[2]=30;
			a[4]=40;
			a[3]=80;
			a[0]=50;
			
//			for (int i = 3; i <5; i++) {
//				System.out.println(a[i]);
//			}

		for (int o : a) {
			System.out.println(o);
		}	
		}
		}
