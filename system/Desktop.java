package org.system;

//Week3 Day1 - Assignment - 1
public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("This is Desktop Size method present in Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop elect = new Desktop();
		elect.computerModel();
		elect.desktopSize();
	}

}
