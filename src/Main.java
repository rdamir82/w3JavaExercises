import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Write a Java program to print 'Hello' on screen and then print your name on a
		// separate line
		// System.out.println("Hello\nDamir aRekic");
		// Write a Java program to print the sum of two numbers.
		// System.out.println(74+36);
		// Write a Java program to divide two numbers and print on the screen
		// System.out.println(50/3);
		// Write a Java program to print the result of the following operations
		// System.out.println(-5+8*6);
		// System.out.println((55+9)%6);
		// System.out.println(20+(-3*5)/8);
		// System.out.println(5+(15/3*2)-8%3);
		// Write a Java program that takes two numbers as input and display the product
		// of two numbers.
		// Scanner input = new Scanner(System.in);
		/*
		 * System.out.print("Input first number:"); int num1 = input.nextInt();
		 * System.out.print("Input second number"); int num2 = input.nextInt();
		 * 
		 * System.out.println(num1 + " x " + num2 + " = " + num1*num2); input.close();
		 */
		// Write a Java program to print the sum (addition), multiply, subtract, divide
		// and remainder of two numbers.
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Input first number:"); int num1 = input.nextInt();
		 * System.out.println("Input second Number:"); int num2 = input.nextInt();
		 * 
		 * System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		 * System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		 * System.out.println(num1 + " x " + num2 + " = " + num1*num2);
		 * System.out.println(num1 + " / " + num2 + " = " + num1/num2);
		 * System.out.println(num1 + " mod " + num2 + " = " + num1 % num2);
		 * 
		 * input.close();
		 */
		// Write a Java program that takes a number as input and prints its
		// multiplication table upto 10
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Input Number for multiplication:"); int num =
		 * input.nextInt();
		 * 
		 * for(int i=1; i<11;i++) { System.out.println(num + " x " + i + " = " + (num*i)
		 * ); } input.close();
		 */
		// Write a Java program to display the following pattern
		/*
		 * System.out.println("   J    a    v     v  a");
		 * System.out.println("   J   a a    v   v  a a");
		 * System.out.println("J  J  aaaaa    V V  aaaaa");
		 * System.out.println(" JJ  a     a    V  a     a");
		 */
		// Write a Java program to compute a specified formula.Specified Expression :
		// 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
		/*
		 * double num = 4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
		 * System.out.println(num);
		 */
		// Write a Java program to compute a specified the specified expressions and
		// print the output..Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))

		/*
		 * System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		 */
		// Write a Java program to print the area and perimeter of a circle.
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Input Radius of circle:"); double radius =
		 * input.nextDouble(); double perimeter = 2 * Math.PI * radius; double area =
		 * Math.PI * radius * radius; System.out.println("Circle with radius of " +
		 * radius + "\n have perimeter of: " + perimeter + "\n and area of: " + area);
		 * input.close();
		 */
		// Write a Java program that takes three numbers as input to calculate and print
		// the average of the numbers.
		/*
		 * Scanner input = new Scanner(System.in); System.out.
		 * println("This program will calculate and print the average of the 3 numbers!"
		 * ); System.out.println("Pleas enter first number: "); double num1 =
		 * input.nextDouble(); System.out.println("Pleas enter second number: "); double
		 * num2 = input.nextDouble(); System.out.println("Pleas enter third number: ");
		 * double num3 = input.nextDouble(); double average = (num1+num2+num3)/3;
		 * System.out.println("\n Based on your input (" + num1 + ", " + num2 +", " +
		 * num3 + ")  average of the numbers is:\n " + average); input.close();
		 */
		// METHOD FOR LOOP Write a Java program that takes three numbers as input to
		// calculate and print the average of the numbers.
		/*
		 * Scanner input = new Scanner(System.in); double sum = 0; System.out.
		 * println("This program will calculate and print the average of the numbers you enter!"
		 * ); System.out.println("How many number you want to proceed?"); int
		 * numberCount = input.nextInt(); numberCount += 1; for( int i = 1;
		 * i<numberCount ; i++ ) { System.out.println("Please enter the number("+ i +
		 * " from " + (numberCount-1) + "): "); sum += input.nextDouble(); } double avgn
		 * = (sum / (numberCount-1));
		 * System.out.println("\n Based on your input avearge of your number is:" +
		 * avgn); input.close();
		 */
		// Write a Java program to print the area and perimeter of a rectangle.
		/*
		 * Scanner input = new Scanner(System.in); System.out.
		 * println("This program will calculate area and perimeter of rectangle!");
		 * System.out.println("please enter a value for side a:"); double a =
		 * input.nextDouble(); System.out.println("please enter a value for side b:");
		 * double b = input.nextDouble(); double area = a*b; double perimeter = 2*(a+b);
		 * System.out.printf("\n Based on your input ( a = " + a + ", b = " + b
		 * +") \n Area of rectangle is: %.3f \n perimeter is: %.3f ",area, perimeter);
		 * input.close();
		 */
		/*
		 * Formatted output in Java. This is the easiest of all methods as this is
		 * similar to printf in C. Note that System.out.print() and System.out.println()
		 * take a single argument, but printf() may take multiple arguments.
		 * System.out.format() is equivalent to printf() and can also be used.
		 */

		// Write a Java program to print an American flag on the screen.
		/*
		 * System.out.println("* * * * * * ==================================");
		 * System.out.println(" * * * * *  ==================================");
		 * System.out.println("* * * * * * ==================================");
		 * System.out.println(" * * * * *  ==================================");
		 * System.out.println("* * * * * * ==================================");
		 * System.out.println(" * * * * *  ==================================");
		 * System.out.println("* * * * * * ==================================");
		 * System.out.println(" * * * * *  ==================================");
		 * System.out.println("* * * * * * ==================================");
		 * System.out.println("==============================================");
		 * System.out.println("==============================================");
		 * System.out.println("==============================================");
		 * System.out.println("==============================================");
		 * System.out.println("==============================================");
		 * System.out.println("==============================================");
		 */
		// Write a Java program to print a face.
		/*
		 * System.out.println(" +\"\"\"\"\"+"); System.out.println("[| o o |]");
		 * System.out.println(" |  ^  |"); System.out.println(" | '-' |");
		 * System.out.println(" +-----+");
		 */
		// Write a Java program to add two binary numbers
		/*
		 * System.out.println("This program will two binary numbers!"); long binary1,
		 * binary2, result; String resultToPrint; Scanner input = new
		 * Scanner(System.in); System.out.println("Please enter the first number:");
		 * binary1 = input.nextLong();
		 * System.out.println("Please enter the first number:"); binary2 =
		 * input.nextLong(); result = binary1 + binary2; resultToPrint =
		 * Long.toBinaryString(result); System.out.println(resultToPrint);
		 * input.close();
		 */
		// right answer:
		/*
		 * long binary1, binary2; int i = 0, remainder=0; int[] sum = new int[20];
		 * Scanner in = new Scanner(System.in);
		 * 
		 * System.out.print("Input first binary number: "); binary1 = in.nextLong();
		 * System.out.print("Input second binary number: "); binary2 = in.nextLong();
		 * 
		 * while(binary1 != 0 || binary2 !=0 ) { sum[i++] = (int)((binary1 % 10 +
		 * binary2 % 10 + remainder)%2); remainder = (int)((binary1 % 10 + binary2 % 10
		 * + remainder)/2); binary1 = binary1 / 10; binary2 = binary2 / 10; }
		 * if(remainder != 0) { sum[i++] = remainder;
		 * 
		 * } --i; System.out.print("Sum of two binary numbers: "); while (i >= 0) {
		 * System.out.print(sum[i--]); } System.out.print("\n"); in.close();
		 */

		// 18 Write JAVA program to multiply two binary numbers
		/*
		 * long binary1, binary2, multiply=0; int digit, factor = 1; Scanner in = new
		 * Scanner(System.in);
		 * 
		 * System.out.print("Input first binary number: "); binary1 = in.nextLong();
		 * System.out.print("Input second binary number: "); binary2 = in.nextLong();
		 * 
		 * while (binary2 != 0) { digit = (int)(binary2 % 10); if (digit == 1) { binary1
		 * = binary1 * factor; multiply = binaryproduct((int)binary1, (int)multiply); }
		 * else { binary1 = binary1 * factor; } binary2 = binary2/10; factor = 10; }
		 * System.out.print("Product of two binary numbers: " + multiply + "\n");
		 */
		// 19. Write a Java program to convert a decimal number to binary number.
		/*
		 * int num, i; String res = ""; String[] testarray = new String[100]; i = 0;
		 * 
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Please enter decimal number to convert to binary: "); num
		 * = input.nextInt();
		 * 
		 * while (num > 0) { int test = num % 2;
		 * 
		 * 
		 * if (test == 0) { testarray[i++] = "0"; //System.out.println("Add 0 to arr");
		 * } else { testarray[i++] = "1"; //System.out.println("Add 1 to arr"); } num =
		 * num / 2;
		 * 
		 * }
		 * 
		 * input.close();
		 * 
		 * for(int j = 0; j <= testarray.length; j++) { if (testarray[j] == null)
		 * {break;} //System.out.print(testarray[j]); res += testarray[j];
		 * 
		 * }
		 * 
		 * StringBuilder sb = new StringBuilder(res);
		 * 
		 * System.out.println("your binary number is: " + (sb.reverse().toString()) );
		 * 
		 * 
		 */
		/*
		 * int dec_num, quot, i=1, j; int bin_num[] = new int[100]; Scanner scan = new
		 * Scanner(System.in);
		 * 
		 * System.out.print("Input a decimal number : "); dec_num = scan.nextInt();
		 * 
		 * quot = dec_num;
		 * 
		 * while(quot != 0) { bin_num[i++] = quot%2; quot = quot/2; }
		 * 
		 * System.out.print("Binary number is: "); for(j=i-1; j>0; j--) {
		 * System.out.print(bin_num[j]); } System.out.print("\n"); scan.close();
		 */
		// 20. Write a Java program to convert a decimal number to hexadecimal number.
		/*
		 * int dec_num, var_num, var_remaind, i=1, j=1; String hex_num[] = new
		 * String[100]; String hexcaracter = "x"; Scanner input = new
		 * Scanner(System.in);
		 * 
		 * System.out.print("Input decimal num to convert to hexadecimal: "); dec_num =
		 * input.nextInt(); var_num = dec_num;
		 * 
		 * while (var_num != 0) {
		 * 
		 * var_remaind = var_num%16; var_num = var_num / 16;
		 * 
		 * switch (var_remaind) { case 1: hexcaracter = "1"; break; case 2: hexcaracter
		 * = "2"; break; case 3: hexcaracter = "3"; break; case 4: hexcaracter = "4";
		 * break; case 5: hexcaracter = "5"; break; case 6: hexcaracter = "6"; break;
		 * case 7: hexcaracter = "7"; break; case 8: hexcaracter = "8"; break; case 9:
		 * hexcaracter = "9"; break; case 10: hexcaracter = "A"; break; case 11:
		 * hexcaracter = "B"; break; case 12: hexcaracter = "C"; break; case 13:
		 * hexcaracter = "D"; break; case 14: hexcaracter = "E"; break; case 15:
		 * hexcaracter = "F"; break; case 0: hexcaracter = "0"; break; }
		 * 
		 * hex_num[i++] = hexcaracter; } System.out.print("Hexadecimal of " + dec_num +
		 * " decimal number is: "); for(j=i-1; j>= 1; j--) {
		 * System.out.print(hex_num[j]); } System.out.print("\n"); input.close();
		 */
		/*
		 * int dec_num, rem; String hexdec_num=""; // hexadecimal number digits char
		 * hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		 * Scanner in = new Scanner(System.in);
		 * 
		 * System.out.print("Input a decimal number: "); dec_num = in.nextInt();
		 * 
		 * while(dec_num>0) { rem = dec_num%16; hexdec_num = hex[rem] + hexdec_num;
		 * dec_num = dec_num/16; } in.close();
		 * System.out.print("Hexadecimal number is: " + hexdec_num + "\n");
		 */
		// 21. Write a Java program to convert a decimal number to octal number.
		/*
		 * int dec_num, rem; String octal_num=""; // hexadecimal number digits char
		 * eight[]= {'0','1','2','3','4','5','6','7'}; Scanner in = new
		 * Scanner(System.in);
		 * 
		 * System.out.print("Input a decimal number: "); dec_num = in.nextInt();
		 * 
		 * while(dec_num>0) { rem = dec_num%8; octal_num = eight[rem] + octal_num;
		 * dec_num = dec_num/8; } in.close(); System.out.print("Octal number is: " +
		 * octal_num + "\n");
		 */
		/*
		 * int dec_num, rem, quot, i=1, j; int oct_num[] = new int[100]; Scanner scan =
		 * new Scanner(System.in);
		 * 
		 * System.out.print("Input a Decimal Number: "); dec_num = scan.nextInt();
		 * 
		 * quot = dec_num;
		 * 
		 * while (quot != 0) { oct_num[i++] = quot%8; quot = quot/8;
		 * 
		 * }
		 * 
		 * System.out.print("Octal number is: "); for(j=i-1; j>0 ;j--) {
		 * System.out.print(oct_num[j]);
		 * 
		 * }
		 * 
		 */
		// 22. Write a Java program to convert a binary number to decimal number.
		// 23. Write a Java program to convert a binary number to hexadecimal
		/*
		 * String binary_num; Scanner input = new Scanner (System.in);
		 * 
		 * System.out.print("Enter the binary number: "); binary_num = input.nextLine();
		 * 
		 * // binary to decimal
		 * 
		 * int previusnum = 0, actualnum, decimal;
		 * 
		 * for(int i=0; i < binary_num.length(); i++) { actualnum =
		 * Character.getNumericValue(binary_num.charAt(i)); previusnum = previusnum * 2
		 * + actualnum; } decimal = previusnum;
		 * 
		 * // decimal to hexadecimal
		 * 
		 * int rem; String hexdec_num=""; // hexadecimal number digits char hex[]=
		 * {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		 * 
		 * while(decimal>0) { rem = decimal%16; hexdec_num = hex[rem] + hexdec_num;
		 * decimal = decimal/16; } System.out.print("Hexadecimal number is: " +
		 * hexdec_num + "\n"); input.close();
		 */
		/*
		 * Soultion for 22 Scanner sc = new Scanner(System.in); long binaryNumber,
		 * decimalNumber = 0, j = 1, remainder;
		 * System.out.print("Input a binary number: "); binaryNumber = sc.nextLong();
		 * 
		 * while (binaryNumber != 0) { remainder = binaryNumber % 10; decimalNumber =
		 * decimalNumber + remainder * j; j = j * 2; binaryNumber = binaryNumber / 10; }
		 * System.out.println("Decimal Number: " + decimalNumber); sc.close();
		 */
		// Solution for 23 ???
		/*
		 * int[] hex = new int[1000]; int i = 1, j = 0, rem, dec = 0, bin; Scanner in =
		 * new Scanner(System.in); System.out.print("Input a Binary Number: "); bin =
		 * in.nextInt(); while (bin > 0) { rem = bin % 2; dec = dec + rem * i; i = i *
		 * 2; bin = bin / 10; } i = 0; while (dec != 0) { hex[i] = dec % 16; dec = dec /
		 * 16; i++; } System.out.print("HexaDecimal value: "); for (j = i - 1; j >= 0;
		 * j--) { if (hex[j] > 9) { System.out.print((char)(hex[j] + 55)+"\n"); } else {
		 * System.out.print(hex[j]+"\n"); } }
		 */
		// 31 Write a Java program to check whether Java is installed on your computer.
		/*
		 * System.out.println("\nJava Version: "+System.getProperty("java.version"));
		 * System.out.println("Java Runtime Version: "+System.getProperty(
		 * "java.runtime.version"));
		 * System.out.println("Java Home: "+System.getProperty("java.home"));
		 * System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
		 * System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"))
		 * ;
		 * System.out.println("Java Class Path: "+System.getProperty("java.class.path")+
		 * "\n");
		 */
		// 32 Write a Java program to compare two numbers
		/*
		 * int num1, num2;
		 * 
		 * System.out.println("This program wil comapre two number!");
		 * System.out.println("Please enter the first number: "); Scanner input = new
		 * Scanner(System.in); num1 = input.nextInt();
		 * System.out.println("Please enter the second number: "); num2 =
		 * input.nextInt();
		 * 
		 * if (num1 == num2) { System.out.println(num1 +" == " + num2); } else {
		 * System.out.println(num1 +" != " + num2); }
		 * 
		 * if (num1 < num2) { System.out.println(num1 +" < " + num2); } else {
		 * System.out.println(num1 +" > " + num2); }
		 * 
		 * if (num1 <= num2) { System.out.println(num1 +" <= " + num2); } if (num1 =>
		 * num2) { System.out.println(num1 +" => " + num2); } input.close();
		 */
		/*
		 * // create Scanner to obtain input from command window Scanner input = new
		 * Scanner(System.in); int number1; // first number to compare int number2; //
		 * second number to compare
		 * 
		 * System.out.print( "Input first integer: " ); // prompt number1 =
		 * input.nextInt(); // read first number from user
		 * 
		 * System.out.print( "Input second integer: " ); // prompt number2 =
		 * input.nextInt(); // read second number from user
		 * 
		 * if ( number1 == number2 ) System.out.printf( "%d == %d\n", number1, number2
		 * ); if ( number1 != number2 ) System.out.printf( "%d != %d\n", number1,
		 * number2 ); if ( number1 < number2 ) System.out.printf( "%d < %d\n", number1,
		 * number2 ); if ( number1 > number2 ) System.out.printf( "%d > %d\n", number1,
		 * number2 ); if ( number1 <= number2 ) System.out.printf( "%d <= %d\n",
		 * number1, number2 ); if ( number1 >= number2 ) System.out.printf(
		 * "%d >= %d\n", number1, number2 );
		 */
		// 33. Write a Java program and compute the sum of the digits
		/*
		 * int number_length, numsum=0; String string_number;
		 * System.out.println("Input number, to compute sum of the digits: "); Scanner
		 * input = new Scanner(System.in); string_number = input.nextLine(); // how many
		 * digits we have? number_length = string_number.length(); // sum the value of
		 * digits for (int i=0; i < number_length; i++) { numsum = numsum +
		 * (Character.getNumericValue(string_number.charAt(i))); }
		 * System.out.println(numsum); input.close();
		 */
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.print("Input an integer: "); long n = input.nextLong();
		 * System.out.println("The sum of the digits is: " + sumDigits(n));
		 */
		// 34 Write a Java program to compute the area of a hexagon. Area of a hexagon =
		// (6 * s^2)/(4*tan(PI/6))
		/*
		 * double side, area; Scanner input = new Scanner(System.in);
		 * System.out.print("Input the length of a hexagon: "); side =
		 * input.nextDouble();
		 * 
		 * area = (6*side*side)/(4*Math.tan(Math.PI/6));
		 * 
		 * System.out.println("area of a hexagon is: " + area);
		 */
		// 35 Write a Java program to compute the area of a polygon
		/*
		 * double side, area, polygon; Scanner input = new Scanner(System.in);
		 * System.out.print("Input the length of a side of polygon: "); side =
		 * input.nextDouble();
		 * System.out.print("Input the length of a side of polygon: "); polygon =
		 * input.nextDouble();
		 * 
		 * area = (polygon*(side*side))/(4*Math.tan(Math.PI/polygon));
		 * 
		 * System.out.println("area of a polygon is: " + area);
		 */
		// 36. Write a Java program to compute the distance between two points on the
		// surface of earth.
		/*
		 * // init data double r, x1, y1, x2, y2, d;
		 * 
		 * r= 6371.01;
		 * 
		 * // input data Scanner input = new Scanner(System.in);
		 * System.out.print("Input the latitude of coordinate (x1): "); x1 =
		 * input.nextDouble();
		 * System.out.print("Input the longitude of coordinate (y1): "); y1 =
		 * input.nextDouble();
		 * System.out.print("Input the latitude of coordinate (x2): "); x2 =
		 * input.nextDouble();
		 * System.out.print("Input the longitude of coordinate (y2): "); y2 =
		 * input.nextDouble();
		 * 
		 * x1 = Math.toRadians(x1); y1 = Math.toRadians(y1); x2 = Math.toRadians(x2); y2
		 * = Math.toRadians(y2);
		 * 
		 * d = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) *
		 * Math.cos(y1 - y2));
		 * 
		 * System.out.println("The distance between those points is: " + d + " km\n");
		 */
		// 37. Write a Java program to reverse a string.
		/*
		 * String word; int j, i; char[] arr = new char[100] ;
		 * 
		 * Scanner input = new Scanner(System.in);
		 * System.out.print("Input the word for reverse: "); word = input.nextLine();
		 * 
		 * for(i=0; i< word.length(); i++) { arr[i] = word.charAt(i); }
		 * 
		 * System.out.print("reverse: "); for (j=i-1; j>-1 ; j--) { arr[j] =
		 * word.charAt(j); System.out.print(arr[j]); };
		 */
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("Input a string: "); char[] letters =
		 * scanner.nextLine().toCharArray(); System.out.print("Reverse string: "); for
		 * (int i = letters.length - 1; i >= 0; i--) { System.out.print(letters[i]); }
		 * System.out.print("\n");
		 * 
		 * The java string toCharArray() method converts the given string into a
		 * sequence of characters. The returned array length is equal to the length of
		 * the string.
		 * 
		 */
		// 38. Write a Java program to count the letters, spaces, numbers and other
		// characters of an input string
		/*
		 * String text; int letter=0, space=0, number=0, other=0;
		 * 
		 * Scanner input = new Scanner(System.in);
		 * System.out.print("Input the text for testing: "); char[] characters =
		 * input.nextLine().toCharArray();
		 * 
		 * for(int i=0; i< characters.length; i++) { if
		 * (Character.isLetter(characters[i])) { letter++; } if
		 * (Character.isDigit(characters[i])) { number++; } if
		 * (Character.isWhitespace(characters[i])) { space++; } }
		 * 
		 * System.out.println("Letter: " + letter + "\n Space: " + space + "\n Number: "
		 * + number + "\n Other: " + (characters.length - (space + letter + number)));
		 */
		// 39
		// Write a Java program to create and display unique three-digit number using 1,
		// 2, 3, 4.
		// Also count how many three-digit numbers are there.

		/*
		 * 
		 * int counter=0; int[] numbers = new int[] {1,2,3,4};
		 * 
		 * for(int i=0;i<4;i++) { for (int j = 0; j<4;j++) { for (int k = 0; k<4; k++) {
		 * if(numbers[i] != numbers[j] && numbers[i] != numbers[k] && numbers[j] !=
		 * numbers[k]) { System.out.print(numbers[i] + "" + numbers[j] + "" + numbers[k]
		 * + " \n" ); counter ++; } } } }
		 * 
		 * System.out.println("Total number of the three-digit-number is " + counter);
		 */
		/*
		 * int amount = 0; for(int i = 1; i <= 4; i++){ for(int j = 1; j <= 4; j++){
		 * for(int k = 1; k <= 4; k++){ if(k != i && k != j && i != j){ amount++;
		 * System.out.println(i + "" + j + "" + k); } } } }
		 * System.out.println("Total number of the three-digit-number is " + amount);
		 */
		/*
		 * //40. Write a Java program to list the available character sets in charset
		 * objects.
		 * 
		 * System.out.println("List of available character sets: "); for (String str :
		 * Charset.availableCharsets().keySet()) { System.out.println(str); }
		 */
		// 41. Write a Java program to print the ascii value of a given character.
		/*
		 * char test; int result; Scanner input = new Scanner(System.in);
		 * System.out.println("Enter a character to find out the ASCII value: "); test =
		 * input.next().charAt(0); result = test;
		 * System.out.println("ASCII value of character " + test + " is: " + result);
		 */
		// 42. Write a Java program to input and display your password.
		/*
		 * String password; Scanner input = new Scanner(System.in);
		 * System.out.println("Input your Password:  "); password = input.nextLine();
		 * System.out.println("Your password was:  " + password);
		 */
		/*
		 * Console cons; if ((cons = System.console()) != null) { char[] pass_ward =
		 * null; try { pass_ward = cons.readPassword("Input your Password:");
		 * System.out.println("Your password was: " + new String(pass_ward)); } finally
		 * { if (pass_ward != null) { java.util.Arrays.fill(pass_ward, ' '); } } } else
		 * { throw new RuntimeException("Can't get password...No console"); }
		 * 
		 */
		// 43. Write a Java program to print the following string in a specific format
		// (see the output).

		/*
		 * System.out.println("Twinkle, twinkle, little star,");
		 * System.out.println("\t How I wonder what you are! ");
		 * System.out.println("\t \t Up above the world so high, ");
		 * System.out.println("\t \t Like a diamond in the sky. ");
		 * System.out.println("Twinkle, twinkle, little star,");
		 * System.out.println("\t How I wonder what you are! ");
		 * 
		 */
		// 44. Write a Java program that accepts an integer (n) and computes the value
		// of n+nn+nnn.
		/*
		 * int n,res,n2,n3; Scanner input = new Scanner(System.in);
		 * System.out.println("Integer n:  "); n = input.nextInt(); n2 =
		 * Integer.parseInt(Integer.toString(n)+Integer.toString(n)); n3 =
		 * Integer.parseInt(Integer.toString(n)+Integer.toString(n)+Integer.toString(n))
		 * ; res = n + n2 + n3; System.out.println(n + " + " + n2 + " + " + n3 + " = " +
		 * res);
		 */
		/*
		 * int n; char s1, s2, s3; Scanner in = new Scanner(System.in);
		 * System.out.print("Input number: "); n = in .nextInt();
		 * System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
		 * 
		 * //Formatting output using System.out.printf() //This is the easiest of all
		 * methods as this is similar to printf in C. //Note that System.out.print() and
		 * System.out.println() take a single //argument, but printf() may take multiple
		 * arguments.
		 */
		// 45.Write a Java program to find the size of a specified file.
		// initialization
		/*
		 * System.out.println("/home/students/abc.txt  : " + new
		 * File("abc.txt").length() + " bytes");
		 * System.out.println("/home/students/test.txt : " + new
		 * File("C:/Users/korisnik/Desktop/tets.txt").length() + " bytes");
		 */
		// 46. Write a Java program to display the system time.
		/*
		 * System.out.format("\nCurrent Date time: %tc%n\n",
		 * System.currentTimeMillis());
		 */
		// 47.Write a Java program to display the current date time in specific format.
		/*
		 * SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		 * cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		 * 
		 * System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
		 */
		// Write a Java program to print the odd numbers from 1 to 99. Prints one number
		// per line.
		/*
		 * int counter=0; for(int i=1; i<100; i++) { if(i % 2 != 0) {
		 * System.out.println(i); counter++; } } System.out.println(counter + " pcs");
		 */
		// 49.Write a Java program to accept a number and check the number is even or
		// not. Prints 1 if the number is even or 0 if the number is odd.
		/*
		 * int n; Scanner input = new Scanner(System.in);
		 * System.out.println("Input Integer:  "); n = input.nextInt(); if(n % 2 == 0) {
		 * System.out.println(1); } else { System.out.println(0); }
		 */
		// 50. Write a Java program to print numbers between 1 to 100 which are
		// divisible by 3, 5 and by both
		/*
		 * System.out.println("Divided by 3:"); for(int i=1; i<101; i++) { if(i % 3 ==
		 * 0) { System.out.print(i + ", "); } } System.out.println("\n\nDivided by 5:");
		 * for(int i=1; i<101; i++) { if(i % 5 == 0) { System.out.print(i + ", "); } }
		 * System.out.println("\n\nDivided by 3 and 5:"); for(int i=1; i<101; i++) {
		 * if(i % 5 == 0 && i % 3 == 0 ) { System.out.print(i + ", "); } }
		 */
		// 51. Write a Java program to convert a string to an integer in Java
		/*
		 * String a; int a_int; Scanner input = new Scanner(System.in);
		 * System.out.println("Input Number String:  "); a = input.nextLine(); a_int =
		 * Integer.parseInt(a); System.out.println("This is a a_int: " + a_int);
		 */
		// 52. Write a Java program to calculate the sum of two integers and return true
		// if the sum is equal to a third integer
		/*
		 * int n1,n2,nCompare; Scanner input = new Scanner(System.in);
		 * System.out.println("Input Integer 1:  "); n1 = input.nextInt();
		 * System.out.println("Input Integer 2:  "); n2 = input.nextInt(); System.out.
		 * println("Input Integer to comapre a sum of n1 and n2 to this number:  ");
		 * nCompare = input.nextInt();
		 * 
		 * if(nCompare == n1+n2) { System.out.println("The result is: True"); } else {
		 * System.out.println("The result is: False"); }
		 */
		/*
		 * Scanner in = new Scanner(System.in);
		 * System.out.print("Input the first number : "); int x = in.nextInt();
		 * System.out.print("Input the second number: "); int y = in.nextInt();
		 * System.out.print("Input the third number : "); int z = in.nextInt();
		 * System.out.print("The result is: "+sumoftwo(x, y, z));
		 * System.out.print("\n");
		 */
		/*
		 * 53 /*
		 * 
		 * Scanner in = new Scanner(System.in);
		 * System.out.print("Input the first number : "); int x = in.nextInt();
		 * System.out.print("Input the second number: "); int y = in.nextInt();
		 * System.out.print("Input the third number : "); int z = in.nextInt();
		 * System.out.print("The result is: "+ test(x, y, z, true));
		 */
		/*
		 * 54 Write a Java program that accepts three integers from the user and return
		 * true if two or more of them (integers ) have the same rightmost digit. The
		 * integers are non-negative
		 */
		/*
		 * Scanner in = new Scanner(System.in);
		 * System.out.print("Input the first number : "); int x = in.nextInt();
		 * System.out.print("Input the second number: "); int y = in.nextInt();
		 * System.out.print("Input the third number : "); int z = in.nextInt();
		 * System.out.print("The result is: "+test_last_digit(x, y, z,true));
		 * System.out.print("\n");
		 */
