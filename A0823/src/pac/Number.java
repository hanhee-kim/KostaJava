package pac;

public class Number {
	
		private int pnum;		//class내에서 접근이 다 가능함
		private void pmethod() {}
		
		int dnum;		//default			
		public void dmethod() {
			System.out.println(pnum);
		}	//default
		
		public int punum;
		public void pumethod() {}

		protected int prnum;
		
		
		
		
		
		
		
		
		public int getPnum() {
			return pnum;
		}

		public void setPnum(int pnum) {
			this.pnum = pnum;
		}
	
		public int getDnum() {
			return dnum;
		}
		public void setDnum(int data) {
			this.dnum = data;
		}
}
