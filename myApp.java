import java.util.Scanner;
public class myApp{
    public static void main(String[] argv){
      //Declaration block
		  Scanner scanf = new Scanner(System.in);
      final double absoluteZero = 273.15;
      final double PIE = 3.14159;
      final double FeetToMeter = 0.305; //One feet is equal to 0.305 meters
      final double INCH_TO_METER = 0.0254;
      final double POUND_TO_KG = 0.45359237; //One pound is equal to 0.454 KG
      final int START_POPULATION = 312032486;
      final double SECONDS_IN_YEAR = 31536000;
      final int BIRTH_RATE = 7;
      final int DEATH_RATE = 13;
      final int IMMIGRANT_RATE = 45;
      final int HEAT_CAPACITY_OF_WATER = 4184;
      final double MONTHLY_INTEREST_RATE = 0.00417;
      final int NUMBER_OF_MONTHS = 12; //Number of months in a year
      double area, volume, meters;
      int option;   //question number

      do{
          System.out.print("\n=====================================\nEnter exercise number or 0 to exit: \n=====================================");
          String exNoF = scanf.next();    //Take input from user in the form of string
          String exNoI = exNoF.replace(".", "");  //Remove '.' form input string
          option = Integer.parseInt(exNoI);   //Convert input into integer
          if((option <21) || (option > 223)){ // if input is not valid
            if (option != 0){
              System.out.println("Invalid value entered\n");
            }
          }
          else  // else valid input
          {
              if((int)(option/100)==0)
                  option = option%10;
              else
                  option = option%100;

              chapter2.showQuestion(option);
              switch (option){
              case 1: //exercise 2.1
                System.out.print("Key in the Celsius Temperature: ");
                double temp = scanf.nextDouble(); //Take input from user in the form of double
                temp += absoluteZero;
                System.out.println("The Temperature in Kelvin is: " + temp);
              break;
              case 2: //exercise 2.2
                System.out.print("Enter the radius of the cylinder: ");
                double radius = scanf.nextDouble(); //Take input from user in the form of double
                System.out.print("Enter the length of the cylinder: ");
                double length = scanf.nextDouble(); //Take input from user in the form of double
                area = PIE * radius * radius;
                area = (Math.round(area * 100)) / 100.0; //Round the area to two decimal places
                volume = area * length;
                volume = (Math.round(volume * 100)) / 100.0;
                System.out.println("The area of the cylinder is: " + area + "\nThe volume of the cylinder is: " + volume);
              break;
              case 3: //exercise 2.3
                System.out.print("Enter feet: ");
                double feet = scanf.nextDouble(); //Take input from user in the form of double
                meters = feet * FeetToMeter;
                System.out.println(feet + " feet is " + meters + " meters");
              break;
              case 4: //exercise 2.4
                System.out.print("Enter weight in pounds: ");
                float pounds = scanf.nextFloat(); //Take input from user in the form of float
                double kilograms = pounds * POUND_TO_KG;
                kilograms = (Math.round(kilograms * 100)) / 100.0;
                System.out.println("The weight in kilograms is: " + kilograms);
              break;
              case 5: //exercise 2.5
                System.out.print("Enter the subtotal: ");
                float subtotal = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("Enter the gratuity rate: ");
                float gratuity = scanf.nextFloat(); //Take input from user in the form of float
                gratuity /= 10;
                float total = subtotal + gratuity;
                System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
              break;
              case 6: //exercise 2.6
                System.out.println("Enter an integer between 0 to 1000");
                System.out.print("Integer: ");
                int num = scanf.nextInt(); //Take input from user in the form of integer
                int x = num; //Variabe to hold the value of x temporarily
                int digitSum = 0;
                int len = 0;
                while (num >= 1){
                  num /= 10;
                  len++;
                }
                num = x; //Restore the value of num
                for (int i = 0; i <= len; i++){
                  digitSum += (num % 10);
                  num = num / 10;
                }
                System.out.println("The sum of digits is: " + digitSum);
              break;
              case 7: //exercise 2.7
                int years = 0;
                System.out.print("Key in the number of minutes: ");
                int minutes = scanf.nextInt(); //Take input from user in the form of integer
                int hours = minutes / 60; //There are 60 minutes in an hour
                int days = hours / 24; //There are 24 hours in a day
                years = days / 365;
                days = days % 365;
                System.out.println(minutes + " minutes is approximately " + years + " year and " + days + " days");
              break;
              case 8: //exercise 2.8
                int zone = 0;
                long actualSeconds = 0;
                long milliSeconds = 0;
                long totalSeconds = 0;
                long totalMinutes = 0;
                long totalHours = 0;
                long actualMinutes = 0;
                long actualHours = 0;
                System.out.print("Enter the time zone offset to GMT: ");
                zone = scanf.nextInt(); //Take input from user in the form of integer
                milliSeconds = System.currentTimeMillis();
                totalSeconds = milliSeconds / 1000;
                actualSeconds = totalSeconds % 60;
                totalMinutes = totalSeconds / 60;
                actualMinutes = totalMinutes % 60;
                totalHours = totalMinutes / 60;
                actualHours = totalHours % 24;
                actualHours += zone;
                System.out.println("Current time is " + actualHours + ":" + actualMinutes + ":" + actualSeconds);
              break;
              case 9: //exercise 2.9
                float initialVelocity, finalVelocity, timeSpan;
                double acceleration;
                System.out.print("Enter the starting velocity: ");
                initialVelocity = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("Enter the ending velocity: ");
                finalVelocity = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("Enter the time span: ");
                timeSpan = scanf.nextFloat(); //Take input from user in the form of float
                acceleration = (finalVelocity - initialVelocity) / timeSpan;
                acceleration = (Math.round(acceleration * 10000)) / 10000.0; //Adjust the number of decimal places
                System.out.print("The average acceleration is " + acceleration);
              break;
              case 10: //exercise 2.10
                System.out.print("Enter the amount of water: ");
                float water_amount = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("Enter the initial temperature of the water: ");
                float initial_temp = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("Enter the final temperature of the water: ");
                float final_temp = scanf.nextFloat(); //Take input from user in the form of float
                float energy = water_amount * (final_temp - initial_temp) * HEAT_CAPACITY_OF_WATER;
                System.out.println("The energy required is " + energy + " joules");
              break;
              case 11: //exercise 2.11
                int population;
                double births, deaths, immigrants;
                System.out.print ("Enter the numbers of years: ");
                years = scanf.nextInt(); //Take input from user in the form of integer
                births = years * SECONDS_IN_YEAR / BIRTH_RATE;
                deaths = years * SECONDS_IN_YEAR / DEATH_RATE;
                immigrants = years * SECONDS_IN_YEAR / IMMIGRANT_RATE;
                population = (int) (START_POPULATION + births - deaths + immigrants);
                System.out.println("The population in " + years + " years is " + population);
              break;
              case 12: //exercise 2.12
                float velocity;
                double runwayLength;
                System.out.print("Key in the take-off speed: ");
                velocity = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("Key in the acceleration: ");
                acceleration = scanf.nextDouble(); //Take input from user in the form of double
                runwayLength = (Math.pow(velocity, 2)) / (2 * acceleration);
                runwayLength = (Math.round(runwayLength * 1000)) / 1000.0; //Adjust the decimal places
                System.out.println("The minimum runway length for this airplane is " + runwayLength);
              break;
              case 13: //exercise 2.13
                double capital, savedAmount;
                savedAmount = 0;
                System.out.print("Key in the monthly saving amount: ");
                capital = scanf.nextFloat(); //Take input from user in the form of float
                savedAmount += capital * (1 + MONTHLY_INTEREST_RATE);
                for (int i = 1; i <= 5; i++){
                  savedAmount = (capital + savedAmount) * (1 + MONTHLY_INTEREST_RATE);
                }
                savedAmount = ((int)(savedAmount * 100)) / 100.0;
                System.out.println("The account value after six months is: " + savedAmount);
              break;
              case 14: //exercise 2.14
                double weight, height, bmi;
                System.out.print("Enter the body weight in pounds: ");
                weight = scanf.nextDouble(); //Take input from user in the form of double
                weight = weight * POUND_TO_KG; //Convert the weight into kilograms
                System.out.print("Enter the body height in inches: ");
                height = scanf.nextDouble(); //Take input from user in the form of double
                height = height * INCH_TO_METER; //Convert the height to meters
                bmi = weight / (Math.pow(height , 2));
                bmi = (Math.round(bmi * 10000)) / 10000.0; //Adjust the decimal place
                System.out.println("The BMI is "+ bmi);
              break;
              case 15: //exercise 2.15
                System.out.println("Enter the coordinates of the first point");
                System.out.print("x1: ");
                float x1 = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("y1: ");
                float y1 = scanf.nextFloat(); //Take input from user in the form of float
                System.out.println("Enter the coordinates of the second point");
                System.out.print("x2: ");
                float x2 = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("y2: ");
                float y2 = scanf.nextFloat(); //Take input from user in the form of float
                double distance = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
                distance = Math.pow(distance, 0.5);
                distance = ((int)(distance * 1000)) / 1000.0; //Adjust the decimal place
                System.out.println("The distance between the two entered point is: " + distance + " units");
              break;
              case 16: //exercise 2.16
                System.out.print("Enter the side of the hexagon: ");
                float side = scanf.nextFloat(); //Take input from user in the form of float
                side *= side;
                area = ((3 * Math.pow(3, 0.5)) / 2) * side;
                area = ((int)(area * 10000)) / 10000.0; //Adjust the decimal place
                System.out.println("The area of the hexagon is: " + area);
              break;
              case 17: //exercise 2.17
                  System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
                  float ta = scanf.nextFloat(); //Take input from user in the form of float
                  System.out.print("Enter the  wind speed (>=2) in miles per hour: ");
                  float v =  scanf.nextFloat(); //Take input from user in the form of float
                  float  twc =   (float)((35.74 + 0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16)));
                  System.out.print("The wind chill index is "+(float)twc);
              break;
              case 18: //exercise 2.18
                int i = 1;
                System.out.println("a    b    pow(a, b)");
                do{
                  System.out.println(i + "    " + (i + 1) + "    " + ((int)Math.pow(i, (i+1))));
                  i++;
                }while(i <= 5);
              break;
              case 19: //exercise 2.19
                System.out.println("Triangle area finder");
                System.out.println("Enter the coordinates of the triangle to get the area");
                System.out.println("Enter the first coordinate (x1,y1)");
                System.out.print("x1: ");
                x1 = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("y1: ");
                y1 = scanf.nextFloat(); //Take input from user in the form of float
                System.out.println("Enter the second coordinate (x2,y2)");
                System.out.print("x2: ");
                x2 = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("y2: ");
                y2 = scanf.nextFloat(); //Take input from user in the form of float
                System.out.println("Enter the third coordinate (x3,y3)");
                System.out.print("x3: ");
                float x3 = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("y3: ");
                float y3 = scanf.nextFloat(); //Take input from user in the form of float
                double side1 = SideCalculator(x1,y1,x2,y2); //Obtain the first side using the method SideCalculator
                double side2 = SideCalculator(x2,y2,x3,y3); //Obtain the second side using the method SideCalculator
                double side3 = SideCalculator(x3,y3,x1,y1); //Obtain the third side using the method SideCalculator
                double sides_sum = (side1 + side2 + side3) / 2;
                area = sides_sum * (sides_sum - side1) * (sides_sum - side2) * (sides_sum - side3);
                area = Math.pow(area, 0.5);
                area = Math.round(area * 10) / 10.0; //Adjust the decimal places
                System.out.println("The area of the triangle is " + area);
              break;
              case 20: //exercise 2.20
                System.out.print("Enter current balance: ");
                float balance = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("Enter the annual percentage interest rate: ");
                float annualRate = scanf.nextFloat(); //Take input from user in the form of float
                double interest = balance * (annualRate/1200);
                interest = Math.round(interest * 10000) / 10000.0; //Adjust the decimal places
                System.out.println("The interest for the next month is " + interest);
              break;
              case 21: //exercise 2.21
                System.out.print("Key in the investment amount: ");
                float investment = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("Key in the annual percentage interest: ");
                float percentageRate = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("Key in the number of years: ");
                years = scanf.nextInt(); //Take input from user in the form of integer
                percentageRate /= 100.0;
                percentageRate /= 12.0;
                years = years * NUMBER_OF_MONTHS;
                double powerRate = Math.pow((1 + percentageRate), years);
                double futureInvestmentValue = investment * powerRate;
                futureInvestmentValue = ((int) (futureInvestmentValue * 100)) / 100.0;
                System.out.println("The future investment value is: $" + futureInvestmentValue);
              break;
              case 22: //exercise 2.22
               // Receive the amount
               System.out.println("Enter an amount in cents, for example to enter $11.56 enter 1156");
               System.out.print("Your amount: ");
               int amount = scanf.nextInt(); //Take input from user in the form of integer
               System.out.println();
               System.out.println("Entered amount: $" + amount / 100 + "." + amount % 100);
               System.out.println("Meaning " + amount / 100 + " dollars and " + amount % 100 + " cents");
               System.out.println();
               int remainingAmount = amount;
               int numberOfOneDollars = remainingAmount / 100;
               remainingAmount = remainingAmount % 100;
               // Find the number of quarters in the remaining amount
               int numberOfQuarters = remainingAmount / 25;
               remainingAmount = remainingAmount % 25;
               // Find the number of dimes in the remaining amount
               int numberOfDimes = remainingAmount / 10;
               remainingAmount = remainingAmount % 10;
               // Find the number of nickels in the remaining amount
               int numberOfNickels = remainingAmount / 5;
               remainingAmount = remainingAmount % 5;
               // Find the number of pennies in the remaining amount
               int numberOfPennies = remainingAmount;
               // Display results
               System.out.println("Your amount in cent " + amount + " consists of");
               System.out.println(" " + numberOfOneDollars + " dollars");
               System.out.println(" " + numberOfQuarters + " quarters ");
               System.out.println(" " + numberOfDimes + " dimes");
               System.out.println(" " + numberOfNickels + " nickels");
               System.out.println(" " + numberOfPennies + " pennies");
              break;
              case 23: //exercise 2.23
                double tripCost;
                System.out.print("Enter the driving distance: ");
                distance = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("Enter miles per gallon: ");
                float efficiency = scanf.nextFloat(); //Take input from user in the form of float
                System.out.print("Enter price per gallon: ");
                float price = scanf.nextFloat(); //Take input from user in the form of float
                tripCost = (distance / efficiency) * price;
                tripCost = Math.round((tripCost * 100)) / 100.0; //Adjust the decimal places
                System.out.println("The cost of driving is: $" + tripCost);
              break;
              default:
                  System.out.println("Question "+option+" not implemented yet");
              }
          }
      }while(option != 0);
    }
    //Method for excercise 2.19
    public static double SideCalculator(float x1, float y1, float x2, float y2){
      double coord1 = Math.pow((x1 - x2), 2);
      double coord2 = Math.pow((y1 - y2), 2);
      double side = Math.pow((coord1 + coord2), 0.5);
      return side;
    }
}