// 55.	Write a Java program to convert seconds to hour, minute and seconds	
		/*
		 * int h,m,s; Scanner in = new Scanner(System.in);
		 * System.out.print("Input the number of seconds : "); int x = in.nextInt(); h =
		 * x/3600; m = (x - (h*3600))/60; s = x-((h*3600)+(m*60));
		 * System.out.println(h+":"+ m + ":" + s);
		 */
		/*
		 * Scanner in = new Scanner(System.in); System.out.print("Input seconds: "); int
		 * seconds = in.nextInt(); int p1 = seconds % 60; int p2 = seconds / 60; int p3
		 * = p2 % 60; p2 = p2 / 60; System.out.print( p2 + ":" + p3 + ":" + p1);
		 * System.out.print("\n");
		 */
//56. 
		/*
		 * Write a Java program to find the number of integers within the range of two
		 * specified numbers and that are divisible by another number
		 */
		/*
		 * int x = 5, y=20, p=3, res=0; for(int i=x;i<=y;i++) { if (i % p == 0) { res++;
		 * } } System.out.println(res);
		 */
		/*
		 * int x = 5; int y = 20; int p = 3; System.out.println(result(x,y,p));
		 */
//57. Write a Java program to accepts an integer and count the factors of the number.
		/*
		 * int res=0; Scanner in = new Scanner(System.in);
		 * System.out.print("Input Integer: "); int x = in.nextInt(); for(int i=1; i<=x;
		 * i++) { if(x % i == 0) { res++; } } System.out.println(res);
		 */
