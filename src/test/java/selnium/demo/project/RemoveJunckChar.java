package selnium.demo.project;

public class RemoveJunckChar {

	public static void main(String[] args) {

		String str = "@#@#@SDSD@Dassadsd@@$$$^&";
		String newString = str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(newString);
	}

}
