class Complex{
	final double pi = 3.1415926536;
	double x;
	double y;
	double z;
	double w;
	static double f1;								//статичные переменные, так как используются в статичном методе
	static double f2;
	static double f3;
	static double f4;
	Complex(){
		//System.out.println("Конструктор по умолчанию\n");
	}
	Complex(double x, double y){
		//System.out.println("Конструктор с двумя параметрами\n");
		this.x=x;
		this.y=y;
	}
	void Modulo(){
		w=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		System.out.print(w);
	}
	void Arg(){
		z=y/x;
		z=Math.atan(z);
		if(x>0)									
			System.out.print(z);
		else if (x<0 && y>=0)
			System.out.print(z+pi);
		else if(x<0 && y<0)
			System.out.print(z-pi);
		else if(x==0 && y>0)
			System.out.print(pi/2);
		else if(x==0 && y<0)
			System.out.print(-pi/2);
		else
			System.out.print("You entered x=0 and y=0. Error!");
	}
	static void Sum(Complex z1, Complex z2){
		f1=z1.x+z2.x;
		f2=z1.y+z2.y;
		System.out.println("Sum z1 and z2: (" + f1 + ")+(" + f2 + "i)");
	}
	static void Minus(Complex z1, Complex z2){
		f3=z1.x-z2.x;
		f4=z1.y-z2.y;
		System.out.println("Minus z1 and z2: (" + f3 + ")+(" + f4 + "i)");
	}
}