//58. Write a Java program to capitalize the first letter of each word in a sentence.
		/*
		 * String s, subword, toPrint; char subChar;
		 * 
		 * Scanner in = new Scanner(System.in); System.out.print("Input Sentence: "); s
		 * = in.nextLine(); String[] words = s.split("\\s+");
		 * 
		 * for (int i = 0; i < words.length; i++) { subChar = words[i].charAt(0);
		 * subword = words[i]; subChar = Character.toUpperCase(subChar); toPrint =
		 * subChar + subword.substring(1,subword.length());
		 * System.out.print(toPrint+" "); }
		 */
		/*
		 * Scanner in = new Scanner(System.in); System.out.print("Input a Sentence: ");
		 * String line = in.nextLine(); String upper_case_line = ""; Scanner lineScan =
		 * new Scanner(line); while(lineScan.hasNext()) { String word = lineScan.next();
		 * upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1)
		 * + " "; } System.out.println(upper_case_line.trim());
		 */
//59. Write a Java program to convert a given string into lowercase. 		
		/*
		 * String s; String newWord = ""; String toPrint = "";
		 * 
		 * Scanner in = new Scanner(System.in); System.out.print("Input Sentence: "); s
		 * = in.nextLine(); String[] words = s.split("\\s+");
		 * 
		 * for (int i = 0; i < words.length; i++) { for(int j = 0; j <
		 * words[i].length();j++) { newWord +=
		 * Character.toLowerCase(words[i].charAt(j)); } toPrint += newWord + " ";
		 * newWord = ""; } System.out.print(toPrint);
		 */
		/*
		 * Scanner in = new Scanner(System.in); System.out.print("Input a String: ");
		 * String line = in.nextLine(); line = line.toLowerCase();
		 * System.out.println(line);
		 */
// 60. Write a Java program to find the penultimate (next to last) word of a sentence.
		/*
		 * String s; Scanner in = new Scanner(System.in);
		 * System.out.print("Input Sentence: "); s = in.nextLine(); String[] words =
		 * s.split("\\s+"); System.out.println(words[words.length - 2]);
		 */
		/*
		 * Scanner in = new Scanner(System.in); System.out.print("Input a Sentence: ");
		 * String line = in.nextLine(); String[] words = line.split("[ ]+");
		 * System.out.println("Penultimate word: "+words[words.length - 2]);
		 */

// 61. 	Write a Java program to reverse a word.
		/*
		 * String reversedWord = ""; Scanner in = new Scanner(System.in);
		 * System.out.print("Input a word for reversing: "); String word =
		 * in.nextLine(); for(int i = word.length()-1; i > -1; i--) { reversedWord +=
		 * word.charAt(i); } System.out.println("word " + word + " reversed: " +
		 * reversedWord);
		 */
		/*
		 * Scanner in = new Scanner(System.in); System.out.print("\nInput a word: ");
		 * String word = in.nextLine(); word = word.trim(); String result = ""; char[]
		 * ch=word.toCharArray(); for (int i = ch.length - 1; i >= 0; i--) { result +=
		 * ch[i]; } System.out.println("Reverse word: "+result.trim());
		 */
// 62. Write a Java program that accepts three integer values 
//	   and return true if one of them is 20 or more less than one of the others.		
		/*
		 * Scanner in = new Scanner(System.in);
		 * 
		 * System.out.
		 * println("This program will compare 3 numbers \nif some of them is less than other \nby 20 or more return true \n \nPlease input first number: \n"
		 * ); int firstNumber = in.nextInt();
		 * System.out.println("input second number: \n"); int secondNumber =
		 * in.nextInt(); System.out.println("input third number: \n"); int thirdNumber =
		 * in.nextInt(); int[] numbersToCompare = {firstNumber, secondNumber,
		 * thirdNumber}; String result = "false"; for(int
		 * i=0;i<numbersToCompare.length;i++) { for(int
		 * y=0;y<numbersToCompare.length;y++) { if(numbersToCompare[i] -
		 * numbersToCompare[y] >= 20) { result = "true"; i = numbersToCompare.length +
		 * 1; break; } else { System.out.println(numbersToCompare[i] + " - " +
		 * numbersToCompare[y] + " = " + (numbersToCompare[i]-numbersToCompare[y])); } }
		 * }
		 * 
		 * System.out.println(result);
		 * 
		 * System.out.println((Math.abs(firstNumber - secondNumber) >= 20 ||
		 * Math.abs(secondNumber - thirdNumber) >= 20 || Math.abs(thirdNumber -
		 * firstNumber) >= 20));
		 */
// 63. Write a Java program that accepts two integer values from the user and return the larger values.
// 	   However if the two values are the same, return 0
//     and return the smaller value if the two values have the same remainder when divided by 6.
		/*
		 * int result; Scanner in = new Scanner(System.in);
		 * System.out.println("Input the first number:"); int x = in.nextInt();
		 * System.out.println("Input the second number:"); int y = in.nextInt(); if
		 * (x==y) { result = 0; } else if (x%6 == y%6) { if (x>y) { result = y; } else {
		 * result = x; }
		 * 
		 * } else { if (x>y) { result = x; } else { result = y; }
		 * 
		 * }
		 * 
		 * System.out.println(result);
		 */
		/*
		 * int result; Scanner in = new Scanner(System.in);
		 * System.out.print("Input the first number : "); int x = in.nextInt();
		 * System.out.print("Input the second number: "); int y = in.nextInt();
		 * 
		 * 
		 * if(x == y) result = 0; if(x % 6 == y % 6) result = (x < y) ? x : y; result =
		 * (x > y) ? x : y;
		 * 
		 * System.out.println("Result: "+ result);
		 */
// 64.   Write a Java program that accepts two integer values between 25 to 75 
//		 and return true if there is a common digit in both numbers.
		/*
		 * Scanner in = new Scanner(System.in);
		 * System.out.print("Input the first number between 25 to 75: "); int x =
		 * in.nextInt(); while(testNumber(x) == false) {
		 * System.out.print("Input the first number between 25 to 75: "); x =
		 * in.nextInt(); };
		 * 
		 * System.out.print("Input the second number between 25 to 75: "); int y =
		 * in.nextInt(); while(testNumber(y) == false) {
		 * System.out.print("Input the second number between 25 to 75: "); y =
		 * in.nextInt(); }; String xString = Integer.toString(x); String yString =
		 * Integer.toString(y);
		 * 
		 * System.out.println(test(xString, yString));
		 */
		/*
		 * Scanner in = new Scanner(System.in);
		 * System.out.print("Input the first number : "); int a = in.nextInt();
		 * System.out.print("Input the second number: "); int b = in.nextInt();
		 * System.out.println("Result: "+common_digit(a, b));
		 */
// 65. Write a Java program to calculate the modules of two numbers 
//	   without using any inbuilt modulus operator.
		/*
		 * Scanner in = new Scanner(System.in);
		 * 
		 * System.out.print("Input the first number : "); int a = in.nextInt();
		 * System.out.print("Input the second number: "); int b = in.nextInt();
		 * System.out.println("Modulus of " + a + " by " + b + " is: " + modules(a,b));
		 */
// 66. Write a Java program to compute the sum of the first 100 prime numbers.
		/*
		 * int result = 0; int counter = 0; for(int k = 2; counter<101; k++) { boolean
		 * flag = false; for(int i = 2; i <= k/2; ++i) { // condition for nonprime
		 * number if(k % i == 0) { flag = true; break; } } if (!flag) { counter++;
		 * System.out.println(result); result += k; if(counter == 100) {
		 * System.out.println(result); break; }
		 * 
		 * }
		 * 
		 * }
		 */
		/*
		 * int sum = 1; int ctr = 0; int n = 0;
		 * 
		 * while(ctr < 100) { n++; if (n%2 != 0) { if(is_prime(n)) { sum += n; ctr++; }
		 * } }
		 * 
		 * System.out.println("\nSum of the first 100 prime numbers: " + sum);
		 */
// 67. Write a Java program to insert a word in the middle of the another string.
		// Insert "Tutorial" in the middle of "Python 3.0", so result will be Python
		// Tutorial 3.0
		/*
		 * String sentence = "Python 3.0"; String word = "Tutorial";
		 * System.out.println(sentence.substring(0, 7) + word + sentence.substring(6));
		 */
// 68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string.
		// The length of the original string must be 3 and above
		/*
		 * String main_string = "Hello World";
		 * 
		 * String last_three_chars = main_string.substring(main_string.length() - 3);
		 * System.out.println(last_three_chars + last_three_chars + last_three_chars +
		 * last_three_chars);
		 */
// 69. Write a Java program to extract the first half of a string of even length
		/*
		 * String data = "python"; System.out.println(data.substring(0,
		 * data.length()/2));
		 */
// 70. 	Write a Java program to create a string in the form
		// short_string + long_string + short_string from two strings.
		// The strings must not have the same length.
		/*
		 * String longString = ""; String shortString = ""; String str1 = "Python";
		 * String str2 = "Tutorial"; if (str1.length() > str2.length()) { longString =
		 * str1; shortString = str2; } else { longString = str2; shortString = str1; }
		 * System.out.println(shortString + longString + shortString);
		 */
		/*
		 * String str1 = "Python"; String str2 = "Tutorial";
		 * 
		 * if(str1.length() >= str2.length()) System.out.println( str2+str1+str2); else
		 * System.out.println(str1+str2+str1);
		 */
// 71. Write a Java program to create the concatenation of the two strings
		// except removing the first character of each string.
		// The length of the strings must be 1 and above.
		/*
		 * String str1 = "Python"; String str2 = "Tutorial"; String result = "";
		 * 
		 * result = str1.substring(1, str1.length()) + str2.substring(1, str2.length());
		 * System.out.println(result);
		 */
// 72. Write a Java program to create a new string taking first three characters from
		// given string. If the length of the given string is less than 3
		// use "#" as substitute characters.
		/*
		 * String str1 = "Hello"; int len = str1.length(); if(len >= 3)
		 * System.out.println( str1.substring(0, 3)); else if(len == 1)
		 * System.out.println( (str1.charAt(0)+"##")); else System.out.println("###");
		 */
// 73. Write a Java program to create a new string taking first and last characters from two given strings.
		// If the length of either string is 0 use "#" for missing character.
		/*
		 * String str1 = "Python"; String str2 = "";
		 * 
		 * int length2 = str2.length(); String result = "";
		 * 
		 * result += (str1.length() >= 1) ? str1.charAt(0) : "#"; result += (length2 >=
		 * 1) ? str2.charAt(length2-1) : "#"; System.out.println(result);
		 */
// 74. 	Write a Java program to test if 10 appears as either the first or last element of an array of integers. 
		// The length of the array must be greater than or equal to 2.
		/*
		 * int [] data = {50, -20, 0, 30, 40, 60, 10};
		 * 
		 * System.out.println(comapre_first_or_last_is_10(data));
		 */
		/*
		 * int[] num_array = {10, -20, 0, 30, 40, 60, 10};
		 * System.out.println((num_array[0] == 10 || num_array[num_array.length-1] ==
		 * 10));
		 */
// 75. Write a Java program to test if the first and the last element of an array of integers are same.
		// The length of the array must be greater than or equal to 2
		/*
		 * int[] num_array = {10, -20, 0, 30, 40, 60, 10};
		 * System.out.println((num_array[0] == num_array[num_array.length-1]));
		 */
		/*
		 * int[] array1 = {45, -20, 0, 30, 40, 60, 12}; int[] array2 = {45, 20, 10, 20,
		 * 30, 50, 12};
		 * 
		 * System.out.println((array1[0] == (array2[0])||(array1[array1.length-1] ==
		 * (array2[array2.length-1]))));
		 */
// 77. Write a Java program to create a new array of length 2
		// from two arrays of integers with three elements
		// and the new array will contain the first and last elements from the two
		// arrays.
		/*
		 * int[] array1 = {50, -20, 0}; int[] array2 = {5,-50,10};
		 * 
		 * int[] combine = {array1[0],array2[2]}; System.out.println("Array1: " +
		 * Arrays.toString(array1)); System.out.println("Array2: " +
		 * Arrays.toString(array2)); System.out.println("New Array: " +
		 * Arrays.toString(combine));
		 */
// 78. 	Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.	
		/*
		 * int[] original = {5,7}; System.out.println((original[0] == 7 || original[0]
		 * == 4 || original[1] == 7 || original[1] == 4));
		 */
// 79. Write a Java program to rotate an array (length 3) of integers in left direction.
		/*
		 * int[] original = {20,30,40}; int[] rotated =
		 * {original[1],original[2],original[0]}; System.out.println("Original Array: "
		 * + Arrays.toString(original)); System.out.println("Rotated Array: " +
		 * Arrays.toString(rotated));
		 */
// 80. 	 Write a Java program to get the larger value
		// between first and last element of an array (length 3) of integers .
		/*
		 * int[] original = {20,30,40}; System.out.println("Original Array: " +
		 * Arrays.toString(original));
		 * System.out.println("Larger value between first and last element: " +
		 * ((original[0]>=original[2]) ? original[0] : original[2]));
		 */
		/*
		 * if (original[0] > original[2]) {
		 * System.out.println("Larger value between first and last element: " +
		 * original[0]); } else {
		 * System.out.println("Larger value between first and last element: " +
		 * original[2]); }
		 */
// 81.  Write a Java program to swap the first and last elements of an array
		// (length must be at least 1) and create a new array.
		/*
		 * int[] original = {20,30,40}; System.out.println("Original Array: " +
		 * Arrays.toString(original)); int[] newArray =
		 * {original[original.length-1],original[1],original[0] };
		 * System.out.println("New array after swaping the first and last elements: " +
		 * Arrays.toString(newArray));
		 */
// 82. 	Write a Java program to find the largest element between first, last,
		// and middle values from an array of integers (even length).
		/*
		 * int valueToCompare = 0; int[] original = {85, 58, 79, 86, 84}; for(int i = 0;
		 * i<original.length; i= i+original.length/2) { if(i==0) { valueToCompare =
		 * original[i]; } if (valueToCompare < original[i]) { valueToCompare =
		 * original[i]; } } System.out.println("Original Array: " +
		 * Arrays.toString(original));
		 * System.out.println("Largest element between first, last, and middle values: "
		 * + valueToCompare);
		 */
// 83. Write a Java program to multiply corresponding elements of two arrays of integers.
		/*
		 * String res = "Result: "; int[] array1 = {1, 3, -5, 4}; int[] array2 = {1, 4,
		 * -5, -2};
		 * 
		 * for(int i=0; i< array1.length; i++) { res += (array1[i] * array2[i]) + " "; }
		 * System.out.println("Array1: " + Arrays.toString(array1));
		 * System.out.println("Array1: " + Arrays.toString(array2));
		 * System.out.println(res);
		 */
		/*
		 * String result = ""; int[] left_array = {1, 3, -5, 4}; int[] right_array = {1,
		 * 4, -5, -2}; System.out.println("\nArray1: "+Arrays.toString(left_array));
		 * System.out.println("\nArray2: "+Arrays.toString(right_array)); for (int i =
		 * 0; i < left_array.length; i++) { int num1 = left_array[i]; int num2 =
		 * right_array[i]; result += Integer.toString(num1 * num2) + " "; }
		 * System.out.println("\nResult: "+result);
		 */
// 84. Write a Java program to take the last three characters from a given string
		// and add the three characters at both the front and back of the string.
		// String length must be greater than three and more. Test data: "Python" will
		// be "honPythonhon"
		/*
		 * String testData = "Python"; String toFront =
		 * testData.substring(testData.length()-3,testData.length()); //String toBack =
		 * testData.substring(0,3); System.out.println(toFront + testData + toFront);
		 */
// 85. Write a Java program to check if a string starts with a specified word. 	
		/*
		 * String sentence = "Hello how are you?"; String[] words = sentence.split(" ");
		 * String specifiedWord="Hello"; System.out.println(words[0]);
		 * System.out.println((words[0].equals(specifiedWord)));
		 */
		/*
		 * String string1 = "Hello how are you?";
		 * System.out.println(string1.startsWith("Hello"));
		 */
// 86. Write a Java program start with an integer n,
		// divide n by 2 if n is even or multiply by 3 and add 1 if n is odd,
		// repeat the process until n = 1.
		/*
		 * int ctr = 0; int n = 5; // do while n is not 1 while(n != 1) {
		 * System.out.println(n); // check if n is even if(n%2 == 0) { // n is even
		 * divide n by 2 n = n/2; ctr +=1; } else { // n is odd multiply by 3 and add 1
		 * n = ((n*3) +1)/2; ctr +=1; } } System.out.println(ctr);
		 */
// 87. Write a Java program than read an integer and calculate the sum of its digits 
		// and write the number of each digit of the sum in English.
		/*
		 * String stringRes =""; int sum = 0; int n = 8; String stringifyN =
		 * Integer.toString(n); for(int i=0; i<stringifyN.length(); i++) { sum +=
		 * (Character.getNumericValue(stringifyN.charAt(i))); } String stringifySum =
		 * Integer.toString(sum);
		 * 
		 * for(int i = 0; i<stringifySum.length(); i++) { switch
		 * (Character.getNumericValue(stringifySum.charAt(i))) { case 1: stringRes +=
		 * "one "; break; case 2: stringRes += "two "; break; case 3: stringRes +=
		 * "three "; break; case 4: stringRes += "four "; break; case 5: stringRes +=
		 * "five "; break; case 6: stringRes += "six "; break; case 7: stringRes +=
		 * "seven "; break; case 8: stringRes += "eight "; break; case 9: stringRes +=
		 * "ninth "; break; case 0: stringRes += "zero "; break; };
		 * 
		 * } System.out.println("Original Number: " + n);
		 * System.out.println("Sum of the digits of the said number: " + sum);
		 * System.out.println("In English: " + stringRes);
		 */
// .88 	Write a Java program to get the current system environment and system properties.
		/*
		 * System.out.println("\nCurrent system environment:");
		 * System.out.println(System.getenv());
		 * System.out.println("\n\nCurrent system properties:");
		 * System.out.println(System.getProperties());
		 */
// 89 	Write a Java program to check whether a security manager has already been 
		// established for the current application or not.
		/*
		 * System.out.println("System security interface:");
		 * System.out.println(System.getSecurityManager());
		 */
// 90	Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME
		// gets the value of the specified environment variable "PATH"
		/*
		 * System.out.println("\nEnvironment variable PATH: ");
		 * System.out.println(System.getenv("PATH"));
		 * 
		 * // gets the value of the specified environment variable "TEMP"
		 * System.out.println("\nEnvironment variable TEMP: ");
		 * System.out.println(System.getenv("TEMP"));
		 * 
		 * // gets the value of the specified environment variable "USERNAME"
		 * System.out.println("\nEnvironment variable USERNAME: ");
		 * System.out.println(System.getenv("USERNAME"));
		 */
// 91 	 Write a Java program to measure how long some code takes to execute in nanoseconds.
		/*
		 * long startTime = System.nanoTime(); // Sample program // Display the first 10
		 * natural numbers. int i; System.out.println
		 * ("The first 10 natural numbers are:\n"); for (i=1;i<=10;i++) {
		 * System.out.println (i); } long estimatedTime = System.nanoTime() - startTime;
		 * System.out.
		 * println("Estimated time (in nanoseconds) to get the first 10 natural numbers: "
		 * +estimatedTime);
		 */
// 92 	Write a Java program to count the number 
		// of even and odd elements in a given array of integers.
		/*
		 * long startTime = System.nanoTime(); int evens = 0; int odds = 0; int[]
		 * givenlist = {1,3,5,7,9,11,13}; for(int i=0; i<givenlist.length; i++) {
		 * if(givenlist[i]%2 == 0) { evens++; } else { odds++; } }
		 * System.out.println("In given list: " + Arrays.toString(givenlist) +
		 * "\nSum of even numbers: "+ evens + "\nSum of odd numbers: " + odds); long
		 * estimatedTime = System.nanoTime() - startTime;
		 * System.out.println("Estimated time (in nanoseconds) to finish a task: "
		 * +estimatedTime);
		 */
// 93  Write a Java program to test if an array of integers contains an element
		// 10 next to 10 or an element 20 next to 20, but not both.
		/*
		 * long startTime = System.nanoTime(); int[] sampleArray =
		 * {10,8,10,10,20,15,20}; boolean found1010 = false; boolean found2020 = false;
		 * for(int i=0; i<sampleArray.length-1;i++) { if(sampleArray[i] == 10 &&
		 * sampleArray[i+1] == 10) { found1010 = true;} if(sampleArray[i] == 20 &&
		 * sampleArray[i+1] == 20) { found2020 = true;} } System.out.println(
		 * String.valueOf(found1010 != found2020));
		 * System.out.println("Estimated time (in nanoseconds) to finish a task: "+(
		 * System.nanoTime() - startTime));
		 */
// 94. Write a Java program to rearrange all the elements of an given array of integers
		// so that all the odd numbers come before all the even numbers.
		/*
		 * long startTime = System.nanoTime(); String even = ""; String odd = ""; String
		 * newvalues = ""; int[] array = {1,2,3,4,5,6,7,8,9}; for(int i=0;
		 * i<array.length;i++) { if((array[i])%2 == 0) { even += array[i]; } else { odd
		 * += array[i]; } } newvalues = odd + even; for(int i=0;
		 * i<newvalues.length();i++) { array[i] =
		 * Character.getNumericValue(newvalues.charAt(i)); }
		 * System.out.println(Arrays.toString(array));
		 * System.out.println("Estimated time (in nanoseconds) to finish a task: "+(
		 * System.nanoTime() - startTime));
		 */
		/*
		 * long startTime = System.nanoTime(); int[] array_nums = {1,2,3,4,5,6,7,8,9};
		 * 
		 * int i = 0;
		 * System.out.println("Original Array: "+Arrays.toString(array_nums)); while(i <
		 * array_nums.length && array_nums[i] % 2 == 0) i++;
		 * 
		 * for(int j = i + 1; j < array_nums.length; j++) { if(array_nums[j] % 2 != 0) {
		 * int temp = array_nums[i]; array_nums[i] = array_nums[j]; array_nums[j] =
		 * temp; i++; } }
		 * 
		 * System.out.println("New Array: "+Arrays.toString(array_nums));
		 * System.out.println("Estimated time (in nanoseconds) to finish a task: "+(
		 * System.nanoTime() - startTime));
		 */

		/*
		 * long[] first = {336543,342169,398756,358384,381879}; long[] second =
		 * {389489,328931,319997,331248,325953};
		 * 
		 * long firstMiddle = middle(first); long secondMiddle = middle(second);
		 * 
		 * System.out.println("firstMiddle: " + firstMiddle + "\nsecondMiddle: " +
		 * secondMiddle);
		 * 
		 */
// 95. Write a Java program to create an array (length # 0) of string values. 
//	The elements will contain "0", "1", "2" … through ... n-1.
		/*
		 * int arrayLength = 5; String[] numbersToString; numbersToString = new
		 * String[arrayLength];
		 * 
		 * for (int i=0; i < numbersToString.length; i++) { numbersToString[i] =
		 * Integer.toString(i); } //System.out.println(numbersToString);
		 * System.out.println("New Array: "+java.util.Arrays.toString(numbersToString));
		 * //for(numbersToString)
		 * 
		 * int n= 5; String[] arr_string = new String[n];
		 * 
		 * for(int i = 0; i < n; i++) arr_string[i] = String.valueOf(i);
		 * System.out.println("New Array: "+Arrays.toString(arr_string));
		 */
// 96. Write a Java program to check if there is a 10 in a given array of integers 
		// with a 20 somewhere later in the array.
		/*
		 * Boolean tenIsThere = false; int res = 0; int[] givenList = {5, 70, 80, 50,
		 * 20, 13, 50}; for (int i=0; i < givenList.length; i++) { if(givenList[i] ==
		 * 10) { System.out.println("There is 10 in a list on position: " + i );
		 * tenIsThere = true; }; if(tenIsThere && givenList[i] == 20) {
		 * System.out.println("There is 10 in a list and 20 after on position: " + i );
		 * res = 1; } } if(res == 1) { System.out.println("Conditions are meth"); } else
		 * { System.out.println("Conditios are not meth"); }
		 * 
		 * int[] array_nums = {5, 70, 80, 50, 20, 13, 50}; boolean testd = false; int
		 * result=0; int x = 10; int y = 20;
		 * 
		 * for(int i = 0; i < array_nums.length; i++) { if(array_nums[i] == x) testd =
		 * true;
		 * 
		 * if(testd && array_nums[i] == y) { System.out.printf( String.valueOf(true));
		 * result = 1 ; } } if (result==0) { System.out.printf( String.valueOf(false));
		 * } System.out.printf("\n");
		 * 
		 */
// 	97. Write a Java program to check if an array of integers contains a specified number 
		// next to each other or there are two same specified numbers separated by one
		// element.
		/*
		 * int[]givenArray = {5, 3, 5, 2, 6, 7, 5, 5, 3, 1, 5}; int specNum = 5; Boolean
		 * cond1 = false; Boolean cond2 = false;
		 * 
		 * for(int i = 0; i < givenArray.length-1; i++) {
		 * 
		 * if (givenArray[i] == specNum && givenArray[i+1] == specNum) { cond1 = true;
		 * 
		 * } else if (i < givenArray.length-2 && givenArray[i] == specNum &&
		 * givenArray[i+2] == specNum) { cond2 = true;
		 * 
		 * } }
		 * 
		 * if(cond1) {
		 * System.out.println("array of integers contains a specified number ("+ specNum
		 * +") next to each other."); }; if(cond2) {
		 * System.out.println("there are two same specified numbers ("+ specNum
		 * +") separated by one element."); }; if(cond1 == false && cond2 == false) {
		 * System.out.println("No matches!"); }
		 */
		/*
		 * int[] array_nums = {10, 20, 7, 50, 20, 13, 50}; //int[] array_nums = {10, 10,
		 * 50, 50, 20, 13, 50}; boolean testd = false; int result=0; int x = 10;
		 * 
		 * for(int i = 0; i < array_nums.length - 1; i++) { if(array_nums[i] == x &&
		 * array_nums[i+1] == x) { System.out.printf( String.valueOf(true)); result = 1
		 * ; }
		 * 
		 * if(i <= array_nums.length - 3 && array_nums[i] == x && array_nums[i+2] == x)
		 * { System.out.printf( String.valueOf(true)); result = 1 ; } }
		 * 
		 * if (result==0) { System.out.printf( String.valueOf(false)); }
		 * System.out.printf("\n");
		 * 
		 */
// 98. Write a Java program to check if the value 20 appears three times 
//		and no 20's are next to each other in an given array of integers.		
		/*
		 * Boolean noTwentysNext = true; int twentyCounter = 0; int[] givenArray = { 10,
		 * 15, 20, 3, 20, 4, 20, 5 };
		 * 
		 * for (int i = 0; i < givenArray.length; i++) { if (givenArray[i] == 20) {
		 * twentyCounter++; } if (i < givenArray.length - 1) { if (givenArray[i] == 20 &
		 * givenArray[i + 1] == 20) { noTwentysNext = false; } } }
		 * 
		 * if (twentyCounter == 3 & noTwentysNext == true) { System.out.println(
		 * "Number 20 apear " + twentyCounter + " times. And numbers " +
		 * "are not in next eachother index."); }
		 */
// 99. Write a Java program to check if a specified number appears 
//		in every pair of adjacent element of a given array of integers.
		/*
		 * int specNumber = 5; int[] givenArray = { 5, 3, 5, 6, 5, 8, 5, 5, 2, 5, 4 };
		 * Boolean specNumAppear = false;
		 * 
		 * for (int i = 0; i < givenArray.length - 1; i++) { if (givenArray[i] !=
		 * specNumber && givenArray[i + 1] != specNumber) { specNumAppear = false;
		 * break; } else { specNumAppear = true; System.out.println(givenArray[i]); } }
		 * System.out.println(String.valueOf(specNumAppear));
		 */

// 100. Write a Java program to count the two elements differ by 1 
//	or less of two given arrays of integers with same length
		/*
		 * int[] arr1 = {10, 11, 10, 20, 43, 20, 50}; int[] arr2 = {11, 13, 11, 21, 44,
		 * 30, 51}; int counter = 0;
		 * 
		 * for(int i=0; i < arr1.length; i++) { if(Math.abs(arr1[i] - arr2[i]) <= 1 ) {
		 * counter++; } } System.out.println("Array1: "+Arrays.toString(arr1));
		 * System.out.println("Array2: "+Arrays.toString(arr2));
		 * System.out.println("Number of elements: " + counter);
		 * 
		 */
// 101. Write a Java program to check if the number of 10 is 
		// greater than number to 20's in a given array of integers.
		/*
		 * int[] array_nums = {10, 11, 10, 30, 45, 20, 42, 53}; int nextTo10 = 0; int
		 * nextTo20 = 0; for(int i=0; i < array_nums.length-1; i++) { if(array_nums[i]
		 * == 10) { nextTo10 += array_nums[i+1]; } else if (array_nums[i] == 20) {
		 * nextTo20 += array_nums[i+1]; } } System.out.println(String.valueOf(nextTo10 >
		 * nextTo20));
		 */
// 102. Write a Java program to check if a specified array of integers contains 10's or 30's
		/*
		 * int[] nums = {11, 11, 13, 31, 45, 20, 33, 53}; Boolean isThere10 = false;
		 * Boolean isThere30 = false;
		 * 
		 * for(int i = 0; i < nums.length; i++) { if(nums[i] == 10) { isThere10 = true;
		 * } else if (nums[i] == 30) { isThere30 = true; } }
		 * System.out.println("original Array: " + Arrays.toString(nums));
		 * System.out.println(String.valueOf(isThere10 && isThere30));
		 */
// 103. Write a Java program to create a new array from a given array of integers, 
		// new array will contain the elements from the given array after the last
		// element value 10.
		/*
		 * int[] old = {11, 10, 13, 10, 45, 20, 33, 53}; // count how many element after
		 * 10 is in array int elementCountAfter10 = 0; Boolean tenFound = false; for(int
		 * i = old.length-1; i > -1; i--) { System.out.println(old[i]); if(old[i] == 10)
		 * { tenFound = true; } if(tenFound == false) { elementCountAfter10++; } }
		 */
		/*
		 * HIBAS KOD RESZ: mert csak az also 10 estol amit talal szamolja az array
		 * elementeket. for(int i = 0; i < old.length; i++) { if(tenFound == true) {
		 * elementCountAfter10++; } if(tenFound == false) { if(old[i] == 10) { tenFound
		 * = true; } }
		 */
		/*
		 * int[] newArray = new int[elementCountAfter10]; for(int i = 0; i <
		 * newArray.length; i++) { newArray[i] = old[(old.length) - elementCountAfter10
		 * + i]; }
		 * 
		 * System.out.println("Old Array: " + Arrays.toString(old));
		 * System.out.println("New Array: " + Arrays.toString(newArray));
		 */
		/*
		 * int[] array_nums = {11, 10, 13, 10, 45, 20, 33, 53}; int result = 0;
		 * System.out.println("Original Array: "+Arrays.toString(array_nums));
		 * 
		 * int l = array_nums.length - 1; int[] new_array; while(array_nums[l] != 10)
		 * l--; new_array = new int[array_nums.length - 1 - l]; for(int i = l + 1; i <
		 * array_nums.length; i++) new_array[i - l - 1] = array_nums[i];
		 * System.out.println("New Array: "+Arrays.toString(new_array));
		 */

// 104. Write a Java program to create a new array from a given array of integers,
//		new array will contain the elements from the given array before the last element value 10.
		/*
		 * int[] old = { 11, 10, 13, 10, 45, 20, 33, 53 }; // count how many element
		 * before last 10 is in array int elementCountBeforeLast10 = 0; Boolean tenFound
		 * = false;
		 * 
		 * for (int i = old.length - 1; i > -1; i--) { if (tenFound == true) {
		 * elementCountBeforeLast10++; } if (old[i] == 10) { tenFound = true; } } int[]
		 * newArray = new int[elementCountBeforeLast10]; for (int i = 0; i <
		 * newArray.length; i++) { newArray[i] = old[i]; }
		 * 
		 * System.out.println("Old Array: " + Arrays.toString(old));
		 * System.out.println("New Array: " + Arrays.toString(newArray));
		 */
// 105	Write a Java program to check if a group of numbers (l) 
		// at the start and end of a given array are same.
		/*
		int[] old = { 53, 2, 13, 10, 45, 53, 10, 13 };

		Boolean areSame = false;

		int lengthOfGroup = 3;

		for (int i = 0; i < lengthOfGroup; i++) {
			System.out.println("Comparing: " + old[i] + " != " + old[old.length - lengthOfGroup + i] );
			if (old[i] != old[old.length - lengthOfGroup + i]) {
				areSame = false;				
				break;
			} else {				
				areSame = true;
			}
		}
		System.out.println("Array: " + Arrays.toString(old));
		System.out.println(areSame);
		*/
		/*
		int[] array_nums = {11, 15, 13, 10, 45, 11, 15, 13};
	    System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		
		int result = 0;
		int l = 3;
	    int start = 0;
		int end = array_nums.length-l;
		for(; l > 0; l--)
		{
			if(array_nums[start] != array_nums[end])
				result = 1;
			else
			{
				start++;
				end++;
			}
		}
		                
	    if (result==1)
		 {
		  System.out.printf(String.valueOf(false));
		 }
		else
		 {
		   System.out.printf(String.valueOf(true));
		 }
		 System.out.printf("\n");	
		*/
// 106. Write a Java program to create a new array that is left shifted from a given array of integers.
		/*
		int[] array_nums = {11, 15, 13, 10, 45, 20};
		System.out.println("Old num array: " + Arrays.toString(array_nums));
		int[] newArray = new int[array_nums.length];
		for(int i = 0; i < newArray.length; i++) {
			if(i == 0) {
				newArray[newArray.length-1] = array_nums[i];
			} else {
				newArray[i-1] = array_nums[i];
			}
		}				
		System.out.println("New, shifted left num array: " + Arrays.toString(newArray));
		*/
	// 	Write a Java program to resort array what is left shifted from a given array of integers.
		/*
		int[] array_nums = {11, 15, 13, 10, 45, 20};
		System.out.println("Old num array: " + Arrays.toString(array_nums));
		
		int lastNumber = array_nums[0];
		for(int i = 1; i < array_nums.length; i++) {
				array_nums[i-1] = array_nums[i];
		}
		array_nums[array_nums.length-1] = lastNumber;
		
		System.out.println("Shifted left num array: " + Arrays.toString(array_nums));
		*/
// 107. Write a Java program to check if an array of integers contains three increasing adjacent numbers.
		/*
		int[] array_nums = {11, 12, 13, 14, 15, 16};
		System.out.println("array: " + Arrays.toString(array_nums));
		int counter = 0;
		
		for(int i = 0; i < array_nums.length-1; i++) {
			if (array_nums[i] + 1 == array_nums[i+1]) {
				counter++;
				if(counter == 3) {
				break;
				}
			}
		}
		
		System.out.println(counter);
		*/
		/*
		int[] array_nums = {11, 12, 13, 14, 45, 20};
	    System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		int result =1;
		
	      for(int i = 0; i <= array_nums.length - 3; i++) {
	        if(array_nums[i] + 1 == array_nums[i+1] && array_nums[i+1] + 1 == array_nums[i+2])
	            result =0;
	    }
	                
		if (result==1)
		 {
		  System.out.printf(String.valueOf(false));
		 }
		else
		 {
		   System.out.printf(String.valueOf(true));
		 }
		 System.out.printf("\n");
		*/
// 108. Write a Java program to add all the digits of a given positive integer 
	//	until the result has a single digit 
		/*
		Scanner input = new Scanner(System.in);
		int num = 0;
		while(num <= 9) {
			System.out.println("Input positive number bigger than 9: ");
			num = input.nextInt();
		}
						
		while(num > 9) {
			String textNum = (Integer.toString(num));
			int partRes = 0;
			int loopSize = textNum.length();
			for(int i = 0; i < loopSize; i++ ) {
				partRes += Character.getNumericValue(textNum.charAt(i));
			}
			num = partRes;
		}
		
		System.out.println(num);
		input.close();	
		*/
		/*
		Scanner in = new Scanner(System.in);	
	       System.out.print("Input a positive integer: ");
	        int n = in.nextInt();
	        int n2 = n;
	        if (n>0)
			{
	          System.out.print("The single digit number is: " + (n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
			}
			System.out.println("\n");
			*/
			// probalom megerteni a logikat (a ternary operatort es a logikat hogy adja ossze) 
			/*
			if(n2 == 0) {
				System.out.println("if n2 == 0: " + n2);
				n2 = 0;
				System.out.println("if n2 == 0: " + n2);
			} else if ( n2 % 9 == 0) {
				System.out.println("else if n2 % 9 == 0: " + n2);
				n2 = 9;
				System.out.println("else if n2 % 9 == 0: " + n2);
			} else {
				System.out.println("else n2 % 9: " + n2);
				n2 = n2 % 9;
				System.out.println("else n2 % 9: " + n2);
			}
			
			System.out.println(n2);
			*/
// 109. Write a Java program to form a staircase shape of n coins 
	//	where every k-th row must have exactly k coins.
		/*
		Scanner in = new Scanner(System.in);	
	    System.out.print("Input a positive integer: ");
	    
	    int n = in.nextInt();
		int count = 0;
		int k = 1;
		int kIncreaser = 2;
		int rows = 0;
		
		
		for( int i = 0; i < n ; i++) {
			System.out.print("$");
			count++;
			if(count == k) {
				System.out.print("\n");
				rows ++;
				k = k + kIncreaser;
				kIncreaser++;
			}			
		}
		
		System.out.println("\nNumber of complette row/s: " + (rows));
		*/
		/*
		Scanner in = new Scanner(System.in);	
	       System.out.print("Input a positive integer: ");
	        int n = in.nextInt(); 
			if (n>0)
			{
	           System.out.println("Number of rows: "+((int)((Math.sqrt(8 * (long)n + 1) - 1) / 2)));	
			}
		
		*/
// 110. //Write a Java program to check whether an given integer is a power of 4 or not.
		/*
		int test = 0;
		Scanner in = new Scanner(System.in);	
	    System.out.print("Input a integer: ");
	    int n = in.nextInt(); 
	    if(n < 1) {
	    	System.out.println(String.valueOf(false));
	    	test = 1;
	    }
	    if ((n & (n - 1)) != 0) {
	    	System.out.println(String.valueOf(false));
	    	test = 1;
	    }
	    if (test == 0)
	    {
	    	System.out.print(Boolean.toString((n & 0x55555555) != 0));
	    }
	    System.out.print("\n");
	    */
// 111. Write a Java program to add two numbers without using any arithmetic operators. 
		/*
		int x = 10;
		int y = 12;
		int res = 0;
		
		while (y != 0){
            int carry = (x & y) ; //CARRY is AND of two bits
          
            x = x ^y; //SUM of two bits is A XOR B
          
            y = carry << 1; //shifts carry to 1 bit to calculate sum
        };
        
        res = x;
        System.out.println(res);
        */
//      112. Write a Java program to compute the number of trailing zeros in a factorial.		
		/*
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = in.nextInt();
		int n1 = n;
		long ctr = 0;
		while (n != 0) {
			ctr += n / 5;
			n /= 5;
		}
		System.out.printf("Number of trailing zeros of the factorial %d is %d ",n1,ctr);
		System.out.printf("\n");
		*/
// 	113. Write a Java program to merge two given sorted array of integers and create a new sorted array.
	/*	
		long startTime = System.nanoTime();
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {2,5,7,8};
		System.out.println("Arr 1: " + Arrays.toString(arr1));
		System.out.println("Arr 2: " + Arrays.toString(arr2));
		int[] newArray = new int[arr1.length + arr2.length];
		int k = 0;
		for(int i = 0; i < arr1.length; i++) {
			newArray[i] = arr1[i];
		}
		for(int i = (newArray.length - arr1.length); i < newArray.length; i++) {
			newArray[i] = arr2[k];
			k++;
		}	    	    
		Arrays.sort(newArray);
		System.out.println("New, merged and sorted array: " + Arrays.toString(newArray));
		System.out.println("Estimated time (in nanoseconds) to finish a task: "+(
	    System.nanoTime() - startTime));
	*/
		/*	
		startTime = System.nanoTime();
        int array1[]=new int[8];
//initialization.
       array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
       int[] array2 = {2,5,7,8};
        System.out.println("\nArray1: "+Arrays.toString(array1));  
	    System.out.println("\nArray2: "+Arrays.toString(array2));
		int m =4, n=4;
		int i = m-1, j = n-1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (array1[i] > array2[j]) {
                array1[index--] = array1[i--];
            } else {
                array1[index--] = array2[j--];
            }
        }
        while (i >= 0) {
            array1[index--] = array1[i--];
        }
        while (j >= 0) {
            array1[index--] = array2[j--];
        }
 
    	System.out.println("\nMerged array: "+Arrays.toString(array1));  
    	System.out.println("Estimated time (in nanoseconds) to finish a task: "+(
    		    System.nanoTime() - startTime));
	*/	
// 114. Write a Java program to given a string and an offset, rotate string by offset (rotate from left to right) 		
		/*
		double startTime = System.nanoTime();
		int offsetmy = 3;
		String text = "abcdef";
		
		char[] newArray = new char[text.length()];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = text.charAt(i);
		}		
		System.out.println(newArray);
		int j = 0; 
		for (int i = 0; i < newArray.length; i++) {
			if(i + offsetmy < newArray.length) {
			System.out.print(newArray[i + offsetmy]);
			} else {
				System.out.print(newArray[j]);
				j++;
			}
		};
		System.out.println("\nEstimated time (in nanoseconds) to finish a task: "+(
		System.nanoTime() - startTime));
		*/
		/*
		startTime = System.nanoTime();
		String str = "abcdef"; 
	     char[] A = str.toCharArray();
		 int offset=3;
	     int len = A.length;
	     offset %= len;
	     reverse(A, 0, len - offset - 1);
	     reverse(A, len - offset, len - 1);
	     reverse(A, 0, len - 1);
	     System.out.println("\n"+Arrays.toString(A));
		
		
		System.out.println("\nEstimated time (in nanoseconds) to finish a task: "+(System.nanoTime() - startTime));
		*/
// 115 Write a Java program to check if a positive number is a palindrome or not.
		/*
		Scanner input = new Scanner(System.in);
		int n = 0;
		while(n < 1) {
		System.out.print("input positvie number: ");	
		n = input.nextInt();}
		System.out.printf("Is %d is a palindrome number?\n",n);
		System.out.println(palindrome(n)); 
		*/
// 116. Write a Java program which iterates the integers from 1 to 100. 
	//  For multiples of three print "Fizz" instead of the number and print "Buzz" for the multiples of five. 
    //  When number is divided by both three and five, print "fizz buzz". 		
		/*
		for(int i = 1; i < 101; i++) {
			if ( i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " fizz buzz ");
			} else if (i % 3 == 0) {
				System.out.println(i + " fizz ");
			} else if (i % 5 == 0) {
				System.out.println(i + " buzz ");
			}
		}
		*/
// 117.	Write a Java program to compute the square root of an given integer.
		/*
		Scanner in = new Scanner(System.in);
		System.out.print("Input integer to look for square root: ");
		int n = in.nextInt();
		in.close();
		System.out.println(sqrt(n));
		*/
// 118. Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string.
		/*
		String str = "Python";
		String search = "hon";
		
		System.out.printf(String.valueOf(strStr(str, search)));
		*/
// 119. Write a Java program to get the first occurrence (Position starts from 0.) of an element of a given array.
		
		/* 
		int nums[] = {2, 4, 6, 7, 8};
	    int target = 4;
	    int atPosition = 0;
	    boolean isMatch = false;
	    
	    for( int i = 0; i < nums.length; i++) {
	    	if (nums[i] == target) {
	    		atPosition = i;
	    		isMatch = true;
	    		break;
	    	} else {
	    		isMatch = false;
	    	}
	    }
	    if(isMatch) {
	    System.out.println("Position of " + target + " is " + atPosition);
	    } else {
	    	System.out.println("No match found");
	    }
	    */
		/*
	
		int nums[] = {2, 4, 6, 7, 8};
	    int target = 4;
	        int lower = 0;
	        int upper = nums.length - 1;
	        int index = -1;
	        while (lower <= upper) {
	            int mid = (lower + upper) >> 1;
	            if (nums[mid] == target) {
	                index = mid;
	            }
	            if (nums[mid] >= target) {
	                upper = mid - 1;
	            } else {
	                lower = mid + 1;
	            }
	        }
	        System.out.print("Position of "+target +" is "+index);
	        */
// 120. Write a Java program that searches a value in an m x n matrix.
		
		
	    
		
	}
	
// 118. 
	/*	
	public static int strStr(String source, String target) {
			if(source == null || target == null) {
				return -1;
			}
			if("".equals(target) || source.equals(target)) {
				return 0;
			}
			
			int i = 0;
			int last = source.length() - target.length() + 1;
			while(i < last) {
				if (source.charAt(i) == target.charAt(0)) {
					boolean equal = true;
					for (int j = 0; j < target.length() && equal; ++j) {
						if(source.charAt(i + j) != target.charAt(j)) {
							equal =false;
						}
					}
					if (equal) {
						return i;
					}
				}
				++i;
			}
			
			return -1;
			
			
		}
		*/ 	
	/*
//117.	private static int sqrt(int dnum) {
			if (dnum == 0 || dnum == 1 ) {
				return dnum;
			}
			
			int a = 0;
			int b = dnum;
			
			while (a <= b) {
				int mid = (a + b) >> 1;
				if(dnum / mid < mid) {
					b = mid - 1;
				} else {
					if (dnum / (mid + 1) <= mid ) {
						return mid;
					}
				
				a = mid + 1; 
			}
	}
			return a;
}
	*/
// 115 
	/*
		private static boolean palindrome(int num) {
			String str = String.valueOf(num);
			int i = 0;
			int j = str.length()-1;
			while(i < j) {
				if (str.charAt(i++) != str.charAt(j--)) {
					return false;
				}
			}
			return true;
		}
	
		*/
// 114
		/*
		private static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
	}
	*/
// 	
	
//	94. utani 
	/*
	 * public static long middle(long[] a) { long result = 0; for(int
	 * i=0;i<a.length;i++) { result += a[i]; }
	 * 
	 * return result / a.length;
	 * 
	 * }
	 */
// 74.	
	/*
	 * public static boolean comapre_first_or_last_is_10(int[] a) { if(a[1] == 10 ||
	 * a[a.length-1] == 10) { return true; } else { return false; } }
	 */
	/*
	 * //66 public static boolean is_prime(int n) { for(int i = 3; i * i <= n; i+=2)
	 * { if(n % i == 0) { return false; } } return true; }
	 * 
	 * //65 /* public static int modules(int x, int y) { int result = x / y; result
	 * = x - (result * y); return result; }
	 */
	// 64
	/*
	 * public static boolean common_digit(int p, int q) { if (p<25 || q>75) return
	 * false; int x = p % 10; System.out.println(x); int y = q % 10;
	 * System.out.println(y); p /= 10; System.out.println(p); q /= 10;
	 * System.out.println(q); return (p == q || p == y || x == q || x == y); }
	 */
	/*
	 * my solution: public static boolean testNumber(int a) { if (a >= 75| a <=25) {
	 * System.out.println("Wrong number,"); return false; } return true; }
	 * 
	 * 
	 * public static boolean test(String a, String b) { for(int i=0;i <
	 * a.length();i++) { for (int k=0; k < b.length();k++) { if (a.charAt(i) ==
	 * b.charAt(k)) { System.out.println("there is a common digit in both numbers: "
	 * + a.charAt(i) + " !"); return(true); } } } return false; }
	 */
	// 56
	/*
	 * public static int result(int x, int y, int p) { if (x%p == 0) return( y/p -
	 * x/p + 1); return(y/p - x/p);
	 * 
	 * // y = 20 // ha az x-et (5) elosztom p-vel (3) es nincs maradek (0) // akkor
	 * a return ( y/p - x/p + 1) (2) // maskulomben (y/p - x/p); (5)
	 * 
	 * }
	 */
	// 54
	/*
	 * public static boolean test_last_digit(int p, int q, int r, boolean xyz) {
	 * 
	 * return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10); }
	 */

	/*
	 * 53 public static boolean test(int p, int q, int r, boolean xyz) { if(xyz)
	 * return (r>q); return(q>p && r > q); }
	 */
	/*
	 * 52. public static boolean sumoftwo(int p, int q, int r) { return ((p + q) ==
	 * r || (q + r) == p || (r + p) == q); }
	 */
	/*
	 * // 33. Write a Java program and compute the sum of the digits public static
	 * int sumDigits(long n) { int sum = 0; while (n != 0) {
	 * System.out.println("n erteke: " + n); sum += n % 10;
	 * System.out.println(" n % 10 erteke: " + (n % 10));
	 * System.out.println("sum erteke (sum += n % 10) : " + sum); n = n / 10;
	 * System.out.println("n erteke (n /= 10): " + n); } return sum; }
	 */
	/*
	 * 18. Write a Java program to multiply two binary numbers. static int
	 * binaryproduct(int binary1, int binary2) { int i = 0, remainder = 0; int[] sum
	 * = new int[20]; int binary_prod_result = 0;
	 * 
	 * while (binary1 != 0 || binary2 != 0) { sum[i++] = (binary1 % 10 + binary2 %
	 * 10 + remainder) % 2; remainder = (binary1 % 10 + binary2 % 10 + remainder) /
	 * 2; binary1 = binary1 / 10; binary2 = binary2 / 10; } if (remainder != 0) {
	 * sum[i++] = remainder; } --i; while (i >= 0) { binary_prod_result =
	 * binary_prod_result * 10 + sum[i--]; } return binary_prod_result; }
	 */

	/*
	 * private static String File(String string) { // TODO Auto-generated method
	 * stub return null;
	 */
}
